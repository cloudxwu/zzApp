package java.com.zz.entity;

import java.util.Objects;
import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence;
import java.util.Collection;

/**
 * @author YangFanFei@zz.com
 * @ClassName: DeviceEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "device", schema = "zzApp", catalog = "")
public class DeviceEntity { 
    private Long statusId;
    private String uid;
    private long id;
    private Long userId;
    private Long departmentId;
    private DepartmentEntity departmentByDepartmentId;
    private String name;
    private String serverIp;
    private int isDelete;
    private int batterySleepTime;
    private TypeEntity typeByTypeId;
    private Collection<DeviceCmdEntity> deviceCmdsById;
    private Long typeId;
    private int keepLiveInterval;
    private String createTime;
    private String serialNumber;
    private String comment;
    private UserEntity userByUserId;
    private int batteryKeepLiveTime;
    private StatusEntity statusByStatusId;
    private Collection<DeviceLocationEntity> deviceLocationsById;
    private String imsi;

    public void setName(String name) {
    }

    @Basic
    @Column(name = "keep_live_interval", nullable = false)
    public int getKeepLiveInterval() {
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
    }

    public void setUid(String uid) {
    }

    public void setStatusId(Long statusId) {
    }

    @Override
    public boolean equals(Object o) {
    }

}
