package java.com.zz.config;

import java.com.zz.entity.DeviceLocationEntity;
import java.io.Serializable;
import org.hibernate.type.Type;
import org.hibernate.EmptyInterceptor;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: DeviceLocationInterceptor
 */
public class DeviceLocationInterceptor { 

    @Override
    public boolean onSave(Object entity, Serializable id, Object state, String propertyNames, Type types) {
        if (entity instanceof DeviceLocationEntity) 
        {
            System.out.println("=====DeviceLocationEntity=====");
        }
    }

}
