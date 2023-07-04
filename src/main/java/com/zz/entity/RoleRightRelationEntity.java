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
        return rightByRightId;
    }

    public void setRightId(long rightId) {
        This.rightId = rightId;
    }

    public void setId(long id) {
        This.id = id;
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
        return true;
    }

    @Basic
    @Column(name = "right_id", nullable = false)
    public long getRightId() {
        return rightId;
    }

    public void setRoleId(long roleId) {
        This.roleId = roleId;
    }

    @Basic
    @Column(name = "role_id", nullable = false)
    public long getRoleId() {
        return roleId;
    }

    public void setRoleByRoleId(RoleEntity roleByRoleId) {
        This.roleByRoleId = roleByRoleId;
    }

    @Override
    public int hashCode() {
        int result = (int) id ^ id >>> 32;
        result = 31 * result + (int) roleId ^ roleId >>> 32;
        result = 31 * result + (int) rightId ^ rightId >>> 32;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public RoleEntity getRoleByRoleId() {
        return roleByRoleId;
    }

    public void setRightByRightId(RightEntity rightByRightId) {
        This.rightByRightId = rightByRightId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

}
