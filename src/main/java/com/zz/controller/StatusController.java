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

}
