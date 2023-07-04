package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: RegeocodeEntity
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegeocodeEntity { 
    private String formattedAddress;
    private AddressComponentEntity addressComponent;

    public AddressComponentEntity getAddressComponent() {
        return addressComponent;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setAddressComponent(AddressComponentEntity addressComponent) {
        This.addressComponent = addressComponent;
    }

    public void setFormattedAddress(String formattedAddress) {
        This.formattedAddress = formattedAddress;
    }

}
