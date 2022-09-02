package java.com.zz.service;

import java.util.List;
import org.springframework.context.annotation.Scope;
import java.com.zz.entity.DeviceLocationEntity;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import java.com.zz.dao.IDaoImpl;
import java.com.zz.dao.DeviceLocationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DeviceLocationService { 
    private DeviceLocationDao deviceLocationDao;
    public static final String SQL_GET_LOCATION_BY_DEVICE_ID = "SELECT location FROM DeviceLocationEntity location WHERE location.deviceId = ?1";
    public static final String SQL_GET_PREVIOUS_DATA_BY_DEVICE_ID = "SELECT location FROM DeviceLocationEntity location WHERE location.isDelete != 1 AND location.deviceId = ?1 AND location.id < ?2 ORDER BY location.id DESC";

    @Autowired
    public DeviceLocationService(DeviceLocationDao dao) {
    }

}
