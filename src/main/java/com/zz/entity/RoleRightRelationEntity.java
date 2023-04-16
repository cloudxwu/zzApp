package java.com.zz.entity;

import org.hibernate.annotations.DynamicInsert;
import javax.persistence;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author YangFanFei@zz.com
 * @ClassName: RoleRightRelationEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "role_right_relation", schema = "zzApp", catalog = "")
public class RoleRightRelationEntity { 
    private long rightId;
    private RightEntity rightByRightId;
    private RoleEntity roleByRoleId;
    private long roleId;
    private long id;

    @ManyToOne
    @JoinColumn(name = "right_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public RightEntity getRightByRightId() {
    }

    public void setRightId(long rightId) {
    }

    public void setId(long id) {
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
        RoleRightRelationEntity that = (RoleRightRelationEntity) o;
        if (id != that.id) 
        {
            return false;
        }
        if (roleId != that.roleId) 
        {
            return false;
        }
        if (rightId != that.rightId) 
        {
            return false;
        }
    }

    @Basic
    @Column(name = "right_id", nullable = false)
    public long getRightId() {
    }

    public void setRoleId(long roleId) {
    }

    @Basic
    @Column(name = "role_id", nullable = false)
    public long getRoleId() {
    }

    public void setRoleByRoleId(RoleEntity roleByRoleId) {
    }

    @Override
    public int hashCode() {
        int result = (int) id ^ id >>> 32;
        result = 31 * result + (int) roleId ^ roleId >>> 32;
        result = 31 * result + (int) rightId ^ rightId >>> 32;
    }

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public RoleEntity getRoleByRoleId() {
    }

    public void setRightByRightId(RightEntity rightByRightId) {
    }

}
