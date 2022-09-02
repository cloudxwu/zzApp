package java.com.zz.controller;

import java.com.zz.entity.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.com.zz.service.RoleService;
import java.com.zz.entity.RoleEntity;
import java.text.SimpleDateFormat;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import java.com.zz.entity.FlagEntity;
import org.springframework.web.bind.annotation;
import java.util.TimeZone;
import java.util.Date;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @apiDefine roleGroup 角色管理接口
 */
@RestController
@RequestMapping(value = "/api/manage", produces = "application/json;charset=utf-8")
public class RoleController { 
    private RoleService roleService;

    /**
     * @api {delete} /api/manage/role/:id 根据ID删除角色
     * @apiVersion 0.0.1
     * @apiName deleteRoleById
     * @apiGroup roleGroup
     *
     * @apiParam {Number} id 角色ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/role/{id}", method = RequestMethod.DELETE)
    public ResultEntity deleteRoleById(long id) {
        RoleEntity roleEntity = roleService.findById(id);
        if (roleEntity == null) 
        {
            return This.createResultEntity(ResultEntity.DELETE_ERROR);
        }
    }

    /**
     * @api {post} /api/manage/role 创建角色
     * @apiVersion 0.0.1
     * @apiName createRole
     * @apiGroup roleGroup
     *
     * @apiParam {String} name 角色名称
     * @apiParam {String} [comment] 角色说明
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/role", method = RequestMethod.POST)
    public ResultEntity createRole(String name, String comment) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        RoleEntity roleEntity = new RoleEntity();
    }

}
