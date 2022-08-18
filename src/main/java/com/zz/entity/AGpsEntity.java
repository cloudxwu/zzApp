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
    }

    public BigDecimal getLongitude() {
    }

    public void setCount(int count) {
    }

    public int getStatus() {
    }

}
