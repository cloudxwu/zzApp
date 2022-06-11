package java.com.zz.service;

import org.springframework.context.annotation.ScopedProxyMode;
import java.com.zz.entity.ReceiveDeviceDataEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import java.com.zz.dao.ReceiveDeviceDataDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ReceiveDeviceDataService { 
    public static final String SQL_FIND_COMMAND_BY_DEVICE = "SELECT receive FROM ReceiveDeviceDataEntity receive WHERE receive.deviceId = ?1 AND receive.isRead = 0 ORDER BY receive.createTime ASC";
    private ReceiveDeviceDataDao dao;

}
