package java.com.zz.service;

import java.com.zz.dao.RightDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.ScopedProxyMode;
import java.com.zz.entity.RightEntity;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

/**
 * @author YangFanFei@zz.com
 * @ClassName: RightService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RightService { 
    private RightDao dao;

}
