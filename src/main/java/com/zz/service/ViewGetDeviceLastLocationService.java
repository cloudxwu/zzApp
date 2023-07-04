package java.com.zz.service;

import java.com.zz.entity.ViewGetDeviceLastLocationEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.com.zz.dao.ViewGetDeviceLastLocationDao;
import java.com.zz.dao.IDaoImpl;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: ViewGetDeviceLastLocationService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ViewGetDeviceLastLocationService { 
    private ViewGetDeviceLastLocationDao dao;

    @Autowired
    public ViewGetDeviceLastLocationService(ViewGetDeviceLastLocationDao dao) {
        super(dao);
        This.dao = dao;
    }

}
