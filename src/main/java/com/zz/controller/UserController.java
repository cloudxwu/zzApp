package java.com.zz.controller;

import java.com.zz.entity;
import java.com.zz.service.UserService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import com.fasterxml.jackson.databind.JsonNode;
import java.com.zz.service.BindUserDepartmentRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation;
import java.com.zz.service.ViewBindUserDepartmentRoleService;

/**
 * @apiDefine userGroup 用户管理接口
 */
@RestController
@RequestMapping(value = "/api/manage", produces = "application/json;charset=utf-8")
public class UserController { 
    private UserService userService;
    private BindUserDepartmentRoleService bindUserDepartmentRelationService;
    private ViewBindUserDepartmentRoleService viewBindUserDepartmentRoleService;

}
