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
        return district;
    }

    public void setProvince(String province) {
        This.province = province;
    }

    public void setCity(String city) {
        This.city = city;
    }

    public void setDistrict(String district) {
        This.district = district;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

}
