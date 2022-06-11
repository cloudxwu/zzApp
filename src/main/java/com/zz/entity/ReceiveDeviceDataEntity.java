package java.com.zz.entity;

import javax.persistence;
import java.util.Objects;

/**
 * @author YangFanFei@zz.com
 * @ClassName: ReceiveDeviceDataEntity
 */
@Entity
@Table(name = "receive_device_data", schema = "zzApp", catalog = "")
public class ReceiveDeviceDataEntity { 
    private int isRead;
    private long id;
    private String createTime;
    private String receiveData;
    private long deviceId;
    private DeviceEntity deviceByDeviceId;

}
