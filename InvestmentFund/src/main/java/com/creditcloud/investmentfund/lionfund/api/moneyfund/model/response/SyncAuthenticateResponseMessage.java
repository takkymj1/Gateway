package com.creditcloud.investmentfund.lionfund.api.moneyfund.model.response;

import com.creditcloud.investmentfund.lionfund.api.moneyfund.utils.StringUtils;
import java.util.Map;
import lombok.Data;

import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SyncAuthenticateResponseMessage extends ResponseMessageBase {

    protected String needVer = "";//客户是否需要验证码 char(1)	R	0:需要 1:不需要 诺安基金快捷全部为“0”：需要。
    protected String needVerCode = "";//是否需要平台发送验证码	char(1)	R	0:需要平台发送 1:不需要平台发送
    protected String verCode = "";//验证码内容 char(8)	C	如果需要平台发送，诺安提供验证码内容

    @Override
    public Map<String, String> toMap() {
        Map<String, String> parameters = super.toMap();

        parameters.put("needVer", StringUtils.nonNull(needVer));
        parameters.put("needVerCode", StringUtils.nonNull(needVerCode));
        parameters.put("verCode", StringUtils.nonNull(verCode));
        return parameters;
    }
}
