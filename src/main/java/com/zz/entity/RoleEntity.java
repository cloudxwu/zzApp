package java.com.zz.entity;

import javax.persistence;
import org.hibernate.annotations.DynamicUpdate;
import java.util.Collection;
import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author YangFanFei@zz.com
 * @ClassName: RoleEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "role", schema = "zzApp", catalog = "")
public class RoleEntity { 
    private String createTime;
    private int isDelete;
    private String comment;
    private long id;
    private String name;
    private Collection<BindUserDepartmentRoleEntity> bindUserDepartmentRolesById;
    private Collection<RoleRightRelationEntity> roleRightRelationsById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public String getCreateTime() {
    }

    public void setCreateTime(String createTime) {
    }

    public void setIsDelete(int isDelete) {
    }

    @OneToMany(mappedBy = "roleByRoleId")
    public Collection<BindUserDepartmentRoleEntity> getBindUserDepartmentRolesById() {
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
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
        RoleEntity that = (RoleEntity) o;
        if (id != that.id) 
        {
            return false;
        }
        if (isDelete != that.isDelete) 
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
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) 
        {
            return false;
        }
    }

    public void setId(long id) {
    }

    @OneToMany(mappedBy = "roleByRoleId")
    public Collection<RoleRightRelationEntity> getRoleRightRelationsById() {
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 200)
    public String getComment() {
    }

    public void setRoleRightRelationsById(Collection<RoleRightRelationEntity> roleRightRelationsById) {
    }

    public void setName(String name) {
    }

    @Override
    public int hashCode() {
        int result = (int) id ^ id >>> 32;
        result = 31 * result + name != null ? name.hashCode() : 0;
        result = 31 * result + createTime != null ? createTime.hashCode() : 0;
        result = 31 * result + comment != null ? comment.hashCode() : 0;
        result = 31 * result + isDelete;
    }

    @Basic
    @Column(name = "is_delete", nullable = false)
    public int getIsDelete() {
    }

}
