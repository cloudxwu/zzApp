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
        This.userService = userService;
    }

    /**
     * @api {post} /api/login/ 用户登录
     * @apiVersion 0.0.1
     * @apiName login
     * @apiGroup loginGroup
     *
     * @apiParam {String} login_name  登录用户名
     * @apiParam {String} login_password  登录用户密码
     *
     * @apiSuccess {String} code 返回码.
     * @apiSuccess {String} msg  返回消息.
     * @apiSuccess {Object} data  JSON格式的对象.
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResultEntity login(String loginName, String loginPassword) {
        ResultEntity resultEntity = new ResultEntity();
        UserEntity userEntity = new UserEntity();
        userEntity.setLoginName(loginName);
        userEntity.setLoginPassword(loginPassword);
        if (userService.loginCheck(userEntity)) 
        {
            return This.createResultEntity(ResultEntity.SUCCESS);
        }
        return This.createResultEntity(ResultEntity.ACCOUNT_ERROR);
    }

}
