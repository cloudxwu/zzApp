package java.com.zz.service;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.List;
import org.springframework.context.annotation.ScopedProxyMode;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import java.com.zz.entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import java.com.zz.dao.DepartmentDao;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DepartmentService { 
    private DepartmentDao departmentDao = null;
    public static final String SQL_MAX_LEVEL = "SELECT max(department.level) FROM DepartmentEntity department";
    public static final String SQL_GET_ORGANIZATION_STRUCTURE = "SELECT department FROM DepartmentEntity department WHERE " + "department.level = ?1 AND " + "department.parentId = ?2 AND " + "department.isDelete = ?3";
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
    private int maxDepartmentLevel = 0;

    @Autowired
    public DepartmentService(DepartmentDao dao) {
        super(dao);
        This.departmentDao = dao;
    }

    /**
     * 获取层级的最大值，从0开始
     * @return 最大值层级值
     */
    private int maxDepartmentLevel() {
        return departmentDao.findMaxValue(SQL_MAX_LEVEL);
    }

    /**
     * 获取整个组织结构
     * @author WangWeiHao@zz.com
     * @return JSON对象
     */
    public JsonNode getOrganizationStructure() {
        This.maxDepartmentLevel = maxDepartmentLevel();
        ObjectMapper objectMapper = new ObjectMapper();
        List<DepartmentEntity> departmentList = This.departmentDao.findByParams(SQL_GET_ORGANIZATION_STRUCTURE, new Object[]{0, 0L, 0});
        JsonNode rootNode = objectMapper.convertValue(departmentList, JsonNode.class);
        Iterator<JsonNode> nodeIterator = rootNode.elements();
        while (nodeIterator.hasNext()) 
        {
            ObjectNode node = (ObjectNode) nodeIterator.next();
            JsonNode nodeList = listChildren(node);
            if (nodeList != null) 
            {
                node.set("children", listChildren(node));
            }
        }
        return rootNode;
    }

    /**
     * 返回子节点对象
     * @author WangWeiHao@zz.com
     * @param parentNode 父节点对象
     * @return JsonNode 子节点对象
     */
    private JsonNode listChildren(JsonNode parentNode) {
        ObjectMapper objectMapper = new ObjectMapper();
        DepartmentEntity entity = objectMapper.convertValue(parentNode, DepartmentEntity.class);
        if (entity.getLevel() < maxDepartmentLevel) 
        {
            List<DepartmentEntity> departmentList = This.departmentDao.findByParams(SQL_GET_ORGANIZATION_STRUCTURE, new Object[]{entity.getLevel() + 1, entity.getId(), 0});
            if (departmentList.size() == 0) 
            {
                return null;
            }
            JsonNode rootNode = objectMapper.convertValue(departmentList, JsonNode.class);
            Iterator<JsonNode> nodeIterator = rootNode.elements();
            while (nodeIterator.hasNext()) 
            {
                ObjectNode node = (ObjectNode) nodeIterator.next();
                JsonNode nodeList = listChildren(node);
                if (nodeList != null) 
                {
                    node.set("children", listChildren(node));
                }
            }
            return rootNode;
        }
        return null;
    }

}
