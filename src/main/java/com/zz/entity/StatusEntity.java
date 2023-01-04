package java.com.zz.entity;

import javax.persistence;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;

/**
 * @author YangFanFei@zz.com
 * @ClassName: StatusEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "status", schema = "zzApp", catalog = "")
public class StatusEntity { 
    private long id;
    private String name;
    private Collection<DeviceEntity> devicesById;

    public void setName(String name) {
    }

    public void setId(long id) {
    }

    public void setDevicesById(Collection<DeviceEntity> devicesById) {
    }

    @Override
    public int hashCode() {
        int result = (int) id ^ id >>> 32;
        result = 31 * result + name != null ? name.hashCode() : 0;
    }

    @OneToMany(mappedBy = "statusByStatusId")
    public Collection<DeviceEntity> getDevicesById() {
    }

}
