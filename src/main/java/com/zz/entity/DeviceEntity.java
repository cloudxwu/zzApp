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
        if (This == o) 
        {
            return true;
        }
        if (o == null || getClass() != o.getClass()) 
        {
            return false;
        }
    }

    @OneToMany(mappedBy = "deviceByDeviceId")
    public Collection<DeviceCmdEntity> getDeviceCmdsById() {
    }

    public void setDepartmentByDepartmentId(DepartmentEntity departmentByDepartmentId) {
    }

    public void setDeviceCmdsById(Collection<DeviceCmdEntity> deviceCmdsById) {
    }

    public void setTypeByTypeId(TypeEntity typeByTypeId) {
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    public UserEntity getUserByUserId() {
    }

    public void setUserId(Long userId) {
    }

    @Basic
    @Column(name = "uid", nullable = true, length = 45)
    public String getUid() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
    }

    public void setUserByUserId(UserEntity userByUserId) {
    }

    @Basic
    @Column(name = "server_ip", nullable = false)
    public String getServerIp() {
    }

    public void setDepartmentId(Long departmentId) {
    }

    @Basic
    @Column(name = "department_id", nullable = true)
    public Long getDepartmentId() {
    }

    public void setBatteryKeepLiveTime(int batteryKeepLiveTime) {
    }

    public void setTypeId(Long typeId) {
    }

    @Basic
    @Column(name = "is_delete", nullable = false)
    public int getIsDelete() {
    }

    public void setImsi(String imsi) {
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 200)
    public String getComment() {
    }

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id", insertable = false, updatable = false)
    public TypeEntity getTypeByTypeId() {
    }

    public void setBatterySleepTime(int batterySleepTime) {
    }

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id", insertable = false, updatable = false)
    public DepartmentEntity getDepartmentByDepartmentId() {
    }

    @Basic
    @Column(name = "serial_number", nullable = true, length = 200)
    public String getSerialNumber() {
    }

    public void setDeviceLocationsById(Collection<DeviceLocationEntity> deviceLocationsById) {
    }

}
