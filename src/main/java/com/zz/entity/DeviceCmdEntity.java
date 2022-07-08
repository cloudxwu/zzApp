package java.com.zz.entity;

import java.util.Objects;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence;
import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: DeviceCmdEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "device_cmd", schema = "zzApp", catalog = "")
public class DeviceCmdEntity { 
    private Integer resetDevice;
    private long id;
    private String setDeviceName;
    private Integer getImsi;
    private String sendTime;
    private Integer setBatteryKeepLiveTime;
    private String setCommand;
    private Integer getDeviceIp;
    private Integer setBatterySleepTime;
    private String createTime;
    private Integer getDeviceName;
    private DeviceEntity deviceByDeviceId;
    private long deviceId;
    private Integer isSend;
    private String setDeviceIp;
    private Integer setKeepLiveInterval;
    private Integer getKeepLiveInterval;
    private Integer getBatteryKeepLiveTime;
    private Integer getBatterySleepTime;

    @Override
    public boolean equals(Object o) {
    }

    public void setDeviceId(long deviceId) {
    }

    public void setGetDeviceIp(Integer getDeviceIp) {
    }

    @Basic
    @Column(name = "send_time", nullable = true)
    public String getSendTime() {
    }

    public void setSetCommand(String setCommand) {
    }

}
