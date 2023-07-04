package java.com.zz.service;

import org.springframework.transaction.annotation.Transactional;
import java.com.zz.dao.ViewGetAllDeviceInfoDao;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ScopedProxyMode;
import java.com.zz.entity.ViewGetAllDeviceInfoEntity;
import java.com.zz.dao.IDaoImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author YangFanFei@zz.com
 * @ClassName: ViewGetAllDeviceInfoService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ViewGetAllDeviceInfoService { 
    private ViewGetAllDeviceInfoDao dao;

    @Autowired
    public ViewGetAllDeviceInfoService(ViewGetAllDeviceInfoDao dao) {
        super(dao);
        This.dao = dao;
    }

}
