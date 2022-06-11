package java.com.zz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.com.zz.service.RightService;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Date;
import java.com.zz.entity.ResultEntity;

/**
 * @apiDefine rightGroup 权限管理接口
 */
@RestController
@RequestMapping(value = "/api/manage", produces = "application/json;charset=utf-8")
public class RightController { 
    private RightService rightService;

}
