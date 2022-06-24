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

}
