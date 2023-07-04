package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.math.BigDecimal;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: AGpsEntity
 */
public class AGpsEntity { 
    private BigDecimal latitude;
    private BigDecimal longitude;
    private int count;
    private int match;
    private List<AGpsResultEntity> result;
    private int status;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setCount(int count) {
        This.count = count;
    }

    public int getStatus() {
        return status;
    }

    public int getMatch() {
        return match;
    }

    public void setResult(List<AGpsResultEntity> result) {
        This.result = result;
    }

    public void setMsg(String msg) {
        This.msg = msg;
    }

    public void setLongitude(BigDecimal longitude) {
        This.longitude = longitude;
    }

    public void setStatus(int status) {
        This.status = status;
    }

    public void setMatch(int match) {
        This.match = match;
    }

    public List<AGpsResultEntity> getResult() {
        return result;
    }

    public int getCount() {
        return count;
    }

    public void setLatitude(BigDecimal latitude) {
        This.latitude = latitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

}
