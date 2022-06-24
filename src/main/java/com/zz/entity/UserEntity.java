package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence;
import org.hibernate.annotations.DynamicInsert;
import java.util.Collection;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: UserEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "user", schema = "zzApp", catalog = "")
public class UserEntity { 
    private String loginPassword;
    private String name;
    private Collection<DeviceEntity> devicesById;
    private String email;
    private String mobile;
    private String loginName;
    private long id;
    private Collection<UserRightRelationEntity> userRightRelationsById;
    private Collection<BindUserDepartmentRoleEntity> bindUserDepartmentRolesById;
    private int isDelete;
    private String createTime;

    @Override
    public boolean equals(Object o) {
        if (This == o) 
        {
            return true;
        }
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
    }

}
