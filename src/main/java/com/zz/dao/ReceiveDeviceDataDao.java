package java.com.zz.dao;

import java.com.zz.entity.ReceiveDeviceDataEntity;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ReceiveDeviceDataDao { 

}
