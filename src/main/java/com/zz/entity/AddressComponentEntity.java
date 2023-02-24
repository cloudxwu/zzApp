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

    public String getDistrict() {
    }

    public void setProvince(String province) {
    }

    public void setCity(String city) {
    }

    public void setDistrict(String district) {
    }

    public String getCity() {
    }

}
