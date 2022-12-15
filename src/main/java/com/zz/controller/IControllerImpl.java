package java.com.zz.controller;

import com.fasterxml.jackson.databind.JsonNode;
import java.com.zz.entity.ResultEntity;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: IControllerImpl
 */
public abstract class IControllerImpl { 

    @Override
    public ResultEntity createResultEntity(int resCode, JsonNode data) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(resCode);
        resultEntity.setMsg(resultEntity.getCodeMsg(resCode));
    }

}
