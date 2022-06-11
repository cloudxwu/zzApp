package java.com.zz.dao;

import org.springframework.stereotype.Repository;
import java.com.zz.entity.ViewGetAllDeviceInfoEntity;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.Scope;

@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ViewGetAllDeviceInfoDao { 

}
