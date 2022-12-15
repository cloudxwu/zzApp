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
    }

}
