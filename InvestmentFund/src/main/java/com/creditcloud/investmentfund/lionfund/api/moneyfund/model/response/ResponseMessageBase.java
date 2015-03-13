package com.creditcloud.investmentfund.lionfund.api.moneyfund.model.response;

import com.creditcloud.investmentfund.lionfund.api.moneyfund.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class ResponseMessageBase {

    protected String applicationNo = "";//请求流水号	char(50)	R	请求唯一标识
    protected String status = "";//处理状态 char(10)	R	0．成功，1.失败
    protected String errorCode = "";//错误代码	char(4)	R	成功 0000，失败9999 返回明细错误原因代码
    protected String errorMessage = "";//错误描述 char (256)	O	

    protected String sign = "";//签名 char(500)	R	
    protected String remark = "";//备注	char(500)	O	

    public Map<String, String> toMap() {
        Map<String, String> parameters = new HashMap<>();

        parameters.put("applicationNo", StringUtils.nonNull(applicationNo));
        parameters.put("status", StringUtils.nonNull(status));
        parameters.put("errorCode", StringUtils.nonNull(errorCode));
        parameters.put("errorMessage", StringUtils.nonNull(errorMessage));
        parameters.put("sign", StringUtils.nonNull(sign));
        parameters.put("remark", StringUtils.nonNull(remark));

        return parameters;
    }
}
