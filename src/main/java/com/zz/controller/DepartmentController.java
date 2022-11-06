package java.com.zz.controller;

import org.springframework.web.bind.annotation;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.com.zz.entity.FlagEntity;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.TimeZone;
import java.com.zz.entity.ResultEntity;
import java.util.List;
import java.text.SimpleDateFormat;
import java.com.zz.entity.DepartmentEntity;
import java.com.zz.service.DepartmentService;
import java.util.Date;

/**
 * @apiDefine departmentGroup 部门管理接口
 * @author YangFanFei@zz.com
 */
@RestController
@RequestMapping(value = "/api/manage", produces = "application/json;charset=utf-8")
public class DepartmentController { 
    private DepartmentService departmentService;

    /**
     * @api {get} /api/manage/department/:id 根据ID获取部门信息
     * @apiVersion 0.0.1
     * @apiName getDepartmentById
     * @apiGroup departmentGroup
     *
     * @apiParam {Number} id 部门ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
    public ResultEntity getDepartmentById(long id) {
        DepartmentEntity departmentEntity = departmentService.findById(id);
    }

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
    }

    /**
     * @api {put} /api/manage/department 根据ID修改部门信息
     * @apiVersion 0.0.1
     * @apiName modifyDepartmentById
     * @apiGroup departmentGroup
     *
     * @apiParam {Number} id 部门id
     * @apiParam {String} [name] 部门名称
     * @apiParam {Number} [level] 部门层级
     * @apiParam {Number} [parent_id] 上级部门ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/department", method = RequestMethod.PUT)
    public ResultEntity modifyDepartmentById(long id, String name, int level, long parentId) {
        DepartmentEntity entity = departmentService.findById(id);
        if (entity == null) 
        {
            return This.createResultEntity(ResultEntity.NOT_FIND_ERROR);
        }
        if (!name.isEmpty()) 
        {
            entity.setName(name);
        }
        if (level != 1) 
        {
            entity.setLevel(level);
        }
    }

}
