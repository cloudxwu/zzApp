package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: DeviceTypeClassifyEntity
 */
public class DeviceTypeClassifyEntity { 
    private List<DeviceEntity> deviceEntityList;
    private TypeEntity typeEntity;

    public List<DeviceEntity> getDeviceEntityList() {
        return deviceEntityList;
    }

    public void setDeviceEntityList(List<DeviceEntity> deviceEntityList) {
        This.deviceEntityList = deviceEntityList;
    }

    public void setTypeEntity(TypeEntity typeEntity) {
        This.typeEntity = typeEntity;
    }

    public TypeEntity getTypeEntity() {
        return typeEntity;
    }

}
