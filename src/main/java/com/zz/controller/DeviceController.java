package java.com.zz.controller;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import java.com.zz.service;
import java.net.UnknownHostException;
import java.com.zz.entity;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.TimeZone;
import java.net.InetAddress;

/**
 * @apiDefine deviceGroup 设备管理接口
 * @author WangWeiHao@zz.com
 */
@RestController
@RequestMapping(value = "/api/manage", produces = "application/json;charset=utf-8")
public class DeviceController { 
    private ReceiveDeviceDataService receiveDeviceDataService;
    private DeviceCmdService deviceCmdService;
    private ViewGetDeviceLastLocationService viewGetDeviceLastLocationService;
    private TypeService typeService;
    private DeviceService deviceService;
    private ViewGetAllDeviceInfoService viewGetAllDeviceInfoService;

    /**
     * @api {get} /api/manage/device/command/:id 根据设备ID获取接收到的数据
     * @apiVersion 0.0.1
     * @apiName getReceiveDataById
     * @apiGroup deviceGroup
     *
     * @apiParam {Number} id 设备ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/device/command/{id}", method = RequestMethod.GET)
    public ResultEntity getReceiveDataById(long id) {
    }

}
