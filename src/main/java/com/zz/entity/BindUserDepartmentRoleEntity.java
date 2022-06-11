package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.DynamicInsert;
import javax.persistence;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author YangFanFei@zz.com
 * @ClassName: BindUserDepartmentRoleEntity
 */
@Entity
@DynamicInsert(value = true)
@DynamicUpdate(value = true)
@Table(name = "bind_user_department_role", schema = "zzApp", catalog = "")
public class BindUserDepartmentRoleEntity { 
    private long departmentId;
    private UserEntity userByUserId;
    private RoleEntity roleByRoleId;
    private long userId;
    private DepartmentEntity departmentByDepartmentId;
    private Long roleId;
    private long id;

}
