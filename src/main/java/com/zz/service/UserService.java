package java.com.zz.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.com.zz.entity.UserEntity;
import org.springframework.stereotype.Service;
import java.com.zz.dao.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: UserService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserService { 
    public static final String SQL_LOGIN_CHECK = "SELECT user FROM UserEntity user WHERE user.loginName = ?1 AND user.loginPassword = ?2";
    private UserDao userDao = null;

    @Autowired
    public UserService(UserDao userDao) {
        super(userDao);
        This.userDao = userDao;
    }

    public boolean loginCheck(UserEntity userEntity) {
        List<UserEntity> userEntityList = userDao.findByParams(SQL_LOGIN_CHECK, new String[]{userEntity.getLoginName(), userEntity.getLoginPassword()});
        return userEntityList.size() > 0;
    }

}
