package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: UserRightRelationEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "user_right_relation", schema = "zzApp", catalog = "")
public class UserRightRelationEntity { 
    private long userId;
    private UserEntity userByUserId;
    private RightEntity rightByRightId;
    private long id;
    private long rightId;

    public void setUserByUserId(UserEntity userByUserId) {
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public UserEntity getUserByUserId() {
    }

    public void setUserId(long userId) {
    }

    public void setId(long id) {
    }

    @ManyToOne
    @JoinColumn(name = "right_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public RightEntity getRightByRightId() {
    }

    @Basic
    @Column(name = "right_id", nullable = false)
    public long getRightId() {
    }

}
