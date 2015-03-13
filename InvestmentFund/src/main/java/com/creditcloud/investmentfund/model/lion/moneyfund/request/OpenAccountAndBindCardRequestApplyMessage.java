package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.lion.moneyfund.utils.StringUtils;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class OpenAccountAndBindCardRequestApplyMessage extends RequestApplyMessageBase {

    protected String verCode;//	验证码内容 char(8)	R	客户输入
    protected String remark;//	 备注	 char(500)	O	

    public OpenAccountAndBindCardRequestApplyMessage() {
        this.transName = "2011";
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> parameters = super.toMap();

        parameters.put("verCode", StringUtils.nonNull(verCode));
        parameters.put("remark", StringUtils.nonNull(remark));

        return parameters;
    }
}
