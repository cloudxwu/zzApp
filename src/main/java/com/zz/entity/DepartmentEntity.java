package java.com.zz.entity;

import java.util.Collection;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author YangFanFei@zz.com
 * @ClassName: DepartmentEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "department", schema = "zzApp", catalog = "")
public class DepartmentEntity { 
    private Collection<DeviceEntity> devicesById;
    private int isDelete;
    private int level;
    private long id;
    private long parentId;
    private Collection<BindUserDepartmentRoleEntity> bindUserDepartmentRolesById;
    private String name;
    private String createTime;

    public void setDevicesById(Collection<DeviceEntity> devicesById) {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
    }

    public void setName(String name) {
    }

    public void setBindUserDepartmentRolesById(Collection<BindUserDepartmentRoleEntity> bindUserDepartmentRolesById) {
    }

    @Basic
    @Column(name = "level", nullable = false)
    public int getLevel() {
    }

    @OneToMany(mappedBy = "departmentByDepartmentId")
    public Collection<BindUserDepartmentRoleEntity> getBindUserDepartmentRolesById() {
    }

}
