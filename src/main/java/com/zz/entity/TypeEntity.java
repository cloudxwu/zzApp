package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: TypeEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "type", schema = "zzApp", catalog = "")
public class TypeEntity { 
    private String name;
    private Collection<DeviceEntity> devicesById;
    private long id;

}
