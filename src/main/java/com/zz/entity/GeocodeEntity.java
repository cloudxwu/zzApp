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
        return infocode;
    }

    public RegeocodeEntity getRegeocode() {
        return regeocode;
    }

    public void setRegeocode(RegeocodeEntity regeocode) {
        This.regeocode = regeocode;
    }

    public void setInfo(String info) {
        This.info = info;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        This.status = status;
    }

    public void setInfocode(int infocode) {
        This.infocode = infocode;
    }

    public String getInfo() {
        return info;
    }

}
