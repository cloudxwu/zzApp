package java.com.zz.service;

import java.com.zz.entity.DeviceCmdEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import java.com.zz.dao.DeviceCmdDao;
import java.com.zz.dao.IDaoImpl;

/**
 * @author YangFanFei@zz.com
 * @ClassName: DeviceCmdService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DeviceCmdService { 
    private DeviceCmdDao dao;

}
