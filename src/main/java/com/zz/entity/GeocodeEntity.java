package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author YangFanFei@zz.com
 * @ClassName: GeocodeEntity
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodeEntity { 
    private int infocode;
    private RegeocodeEntity regeocode;
    private int status;
    private String info;

    public int getInfocode() {
    }

    public RegeocodeEntity getRegeocode() {
    }

    public void setRegeocode(RegeocodeEntity regeocode) {
    }

    public void setInfo(String info) {
    }

}
