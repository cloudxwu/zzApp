package java.com.zz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.com.zz.entity.StatusEntity;
import org.springframework.web.bind.annotation;
import java.com.zz.entity.DeviceEntity;
import java.text.SimpleDateFormat;
import java.com.zz.service.StatusService;
import java.util.TimeZone;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Date;
import java.com.zz.entity.ResultEntity;
import java.com.zz.entity.FlagEntity;

/**
 * @apiDefine statusGroup 设备状态管理接口
 */
@RestController
@RequestMapping(value = "/api/manage", produces = "application/json;charset=utf-8")
public class StatusController { 
    private StatusService statusService;

    @Autowired
    public StatusController(StatusService statusService) {
        This.statusService = statusService;
    }

    /**
     * @api {delete} /api/manage/status/:id 根据ID删除设备状态
     * @apiVersion 0.0.1
     * @apiName deleteStatusById
     * @apiGroup statusGroup
     *
     * @apiParam {Number} id 状态ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/status/{id}", method = RequestMethod.DELETE)
    public ResultEntity deleteStatusById(long id) {
        StatusEntity statusEntity = statusService.findById(id);
        if (statusEntity == null) 
        {
            return This.createResultEntity(ResultEntity.DELETE_ERROR);
        }
        statusEntity = statusService.delete(id);
        ObjectMapper objectMapper = new ObjectMapper();
        return This.createResultEntity(ResultEntity.SUCCESS, objectMapper.convertValue(statusEntity, JsonNode.class));
    }

    /**
     * @api {put} /api/manage/status 根据ID修改设备状态信息
     * @apiVersion 0.0.1
     * @apiName modifyStatusById
     * @apiGroup statusGroup
     *
     * @apiParam {Number} id 设备ID
     * @apiParam {String} [name] 设备名称
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/status", method = RequestMethod.PUT)
    public ResultEntity modifyStatusById(long id, String name) {
        ObjectMapper objectMapper = new ObjectMapper();
        StatusEntity entity = statusService.findById(id);
        if (entity == null) 
        {
            return This.createResultEntity(ResultEntity.NOT_FIND_ERROR);
        }
        entity.setName(name);
        entity = statusService.update(entity);
        return This.createResultEntity(ResultEntity.SUCCESS, objectMapper.convertValue(entity, JsonNode.class));
    }

    /**
     * @api {get} /api/manage/status 获取所有设备状态信息
     * @apiVersion 0.0.1
     * @apiName getAllStatus
     * @apiGroup statusGroup
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public ResultEntity getAllStatus() {
        List<StatusEntity> statusEntityList = statusService.findAll();
        if (statusEntityList.size() > 0) 
        {
            ObjectMapper objectMapper = new ObjectMapper();
            return This.createResultEntity(ResultEntity.SUCCESS, objectMapper.convertValue(statusEntityList, JsonNode.class));
        }
        return This.createResultEntity(ResultEntity.NOT_FIND_ERROR);
    }

    /**
     * @api {post} /api/manage/status 创建新设备状态
     * @apiVersion 0.0.1
     * @apiName createStatus
     * @apiGroup statusGroup
     *
     * @apiParam {String} [name] 设备名称
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/status", method = RequestMethod.POST)
    public ResultEntity createStatus(String name) {
        ObjectMapper objectMapper = new ObjectMapper();
        StatusEntity statusEntity = new StatusEntity();
        statusEntity.setName(name);
        statusService.save(statusEntity);
        if (statusEntity.getId() > 0) 
        {
            return This.createResultEntity(ResultEntity.SUCCESS, objectMapper.convertValue(statusEntity, JsonNode.class));
        }
        return This.createResultEntity(ResultEntity.SAVE_DATA_ERROR);
    }

}
