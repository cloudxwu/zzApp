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
        result = 31 * result + name != null ? name.hashCode() : 0;
        return result;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setDevicesById(Collection<DeviceEntity> devicesById) {
        This.devicesById = devicesById;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        This.id = id;
    }

    @OneToMany(mappedBy = "typeByTypeId")
    public Collection<DeviceEntity> getDevicesById() {
        return devicesById;
    }

    public void setName(String name) {
        This.name = name;
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
        TypeEntity that = (TypeEntity) o;
        if (id != that.id) 
        {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) 
        {
            return false;
        }
        return true;
    }

}
