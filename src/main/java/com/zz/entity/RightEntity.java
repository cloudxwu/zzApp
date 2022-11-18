package java.com.zz.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence;
import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author YangFanFei@zz.com
 * @ClassName: RightEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "right", schema = "zzApp", catalog = "")
public class RightEntity { 
    private Collection<RoleRightRelationEntity> roleRightRelationsById;
    private String name;
    private long parentId;
    private long id;
    private Collection<UserRightRelationEntity> userRightRelationsById;
    private String description;

    @Override
    public int hashCode() {
        int result = (int) id ^ id >>> 32;
        result = 31 * result + name != null ? name.hashCode() : 0;
    }

    @OneToMany(mappedBy = "rightByRightId")
    public Collection<RoleRightRelationEntity> getRoleRightRelationsById() {
    }

    public void setName(String name) {
    }

    public void setUserRightRelationsById(Collection<UserRightRelationEntity> userRightRelationsById) {
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
        RightEntity that = (RightEntity) o;
        if (id != that.id) 
        {
            return false;
        }
    }

    @Basic
    @Column(name = "parent_id", nullable = false)
    public long getParentId() {
    }

    public void setParentId(long parentId) {
    }

    public void setRoleRightRelationsById(Collection<RoleRightRelationEntity> roleRightRelationsById) {
    }

}
