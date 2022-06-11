package java.com.zz.service;

import java.com.zz.entity.TypeEntity;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.com.zz.dao.TypeDao;
import org.springframework.context.annotation.Scope;

/**
 * @author YangFanFei@zz.com
 * @ClassName: TypeService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TypeService { 
    private TypeDao dao;

}
