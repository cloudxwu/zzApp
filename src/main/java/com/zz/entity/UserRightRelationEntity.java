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

}
