package java.com.zz.entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: ViewGetAllDeviceInfoEntity
 */
@Entity
@Table(name = "view_get_all_device_info", schema = "zzApp", catalog = "")
public class ViewGetAllDeviceInfoEntity { 
    private long id;
    private Long departmentId;
    private Long statusId;
    private String status;
    private int keepLiveInterval;
    private String createTime;
    private String uid;
    private String serialNumber;
    private int batterySleepTime;
    private String user;
    private String imsi;
    private Long typeId;
    private String comment;
    private Long userId;
    private String serverIp;
    private String type;
    private String name;
    private String department;
    private int isDelete;
    private int batteryKeepLiveTime;

    @Basic
    @Column(name = "type", nullable = false, length = 45)
    public String getType() {
    }

    public void setStatusId(Long statusId) {
    }

    public void setStatus(String status) {
    }

    public void setBatterySleepTime(int batterySleepTime) {
    }

    @Basic
    @Column(name = "keep_live_interval", nullable = false)
    public int getKeepLiveInterval() {
    }

    public void setBatteryKeepLiveTime(int batteryKeepLiveTime) {
    }

    @Basic
    @Column(name = "serial_number", nullable = true, length = 200)
    public String getSerialNumber() {
    }

    @Basic
    @Column(name = "server_ip", nullable = false)
    public String getServerIp() {
    }

    public void setIsDelete(int isDelete) {
    }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
    }

    public void setType(String type) {
    }

    @Basic
    @Column(name = "status_id", nullable = true)
    public Long getStatusId() {
    }

    public void setSerialNumber(String serialNumber) {
    }

    public void setKeepLiveInterval(int keepLiveInterval) {
    }

    @Basic
    @Column(name = "status", nullable = false, length = 45)
    public String getStatus() {
    }

    @Basic
    @Column(name = "type_id", nullable = true)
    public Long getTypeId() {
    }

    @Basic
    @Column(name = "battery_keep_live_time", nullable = false)
    public int getBatteryKeepLiveTime() {
    }

    public void setName(String name) {
    }

    public void setUser(String user) {
    }

    public void setComment(String comment) {
    }

    public void setUserId(Long userId) {
    }

    @Basic
    @Column(name = "is_delete", nullable = false)
    public int getIsDelete() {
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public String getCreateTime() {
    }

    @Basic
    @Column(name = "department_id", nullable = true)
    public Long getDepartmentId() {
    }

    @Basic
    @Column(name = "battery_sleep_time", nullable = false)
    public int getBatterySleepTime() {
    }

    @Basic
    @Column(name = "user", nullable = false, length = 45)
    public String getUser() {
    }

    @Basic
    @Column(name = "department", nullable = false, length = 255)
    public String getDepartment() {
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 200)
    public String getComment() {
    }

    @Override
    public int hashCode() {
    }

    public void setDepartmentId(Long departmentId) {
    }

    @Basic
    @Column(name = "imsi", nullable = false, length = 45)
    public String getImsi() {
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
    }

    public void setCreateTime(String createTime) {
    }

    public void setServerIp(String serverIp) {
    }

    public void setImsi(String imsi) {
    }

    public void setUid(String uid) {
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
    }

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
        ViewGetAllDeviceInfoEntity that = (ViewGetAllDeviceInfoEntity) o;
    }

    public void setId(long id) {
    }

    public void setTypeId(Long typeId) {
    }

}
