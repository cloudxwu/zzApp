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

}
