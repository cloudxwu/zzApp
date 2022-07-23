package java.com.zz.entity;

import javax.persistence;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * @author YangFanFei@zz.com
 * @ClassName: ViewBindUserDepartmentRoleEntity
 */
@Entity
@Table(name = "view_bind_user_department_role", schema = "zzApp", catalog = "")
public class ViewBindUserDepartmentRoleEntity { 
    private Long roleId;
    private int userIsDelete;
    private String departmentCreateTime;
    private String userEmail;
    private String roleName;
    private long id;
    private String userLoginPassword;
    private long userId;
    private String userMobile;
    private int departmentLevel;
    private Long departmentId;
    private Integer roleIsDelete;
    private int departmentIsDelete;
    private String roleCreateTime;
    private String userCreateTime;
    private String departmentName;
    private long departmentParentId;
    private String userName;
    private String userLoginName;
    private String roleComment;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
    }

    public void setUserCreateTime(String userCreateTime) {
    }

    public void setRoleComment(String roleComment) {
    }

    @Basic
    @Column(name = "user_mobile", nullable = true, length = 45)
    public String getUserMobile() {
    }

    @Basic
    @Column(name = "role_create_time", nullable = true)
    public String getRoleCreateTime() {
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
    }

    public void setUserName(String userName) {
    }

    public void setDepartmentId(Long departmentId) {
    }

}
