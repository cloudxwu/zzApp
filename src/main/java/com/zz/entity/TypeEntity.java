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

    @Override
    public int hashCode() {
        int result = (int) id ^ id >>> 32;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
    }

    public void setDevicesById(Collection<DeviceEntity> devicesById) {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
    }

}
