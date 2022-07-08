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
    }

    @OneToMany(mappedBy = "rightByRightId")
    public Collection<RoleRightRelationEntity> getRoleRightRelationsById() {
    }

}
