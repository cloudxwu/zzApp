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
        List<ReceiveDeviceDataEntity> dataList = This.receiveDeviceDataService.getCommandDataList(id);
    }

    /**
     * @api {get} /api/manage/device/location 获取所有设备的最新位置信息
     * @apiVersion 0.0.1
     * @apiName getAllDeviceLastLocation
     * @apiGroup deviceGroup
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/device/location", method = RequestMethod.GET)
    public ResultEntity getAllDeviceLastLocation() {
        List<ViewGetDeviceLastLocationEntity> deviceInfoEntityList = viewGetDeviceLastLocationService.findAll();
    }

    /**
     * @api {get} /api/manage/device 获取所有设备信息
     * @apiVersion 0.0.1
     * @apiName getAllDevice
     * @apiGroup deviceGroup
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/device", method = RequestMethod.GET)
    public ResultEntity getAllDevice() {
        List<ViewGetAllDeviceInfoEntity> deviceEntityList = viewGetAllDeviceInfoService.findAll();
    }

    /**
     * @api {post} /api/manage/device 创建新设备
     * @apiVersion 0.0.1
     * @apiName createDevice
     * @apiGroup deviceGroup
     *
     * @apiParam {String} imsi 手机卡IMSI
     * @apiParam {String} [uid] 自定义ID
     * @apiParam {String} [name] 设备名称
     * @apiParam {String} [serial_number] 设备序列号
     * @apiParam {Number} [type_id] 设备类型ID
     * @apiParam {Number} [status_id] 设备状态ID
     * @apiParam {Number} [user_id] 保管员用户ID
     * @apiParam {Number} [department_id] 设备所属部门ID
     * @apiParam {String} [comment] 设备说明
     * @apiParam {Number} [keep_live_interval=60] 设备心跳间隔（单位：秒）
     * @apiParam {Number} [battery_sleep_time=180] 电源供电时的休眠时间（单位：分钟）
     * @apiParam {Number} [battery_keep_live_time=300] 电池供电时心跳包发送后保持连接的时间（单位：秒）
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/device", method = RequestMethod.POST)
    public ResultEntity createDevice(String imsi, String uid, String name, String serialNumber, long typeId, long statusId, long userId, long departmentId, String comment, int keepLiveInterval, int batterySleepTime, int batteryKeepLiveTime) throws UnknownHostException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<DeviceEntity> deviceEntityList = deviceService.findDeviceByImsi(imsi);
        DeviceCmdEntity deviceCmdEntity = new DeviceCmdEntity();
        if (deviceEntityList.size() > 0) 
        {
            return This.createResultEntity(ResultEntity.DATA_IS_EXIST, objectMapper.convertValue(deviceEntityList.get(0), JsonNode.class));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        DeviceEntity deviceEntity = new DeviceEntity();
        deviceEntity.setImsi(imsi);
        deviceEntity.setIsDelete(FlagEntity.NO_DELETE);
        deviceEntity.setCreateTime(simpleDateFormat.format(new Date()));
        deviceEntity.setKeepLiveInterval(keepLiveInterval);
        deviceEntity.setBatterySleepTime(batterySleepTime);
        deviceEntity.setBatteryKeepLiveTime(batteryKeepLiveTime);
        if (!uid.isEmpty()) 
        {
            deviceEntity.setUid(uid);
        }
        if (!name.isEmpty()) 
        {
            deviceEntity.setName(name);
            deviceCmdEntity.setSetDeviceName(name);
        }
        if (!serialNumber.isEmpty()) 
        {
            deviceEntity.setSerialNumber(serialNumber);
        }
        if (typeId > 0) 
        {
            deviceEntity.setTypeId(typeId);
        }
    }

    /**
     * @api {post} /api/manage/device/command 向设备添加通用指令
     * @apiVersion 0.0.1
     * @apiName createCommand
     * @apiGroup deviceGroup
     *
     * @apiParam {Number} id 设备ID
     * @apiParam {String} command  指令内容
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/device/command", method = RequestMethod.POST)
    public ResultEntity createCommand(long id, String command) {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        DeviceCmdEntity deviceCmdEntity = new DeviceCmdEntity();
        DeviceEntity entity = deviceService.findById(id);
        if (entity == null) 
        {
            return This.createResultEntity(ResultEntity.NOT_FIND_ERROR);
        }
    }

}
