package java.com.zz.dao;

import java.com.zz.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserDao { 

}
