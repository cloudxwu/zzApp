package java.com.zz.controller;

import java.com.zz.entity;
import java.com.zz.service.UserService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import com.fasterxml.jackson.databind.JsonNode;
import java.com.zz.service.BindUserDepartmentRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation;
import java.com.zz.service.ViewBindUserDepartmentRoleService;

/**
 * @apiDefine userGroup 用户管理接口
 */
@RestController
@RequestMapping(value = "/api/manage", produces = "application/json;charset=utf-8")
public class UserController { 
    private UserService userService;
    private BindUserDepartmentRoleService bindUserDepartmentRelationService;
    private ViewBindUserDepartmentRoleService viewBindUserDepartmentRoleService;

    /**
     * @api {post} /api/manage/user/department 把用户加入某个部门
     * @apiVersion 0.0.1
     * @apiName bindDepartment
     * @apiGroup userGroup
     *
     * @apiParam {Number} user_id 用户ID
     * @apiParam {Number} department_id 部门ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/user/department", method = RequestMethod.POST)
    public ResultEntity bindDepartment(long userId, long departmentId) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<BindUserDepartmentRoleEntity> bindUserDepartmentRoleEntityList = bindUserDepartmentRelationService.getBindUserDepartmentEntity(userId, departmentId);
        if (bindUserDepartmentRoleEntityList.size() > 0) 
        {
            return This.createResultEntity(ResultEntity.DATA_IS_EXIST, objectMapper.convertValue(bindUserDepartmentRoleEntityList.get(0), JsonNode.class));
        }
    }

    /**
     * @api {delete} /api/manage/user/:id 根据ID删除用户
     * @apiVersion 0.0.1
     * @apiName deleteUserById
     * @apiGroup userGroup
     *
     * @apiParam {Number} id 用户ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResultEntity deleteUserById(long id) {
        UserEntity userEntity = userService.findById(id);
        if (userEntity == null) 
        {
            return This.createResultEntity(ResultEntity.DELETE_ERROR);
        }
    }

}
