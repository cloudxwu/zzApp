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

}
