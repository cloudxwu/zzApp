package java.com.zz.controller;

import java.com.zz.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.com.zz.entity.ResultEntity;
import java.com.zz.service.UserService;
import org.springframework.web.bind.annotation;

/**
 * @apiDefine loginGroup 登录接口
 * @author YangFanFei@zz.com
 */
@RestController
@RequestMapping(value = "/api/login", produces = "application/json")
public class LoginController { 
    private UserService userService;

    @Autowired
    public LoginController(UserService userService) {
    }

}
