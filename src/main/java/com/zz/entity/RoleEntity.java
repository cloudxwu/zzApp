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
    }

}
