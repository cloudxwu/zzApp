package java.com.zz.service;

import java.util.List;
import org.springframework.stereotype.Service;
import java.com.zz.dao.IDaoImpl;
import java.com.zz.dao.DeviceDao;
import org.springframework.context.annotation.Scope;
import java.com.zz.entity.DeviceEntity;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author YangFanFei@zz.com
 * @ClassName: DeviceService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DeviceService { 
    private static final String SQL_FIND_DEVICE_BY_TYPE = "SELECT device FROM DeviceEntity device WHERE device.typeId = ?1";
    private static final String SQL_FIND_DEVICE_BY_IMSI = "SELECT device FROM DeviceEntity device WHERE device.imsi = ?1";
    private static final String SQL_FIND_DEVICE_BY_TYPE_NULL = "SELECT device FROM DeviceEntity device WHERE device.typeId is null";
    private DeviceDao dao;

}
