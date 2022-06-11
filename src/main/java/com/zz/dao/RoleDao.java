package java.com.zz.dao;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Scope;
import java.com.zz.entity.RoleEntity;

@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RoleDao { 

}
