package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: AddressComponentEntity
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressComponentEntity { 
    private String province;
    private String district;
    private String city;

}
