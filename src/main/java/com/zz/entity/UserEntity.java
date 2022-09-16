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
        if (o == null || getClass() != o.getClass()) 
        {
            return false;
        }
        UserEntity that = (UserEntity) o;
        if (id != that.id) 
        {
            return false;
        }
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
    }

    @Override
    public int hashCode() {
        int result = (int) id ^ id >>> 32;
        result = 31 * result + loginName != null ? loginName.hashCode() : 0;
        result = 31 * result + loginPassword != null ? loginPassword.hashCode() : 0;
    }

    public void setEmail(String email) {
    }

    public void setLoginPassword(String loginPassword) {
    }

    @Basic
    @Column(name = "login_name", nullable = false, length = 45)
    public String getLoginName() {
    }

    @Basic
    @Column(name = "login_password", nullable = false, length = 45)
    public String getLoginPassword() {
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
    }

    public void setIsDelete(int isDelete) {
    }

}
