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

}
