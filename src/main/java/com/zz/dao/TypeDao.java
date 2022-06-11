package java.com.zz.dao;

import java.com.zz.entity.TypeEntity;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.Scope;

@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TypeDao { 

}
