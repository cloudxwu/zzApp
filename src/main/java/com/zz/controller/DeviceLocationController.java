package java.com.zz.controller;

import sun.net.www.http.HttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import java.com.zz.entity;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import okhttp3.OkHttpClient;
import java.util;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation;
import java.text.SimpleDateFormat;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.com.zz.service.DeviceLocationService;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

/**
 * @apiDefine deviceLocationGroup 设备实时位置管理接口
 * @author WangWeiHao@zz.com
 */
@RestController
@RequestMapping(value = "/api/manage", produces = "application/json;charset=utf-8")
public class DeviceLocationController { 
    public static final String GECODE_CONVERT_URL = "https://restapi.amap.com/v3/geocode/regeo?key=f11511080fd76b66485b50902cb00a75&location=%s";
    private OkHttpClient httpClient = null;
    private DeviceLocationService deviceLocationService;
    public static final String WEATHER_CONVERT_URL = "http://v.juhe.cn/weather/geo?key=e0fca72351651e3c4e910ed848f57d0f&dtype=json&format=1&lon=%s&lat=%s";
    public static final String AGPS_CONVERT_URL = "http://api.gpsspg.com/bs/?oid=%s&key=9564xy0zx29yu427ywz50439u49uu16370yxx&type=%s&bs=%s&hex=%s&to=%s&output=%s";

    /**
     * @api {post} /api/manage/location 创建设备的实时位置
     * @apiVersion 0.0.1
     * @apiName createLocation
     * @apiGroup deviceLocationGroup
     *
     * @apiParam {Number} device_id 设备ID
     * @apiParam {String} device_time 设备记录时间
     * @apiParam {Number} signal_quality 当前网络信号
     * @apiParam {Number} device_on_off 设备开关机状态
     * @apiParam {Number} battery_voltage 设备电压
     * @apiParam {Number} [longitude] 设备位置经度
     * @apiParam {Number} [longitude_direction] 设备位置经度方向
     * @apiParam {Number} [latitude] 设备位置纬度
     * @apiParam {Number} [latitude_direction] 设备位置纬度方向
     * @apiParam {Number} [agps_station_num] AGPS基站数量
     * @apiParam {Number} [nation_num_1] 设备的AGPS国家号1
     * @apiParam {Number} [mobile_num_1] 设备的AGPS移动网络号1
     * @apiParam {Number} [location_num_1] 设备的AGPS位置区域号1
     * @apiParam {Number} [community_num_1] 设备的AGPS小区号1
     * @apiParam {Number} [station_flag_1] 设备的AGPS基站标识号1
     * @apiParam {Number} [signal_strength_1] 设备的AGPS信号强度1
     * @apiParam {Number} [nation_num_2] 设备的AGPS国家号2
     * @apiParam {Number} [mobile_num_2] 设备的AGPS移动网络号2
     * @apiParam {Number} [location_num_2] 设备的AGPS位置区域号2
     * @apiParam {Number} [community_num_2] 设备的AGPS小区号2
     * @apiParam {Number} [station_flag_2] 设备的AGPS基站标识号2
     * @apiParam {Number} [signal_strength_2] 设备的AGPS信号强度2
     * @apiParam {Number} [nation_num_3] 设备的AGPS国家号3
     * @apiParam {Number} [mobile_num_3] 设备的AGPS移动网络号3
     * @apiParam {Number} [location_num_3] 设备的AGPS位置区域号3
     * @apiParam {Number} [community_num_3] 设备的AGPS小区号3
     * @apiParam {Number} [station_flag_3] 设备的AGPS基站标识号3
     * @apiParam {Number} [signal_strength_3] 设备的AGPS信号强度3
     * @apiParam {Number} [nation_num_4] 设备的AGPS国家号4
     * @apiParam {Number} [mobile_num_4] 设备的AGPS移动网络号4
     * @apiParam {Number} [location_num_4] 设备的AGPS位置区域号4
     * @apiParam {Number} [community_num_4] 设备的AGPS小区号4
     * @apiParam {Number} [station_flag_4] 设备的AGPS基站标识号4
     * @apiParam {Number} [signal_strength_4] 设备的AGPS信号强度4
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/location", method = RequestMethod.POST)
    public ResultEntity createLocation(long deviceId, String deviceTime, int signalQuality, int deviceOnOff, float batteryVoltage, BigDecimal longitude, int longitudeDirection, BigDecimal latitude, int latitudeDirection, int agpsStationNum, int nationNum1, int mobileNum1, int locationNum1, int communityNum1, int stationFlag1, int signalStrength1, int nationNum2, int mobileNum2, int locationNum2, int communityNum2, int stationFlag2, int signalStrength2, int nationNum3, int mobileNum3, int locationNum3, int communityNum3, int stationFlag3, int signalStrength3, int nationNum4, int mobileNum4, int locationNum4, int communityNum4, int stationFlag4, int signalStrength4) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        DeviceLocationEntity deviceLocationEntity = new DeviceLocationEntity();
        deviceLocationEntity.setDeviceId(deviceId);
        deviceLocationEntity.setRecordTime(simpleDateFormat.format(new Date()));
        deviceLocationEntity.setDeviceTime(deviceTime);
    }

}
