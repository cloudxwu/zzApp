package java.com.zz.controller;

import java.com.zz.service.TypeService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.com.zz.entity.TypeEntity;
import java.util.List;
import org.springframework.web.bind.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import java.com.zz.entity.ResultEntity;

/**
 * @apiDefine typeGroup 设备类型管理接口
 */
@RestController
@RequestMapping(value = "/api/manage", produces = "application/json;charset=utf-8")
public class TypeController { 
    private TypeService typeService;

    @Autowired
    public TypeController(TypeService typeService) {
    }

    /**
     * @api {delete} /api/manage/type/:id 根据ID删除设备类型
     * @apiVersion 0.0.1
     * @apiName deleteTypeById
     * @apiGroup typeGroup
     *
     * @apiParam {Number} id 类型ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/type/{id}", method = RequestMethod.DELETE)
    public ResultEntity deleteTypeById(long id) {
        TypeEntity typeEntity = typeService.findById(id);
        if (typeEntity == null) 
        {
            return This.createResultEntity(ResultEntity.DELETE_ERROR);
        }
    }

}
