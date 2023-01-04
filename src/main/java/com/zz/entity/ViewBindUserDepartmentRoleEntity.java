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

    public void setUserEmail(String userEmail) {
    }

    @Basic
    @Column(name = "role_is_delete", nullable = true)
    public Integer getRoleIsDelete() {
    }

    public void setUserId(long userId) {
    }

    @Basic
    @Column(name = "role_comment", nullable = true, length = 200)
    public String getRoleComment() {
    }

    @Basic
    @Column(name = "department_is_delete", nullable = false)
    public int getDepartmentIsDelete() {
    }

    public void setDepartmentCreateTime(String departmentCreateTime) {
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 45)
    public String getUserName() {
    }

    @Basic
    @Column(name = "department_create_time", nullable = false)
    public String getDepartmentCreateTime() {
    }

    @Override
    public int hashCode() {
    }

    @Basic
    @Column(name = "department_name", nullable = false, length = 255)
    public String getDepartmentName() {
    }

    public void setUserIsDelete(int userIsDelete) {
    }

    public void setUserLoginName(String userLoginName) {
    }

    public void setDepartmentIsDelete(int departmentIsDelete) {
    }

    @Basic
    @Column(name = "role_name", nullable = true, length = 45)
    public String getRoleName() {
    }

    public void setDepartmentLevel(int departmentLevel) {
    }

    @Basic
    @Column(name = "role_id", nullable = true)
    public Long getRoleId() {
    }

    @Basic
    @Column(name = "user_create_time", nullable = false)
    public String getUserCreateTime() {
    }

    @Basic
    @Column(name = "user_login_name", nullable = false, length = 45)
    public String getUserLoginName() {
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
    }

    public void setDepartmentParentId(long departmentParentId) {
    }

}
