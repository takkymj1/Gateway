package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.lion.moneyfund.utils.StringUtils;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RedemptionRequestApplyMessage extends RequestApplyMessageBase {

    protected String fundCode;//	char(6)	R
    protected String applicationVol;//	char(16)	R
    protected String isForceDeal = "1";//char(1)	R
    protected String bankProvinceCode;//char(10)	O
    protected String bankCityCode;//	char(10)	O
    protected String tradeacco;//	char(32)	R
    protected String cardNo;//char(20)	R
    protected String payBankCode;//	char(6)	R
    protected String operatorTime;//	char(14)	R
    protected String isQuickRedeem;//	char(1)	R
    protected String clientIp;//	char(20)	O
    protected String remark;//	char(500)	O

    public RedemptionRequestApplyMessage() {
        this.transName = "2241";
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> parameters = super.toMap();

        parameters.put("fundCode", StringUtils.nonNull(fundCode));
        parameters.put("applicationVol", StringUtils.nonNull(applicationVol));
        parameters.put("isForceDeal", StringUtils.nonNull(isForceDeal));
        parameters.put("bankProvinceCode", StringUtils.nonNull(bankProvinceCode));
        parameters.put("bankCityCode", StringUtils.nonNull(bankCityCode));
        parameters.put("tradeacco", StringUtils.nonNull(tradeacco));
        parameters.put("cardNo", StringUtils.nonNull(cardNo));
        parameters.put("payBankCode", StringUtils.nonNull(payBankCode));
        parameters.put("operatorTime", StringUtils.nonNull(operatorTime));
        parameters.put("isQuickRedeem", StringUtils.nonNull(isQuickRedeem));
        parameters.put("clientIp", StringUtils.nonNull(clientIp));
        parameters.put("remark", StringUtils.nonNull(remark));

        return parameters;
    }
}
