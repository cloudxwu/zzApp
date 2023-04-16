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
        deviceLocationEntity.setSignalQuality(signalQuality);
        deviceLocationEntity.setDeviceOnOff(deviceOnOff);
        deviceLocationEntity.setBatteryVoltage(batteryVoltage);
        if (longitude.compareTo(new BigDecimal(0)) > 0) 
        {
            deviceLocationEntity.setLongitude(longitude);
        }
        if (longitudeDirection > 0) 
        {
            deviceLocationEntity.setLongitudeDirection(longitudeDirection);
        }
        if (latitude.compareTo(new BigDecimal(0)) > 0) 
        {
            deviceLocationEntity.setLatitude(latitude);
        }
        if (latitudeDirection > 0) 
        {
            deviceLocationEntity.setLatitudeDirection(latitudeDirection);
        }
        if (agpsStationNum > 0) 
        {
            deviceLocationEntity.setAgpsStationNum(agpsStationNum);
            String agps = "";
            if (nationNum1 >= 0 && mobileNum1 >= 0 && locationNum1 >= 0 && communityNum1 >= 0 && stationFlag1 >= 0 && signalStrength1 >= 0) 
            {
                deviceLocationEntity.setNationNum1(nationNum1);
                deviceLocationEntity.setMobileNum1(mobileNum1);
                deviceLocationEntity.setLocationNum1(locationNum1);
                deviceLocationEntity.setCommunityNum1(communityNum1);
                deviceLocationEntity.setStationFlag1(stationFlag1);
                deviceLocationEntity.setSignalStrength1(signalStrength1);
                agps += nationNum1 + ",";
                agps += String.format("%02d", mobileNum1) + ",";
                agps += locationNum1 + ",";
                agps += communityNum1 + ",";
                agps += signalStrength1 * 1;
            }
            if (nationNum2 >= 0 && mobileNum2 >= 0 && locationNum2 >= 0 && communityNum2 >= 0 && stationFlag2 >= 0 && signalStrength2 >= 0) 
            {
                deviceLocationEntity.setNationNum2(nationNum2);
                deviceLocationEntity.setMobileNum2(mobileNum2);
                deviceLocationEntity.setLocationNum2(locationNum2);
                deviceLocationEntity.setCommunityNum2(communityNum2);
                deviceLocationEntity.setStationFlag2(stationFlag2);
                deviceLocationEntity.setSignalStrength2(signalStrength2);
                agps += "|";
                agps += nationNum2 + ",";
                agps += String.format("%02d", mobileNum2) + ",";
                agps += locationNum2 + ",";
                agps += communityNum2 + ",";
                agps += signalStrength2 * 1;
            }
            if (nationNum3 >= 0 && mobileNum3 >= 0 && locationNum3 >= 0 && communityNum3 >= 0 && stationFlag3 >= 0 && signalStrength3 >= 0) 
            {
                deviceLocationEntity.setNationNum3(nationNum3);
                deviceLocationEntity.setMobileNum3(mobileNum3);
                deviceLocationEntity.setLocationNum3(locationNum3);
                deviceLocationEntity.setCommunityNum3(communityNum3);
                deviceLocationEntity.setStationFlag3(stationFlag3);
                deviceLocationEntity.setSignalStrength3(signalStrength3);
                agps += "|";
                agps += nationNum3 + ",";
                agps += String.format("%02d", mobileNum3) + ",";
                agps += locationNum3 + ",";
                agps += communityNum3 + ",";
                agps += signalStrength3 * 1;
            }
            if (nationNum4 >= 0 && mobileNum4 >= 0 && locationNum4 >= 0 && communityNum4 >= 0 && stationFlag4 >= 0 && signalStrength4 >= 0) 
            {
                deviceLocationEntity.setNationNum4(nationNum4);
                deviceLocationEntity.setMobileNum4(mobileNum4);
                deviceLocationEntity.setLocationNum4(locationNum4);
                deviceLocationEntity.setCommunityNum4(communityNum4);
                deviceLocationEntity.setStationFlag4(stationFlag4);
                deviceLocationEntity.setSignalStrength4(signalStrength4);
                agps += "|";
                agps += nationNum4 + ",";
                agps += String.format("%02d", mobileNum4) + ",";
                agps += locationNum4 + ",";
                agps += communityNum4 + ",";
                agps += signalStrength4 * 1;
            }
            deviceLocationEntity.setIsDelete(0);
            String url = String.format(AGPS_CONVERT_URL, (Object) new String[]{"9620", "gsm", agps, "10", "2", "json"});
            Request request = new Request();
            Response response = httpClient.newCall(request).execute();
            String data = response.body().string();
            AGpsEntity aGpsEntity = objectMapper.readValue(data, AGpsEntity.class);
            if (aGpsEntity.getStatus() == 200) 
            {
                deviceLocationEntity.setLongitude(aGpsEntity.getLongitude());
                deviceLocationEntity.setLatitude(aGpsEntity.getLatitude());
                if (aGpsEntity.getLongitude().compareTo(new BigDecimal(0)) > 0) 
                {
                    deviceLocationEntity.setLongitudeDirection(1);
                }
                if (aGpsEntity.getLatitude().compareTo(new BigDecimal(0)) > 0) 
                {
                    deviceLocationEntity.setLatitudeDirection(1);
                }
            }
        }
        deviceLocationService.save(deviceLocationEntity);
        if (deviceLocationEntity.getId() > 0) 
        {
            return This.createResultEntity(ResultEntity.SUCCESS, objectMapper.convertValue(deviceLocationEntity, JsonNode.class));
        }
    }

    /**
     * @api {put} /api/manage/location 根据位置ID更新设备的实时位置
     * @apiVersion 0.0.1
     * @apiName updateDeviceLocationById
     * @apiGroup deviceLocationGroup
     *
     * @apiParam {Number} id 位置ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/location", method = RequestMethod.PUT)
    public ResultEntity updateDeviceLocationById(long id) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        DeviceLocationEntity locationEntity = deviceLocationService.findById(id);
        List<DeviceLocationEntity> lastEntityList = deviceLocationService.getPreviousData(locationEntity.getDeviceId(), id);
        if (lastEntityList.size() == 1) 
        {
            DeviceLocationEntity lastLocationEntity = lastEntityList.get(0);
            if (lastLocationEntity.getProvince() == null) 
            {
                String gecodeUrl = String.format(GECODE_CONVERT_URL, (Object) new String[]{lastLocationEntity.getLongitude().toString() + "," + lastLocationEntity.getLatitude()});
                Request request = new Request();
                String data = httpClient.newCall(request).execute().body().string();
                JsonNode geocodeNode = objectMapper.readTree(data);
                if (Integer.valueOf(geocodeNode.get("status").asText()) == 1) 
                {
                    String province = geocodeNode.get("regeocode").get("addressComponent").get("province").isArray() ? null : geocodeNode.get("regeocode").get("addressComponent").get("province").textValue();
                    String city = geocodeNode.get("regeocode").get("addressComponent").get("city").isArray() ? null : geocodeNode.get("regeocode").get("addressComponent").get("city").textValue();
                    String district = geocodeNode.get("regeocode").get("addressComponent").get("district").isArray() ? null : geocodeNode.get("regeocode").get("addressComponent").get("district").textValue();
                    if (province != null && city != null || district != null) 
                    {
                        lastLocationEntity.setProvince(province);
                        if (city == null && district != null) 
                        {
                            lastLocationEntity.setCity(district);
                        }
                        lastLocationEntity.setDistrict(district);
                        This.deviceLocationService.update(lastLocationEntity);
                    }
                }
            }
        }
        AGpsEntity aGpsEntity = null;
        if (locationEntity.getLongitude() == null && locationEntity.getLatitude() == null) 
        {
            String agps = StringUtils.EMPTY;
            if (locationEntity.getNationNum1() != null && locationEntity.getNationNum1() >= 0 && locationEntity.getMobileNum1() != null && locationEntity.getMobileNum1() >= 0 && locationEntity.getLocationNum1() != null && locationEntity.getLocationNum1() >= 0 && locationEntity.getCommunityNum1() != null && locationEntity.getCommunityNum1() >= 0 && locationEntity.getStationFlag1() != null && locationEntity.getStationFlag1() >= 0 && locationEntity.getSignalStrength1() != null && locationEntity.getSignalStrength1() >= 0) 
            {
                agps += locationEntity.getNationNum1() + ",";
                agps += String.format("%02d", locationEntity.getMobileNum1()) + ",";
                agps += locationEntity.getLocationNum1() + ",";
                agps += locationEntity.getCommunityNum1() + ",";
                agps += locationEntity.getSignalStrength1() * 1;
            }
            if (locationEntity.getNationNum2() != null && locationEntity.getNationNum2() >= 0 && locationEntity.getMobileNum2() != null && locationEntity.getMobileNum2() >= 0 && locationEntity.getLocationNum2() != null && locationEntity.getLocationNum2() >= 0 && locationEntity.getCommunityNum2() != null && locationEntity.getCommunityNum2() >= 0 && locationEntity.getStationFlag2() != null && locationEntity.getStationFlag2() >= 0 && locationEntity.getSignalStrength2() != null && locationEntity.getSignalStrength2() >= 0) 
            {
                agps += "|";
                agps += locationEntity.getNationNum2() + ",";
                agps += String.format("%02d", locationEntity.getMobileNum2()) + ",";
                agps += locationEntity.getLocationNum2() + ",";
                agps += locationEntity.getCommunityNum2() + ",";
                agps += locationEntity.getSignalStrength2() * 1;
            }
            if (locationEntity.getNationNum3() != null && locationEntity.getNationNum3() >= 0 && locationEntity.getMobileNum3() != null && locationEntity.getMobileNum3() >= 0 && locationEntity.getLocationNum3() != null && locationEntity.getLocationNum3() >= 0 && locationEntity.getCommunityNum3() != null && locationEntity.getCommunityNum3() >= 0 && locationEntity.getStationFlag3() != null && locationEntity.getStationFlag3() >= 0 && locationEntity.getSignalStrength3() != null && locationEntity.getSignalStrength3() >= 0) 
            {
                agps += "|";
                agps += locationEntity.getNationNum3() + ",";
                agps += String.format("%02d", locationEntity.getMobileNum3()) + ",";
                agps += locationEntity.getLocationNum3() + ",";
                agps += locationEntity.getCommunityNum3() + ",";
                agps += locationEntity.getSignalStrength3() * 1;
            }
            if (locationEntity.getNationNum4() != null && locationEntity.getNationNum4() >= 0 && locationEntity.getMobileNum4() != null && locationEntity.getMobileNum4() >= 0 && locationEntity.getLocationNum4() != null && locationEntity.getLocationNum4() >= 0 && locationEntity.getCommunityNum4() != null && locationEntity.getCommunityNum4() >= 0 && locationEntity.getStationFlag4() != null && locationEntity.getStationFlag4() >= 0 && locationEntity.getSignalStrength4() != null && locationEntity.getSignalStrength4() >= 0) 
            {
                agps += "|";
                agps += locationEntity.getNationNum4() + ",";
                agps += String.format("%02d", locationEntity.getMobileNum4()) + ",";
                agps += locationEntity.getLocationNum4() + ",";
                agps += locationEntity.getCommunityNum4() + ",";
                agps += locationEntity.getSignalStrength4() * 1;
            }
            String aGpsUrl = String.format(AGPS_CONVERT_URL, (Object) new String[]{"9628", "gsm", agps, "10", "2", "json"});
            Request request = new Request();
            String data = httpClient.newCall(request).execute().body().string();
            aGpsEntity = objectMapper.readValue(data, AGpsEntity.class);
        }
        if (aGpsEntity.getStatus() != 200) 
        {
            if (aGpsEntity.getStatus() != 702) 
            {
                locationEntity.setIsDelete(1);
                This.deviceLocationService.update(locationEntity);
            }
            System.out.println(String.format("Status = %d, Msg = %s", aGpsEntity.getStatus(), aGpsEntity.getMsg()));
            return This.createResultEntity(ResultEntity.SAVE_DATA_ERROR);
        }
        String gecodeUrl = String.format(GECODE_CONVERT_URL, (Object) new String[]{aGpsEntity.getLongitude().toString() + "," + aGpsEntity.getLatitude()});
        Request request = new Request();
        String data = httpClient.newCall(request).execute().body().string();
        JsonNode geocodeNode = objectMapper.readTree(data);
        if (Integer.valueOf(geocodeNode.get("status").asText()) != 1) 
        {
            locationEntity.setIsDelete(1);
            This.deviceLocationService.update(locationEntity);
            System.out.println(String.format("Status = %d, Msg = %s", aGpsEntity.getStatus(), aGpsEntity.getMsg()));
            return This.createResultEntity(ResultEntity.SAVE_DATA_ERROR);
        }
        String province = geocodeNode.get("regeocode").get("addressComponent").get("province").isArray() ? null : geocodeNode.get("regeocode").get("addressComponent").get("province").textValue();
        String city = geocodeNode.get("regeocode").get("addressComponent").get("city").isArray() ? null : geocodeNode.get("regeocode").get("addressComponent").get("city").textValue();
        String district = geocodeNode.get("regeocode").get("addressComponent").get("district").isArray() ? null : geocodeNode.get("regeocode").get("addressComponent").get("district").textValue();
        if (province == null || district == null) 
        {
            locationEntity.setIsDelete(1);
            This.deviceLocationService.update(locationEntity);
            return This.createResultEntity(ResultEntity.SAVE_DATA_ERROR);
        }
        if (city == null) 
        {
            city = district;
        }
        if (lastEntityList.size() > 0 && city.equals(lastEntityList.get(0).getCity()) || aGpsEntity.getResult() == null || locationEntity.getProvince() == null && locationEntity.getLongitude() != null) 
        {
            locationEntity.setProvince(province);
            locationEntity.setCity(city);
            locationEntity.setDistrict(district);
            if (locationEntity.getLongitude() == null) 
            {
                locationEntity.setLongitude(aGpsEntity.getLongitude());
                locationEntity.setLatitude(aGpsEntity.getLatitude());
                if (aGpsEntity.getLongitude().compareTo(new BigDecimal(0)) > 0) 
                {
                    locationEntity.setLongitudeDirection((int) 'E');
                }
                if (aGpsEntity.getLatitude().compareTo(new BigDecimal(0)) > 0) 
                {
                    locationEntity.setLatitudeDirection((int) 'N');
                }
            }
            String weatherUrl = String.format(WEATHER_CONVERT_URL, (Object) new String[]{aGpsEntity.getLongitude().toString(), aGpsEntity.getLatitude().toString()});
            Request weatherRequest = new Request();
            String weatherData = httpClient.newCall(weatherRequest).execute().body().string();
            JsonNode weatherNode = objectMapper.readTree(weatherData);
            if (weatherNode.findValue("resultcode").textValue().equals("200")) 
            {
                locationEntity.setTemp(weatherNode.findValue("temp").textValue());
                locationEntity.setHumidity(weatherNode.findValue("humidity").textValue());
            }
            locationEntity = deviceLocationService.update(locationEntity);
            return This.createResultEntity(ResultEntity.SUCCESS, objectMapper.convertValue(locationEntity, JsonNode.class));
        }
        List<String> cityList = new ArrayList<String>();
        Set<String> cityEquals = new HashSet<String>();
        for (aGpsEntity.getResult() : AGpsResultEntity resultEntity){
            String itemGecodeUrl = String.format(GECODE_CONVERT_URL, (Object) new String[]{resultEntity.getLng().toString() + "," + resultEntity.getLat().toString()});
            request = new Request();
            data = httpClient.newCall(request).execute().body().string();
            JsonNode itemGeocodeNode = objectMapper.readTree(data);
            String itemCity = itemGeocodeNode.get("regeocode").get("addressComponent").get("city").isArray() ? null : itemGeocodeNode.get("regeocode").get("addressComponent").get("city").textValue();
            if (itemCity == null) 
            {
                locationEntity.setIsDelete(1);
                This.deviceLocationService.update(locationEntity);
                System.out.println(String.format("Status = %d, Msg = %s", aGpsEntity.getStatus(), aGpsEntity.getMsg()));
                return This.createResultEntity(ResultEntity.SAVE_DATA_ERROR);
            }
        }
        if (cityEquals.size() != 1) 
        {
            locationEntity.setIsDelete(1);
            This.deviceLocationService.update(locationEntity);
            System.out.println(String.format("Status = %d, Msg = %s", aGpsEntity.getStatus(), aGpsEntity.getMsg()));
            return This.createResultEntity(ResultEntity.SAVE_DATA_ERROR);
        }
        locationEntity.setProvince(province);
        locationEntity.setCity(city);
        locationEntity.setDistrict(district);
        locationEntity.setLongitude(aGpsEntity.getLongitude());
        locationEntity.setLatitude(aGpsEntity.getLatitude());
        if (aGpsEntity.getLongitude().compareTo(new BigDecimal(0)) > 0) 
        {
            locationEntity.setLongitudeDirection((int) 'E');
        }
        if (aGpsEntity.getLatitude().compareTo(new BigDecimal(0)) > 0) 
        {
            locationEntity.setLatitudeDirection((int) 'N');
        }
        String weatherUrl = String.format(WEATHER_CONVERT_URL, (Object) new String[]{aGpsEntity.getLongitude().toString(), aGpsEntity.getLatitude().toString()});
        Request weatherRequest = new Request();
        String weatherData = httpClient.newCall(weatherRequest).execute().body().string();
        JsonNode weatherNode = objectMapper.readTree(weatherData);
        if (weatherNode.findValue("resultcode").textValue().equals("200")) 
        {
            locationEntity.setTemp(weatherNode.findValue("temp").textValue());
            locationEntity.setHumidity(weatherNode.findValue("humidity").textValue());
        }
    }

    /**
     * @api {get} /api/manage/location/:id 根据ID获取设备位置数据
     * @apiVersion 0.0.1
     * @apiName getDeviceLocationById
     * @apiGroup deviceLocationGroup
     *
     * @apiParam {Number} id 设备ID
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/location/{id}", method = RequestMethod.GET)
    public ResultEntity getDeviceLocationById(long id) {
        List<DeviceLocationEntity> deviceLocationEntityList = deviceLocationService.getLocationHistory(id);
        if (deviceLocationEntityList.size() > 0) 
        {
            ObjectMapper objectMapper = new ObjectMapper();
            return This.createResultEntity(ResultEntity.SUCCESS, objectMapper.convertValue(deviceLocationEntityList, JsonNode.class));
        }
    }

}
