package java.com.zz.entity;

import java.util.Collection;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author YangFanFei@zz.com
 * @ClassName: DepartmentEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "department", schema = "zzApp", catalog = "")
public class DepartmentEntity { 
    private Collection<DeviceEntity> devicesById;
    private int isDelete;
    private int level;
    private long id;
    private long parentId;
    private Collection<BindUserDepartmentRoleEntity> bindUserDepartmentRolesById;
    private String name;
    private String createTime;

}
