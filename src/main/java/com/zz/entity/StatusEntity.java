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

}
