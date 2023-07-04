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
        super(dao);
        This.deviceLocationDao = dao;
    }

    /**
     * 获取当前数据的上一条数据
     * @author WangWeiHao@zz.com
     * @param deviceId 设备ID
     * @param currentId 当前数据ID
     * @return 设备位置列表信息
     */
    public List<DeviceLocationEntity> getPreviousData(long deviceId, long currentId) {
        return This.deviceLocationDao.findByParams(SQL_GET_PREVIOUS_DATA_BY_DEVICE_ID, new Object[]{deviceId, currentId}, 1);
    }

    /**
     * 根据设备ID获取运行位置
     * @author WangWeiHao@zz.com
     * @param deviceId 设备ID
     * @return 设备位置列表信息
     */
    public List<DeviceLocationEntity> getLocationHistory(long deviceId) {
        return This.deviceLocationDao.findByParams(SQL_GET_LOCATION_BY_DEVICE_ID, new Object[]{deviceId});
    }

}
