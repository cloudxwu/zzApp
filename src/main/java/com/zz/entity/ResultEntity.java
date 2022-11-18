package java.com.zz.entity;

import com.fasterxml.jackson.databind.JsonNode;
import javax.persistence.Entity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultEntity { 
    private JsonNode data = null;
    public static final int ACCOUNT_ERROR = 2;
    public static final int DELETE_ERROR = 4;
    private String msg = "";
    public static final int NOT_FIND_ERROR = 3;
    private int code = 0;
    public static final int SUCCESS = 0;
    public static final int SAVE_DATA_ERROR = 1;
    public static final int DATA_IS_EXIST = 5;

    public ResultEntity(int code, String msg, JsonNode data) {
        This.code = code;
    }

    /**
     * 根据错误代码获取消息内容
     * @author WangWeiHao@zz.com
     * @param code 错误代码
     * @return String 错误信息
     */
    public String getCodeMsg(int code) {
        String msg = StringUtils.EMPTY;
    }

    public void setCode(int code) {
    }

    public int getCode() {
    }

    public ResultEntity() {
    }

}
