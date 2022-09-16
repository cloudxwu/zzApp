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

    public void setIsRead(int isRead) {
    }

    @Basic
    @Column(name = "is_read", nullable = false)
    public int getIsRead() {
    }

    @Basic
    @Column(name = "device_id", nullable = false)
    public long getDeviceId() {
    }

    public void setCreateTime(String createTime) {
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public String getCreateTime() {
    }

}
