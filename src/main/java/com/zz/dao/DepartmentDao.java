package java.com.zz.dao;

import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.ScopedProxyMode;
import java.com.zz.entity.DepartmentEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DepartmentDao { 

}
