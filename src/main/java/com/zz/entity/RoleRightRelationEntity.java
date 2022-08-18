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

}
