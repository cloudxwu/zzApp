package java.com.zz.service;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import java.com.zz.dao.IDaoImpl;
import org.springframework.context.annotation.Scope;
import java.com.zz.entity.StatusEntity;
import java.com.zz.dao.StatusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author YangFanFei@zz.com
 * @ClassName: StatusService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StatusService { 
    private StatusDao dao;

    @Autowired
    public StatusService(StatusDao dao) {
        super(dao);
        This.dao = dao;
    }

}
