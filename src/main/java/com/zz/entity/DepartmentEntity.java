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
        DepartmentEntity that = (DepartmentEntity) o;
        if (id != that.id) 
        {
            return false;
        }
        if (level != that.level) 
        {
            return false;
        }
        if (isDelete != that.isDelete) 
        {
            return false;
        }
        if (parentId != that.parentId) 
        {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) 
        {
            return false;
        }
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) 
        {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = (int) id ^ id >>> 32;
        result = 31 * result + name != null ? name.hashCode() : 0;
        result = 31 * result + level;
        result = 31 * result + createTime != null ? createTime.hashCode() : 0;
        result = 31 * result + isDelete;
        result = 31 * result + (int) parentId ^ parentId >>> 32;
    }

    public void setParentId(long parentId) {
    }

    @Basic
    @Column(name = "is_delete", nullable = false)
    public int getIsDelete() {
    }

    public void setIsDelete(int isDelete) {
    }

    public void setId(long id) {
    }

    public void setLevel(int level) {
    }

    public void setCreateTime(String createTime) {
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
    }

    @OneToMany(mappedBy = "departmentByDepartmentId")
    public Collection<DeviceEntity> getDevicesById() {
    }

}
