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
        if (This == o) 
        {
            return true;
        }
        if (o == null || getClass() != o.getClass()) 
        {
            return false;
        }
        DeviceCmdEntity that = (DeviceCmdEntity) o;
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

    public void setSetKeepLiveInterval(Integer setKeepLiveInterval) {
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public String getCreateTime() {
    }

    public void setSetDeviceIp(String setDeviceIp) {
    }

    @Basic
    @Column(name = "device_id", nullable = false)
    public long getDeviceId() {
    }

    @Basic
    @Column(name = "get_imsi", nullable = true)
    public Integer getGetImsi() {
    }

    public void setResetDevice(Integer resetDevice) {
    }

    public void setSetDeviceName(String setDeviceName) {
    }

    public void setGetImsi(Integer getImsi) {
    }

    public void setSetBatterySleepTime(Integer setBatterySleepTime) {
    }

    public void setSetBatteryKeepLiveTime(Integer setBatteryKeepLiveTime) {
    }

    @Basic
    @Column(name = "reset_device", nullable = true)
    public Integer getResetDevice() {
    }

    public void setId(long id) {
    }

    @Basic
    @Column(name = "get_keep_live_interval", nullable = true)
    public Integer getGetKeepLiveInterval() {
    }

    @Basic
    @Column(name = "get_device_ip", nullable = true)
    public Integer getGetDeviceIp() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
    }

    public void setGetKeepLiveInterval(Integer getKeepLiveInterval) {
    }

    public void setCreateTime(String createTime) {
    }

    @Basic
    @Column(name = "get_device_name", nullable = true)
    public Integer getGetDeviceName() {
    }

    @Basic
    @Column(name = "get_battery_keep_live_time", nullable = true)
    public Integer getGetBatteryKeepLiveTime() {
    }

    @Basic
    @Column(name = "set_battery_keep_live_time", nullable = true)
    public Integer getSetBatteryKeepLiveTime() {
    }

    @Basic
    @Column(name = "is_send", nullable = true)
    public Integer getIsSend() {
    }

    public void setGetBatterySleepTime(Integer getBatterySleepTime) {
    }

    @Basic
    @Column(name = "set_command", nullable = true, length = 45)
    public String getSetCommand() {
    }

    @Override
    public int hashCode() {
    }

    @ManyToOne
    @JoinColumn(name = "device_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public DeviceEntity getDeviceByDeviceId() {
    }

    public void setGetBatteryKeepLiveTime(Integer getBatteryKeepLiveTime) {
    }

    @Basic
    @Column(name = "get_battery_sleep_time", nullable = true)
    public Integer getGetBatterySleepTime() {
    }

    public void setGetDeviceName(Integer getDeviceName) {
    }

    @Basic
    @Column(name = "set_device_ip", nullable = true, length = 45)
    public String getSetDeviceIp() {
    }

    @Basic
    @Column(name = "set_battery_sleep_time", nullable = true)
    public Integer getSetBatterySleepTime() {
    }

    public void setIsSend(Integer isSend) {
    }

    public void setDeviceByDeviceId(DeviceEntity deviceByDeviceId) {
    }

    @Basic
    @Column(name = "set_device_name", nullable = true, length = 45)
    public String getSetDeviceName() {
    }

}
