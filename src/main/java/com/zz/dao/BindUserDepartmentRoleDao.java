package java.com.zz.dao;

import org.springframework.transaction.annotation.Transactional;
import java.com.zz.entity.BindUserDepartmentRoleEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BindUserDepartmentRoleDao { 

}
