package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.lion.moneyfund.utils.StringUtils;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SubscriptionRequestApplyMessage extends RequestApplyMessageBase {

    protected String fundCode;
    protected String amount;
    protected String tradeacco;
    protected String cardNo;
    protected String payBankCode;
    protected String ifWxzz;
    protected String isForceDeal;
    protected String riskControlFlag;
    protected String clientIp;
    protected String remark;

    public SubscriptionRequestApplyMessage() {
        this.transName = "2220";
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> parameters = super.toMap();

        parameters.put("fundCode", StringUtils.nonNull(fundCode));
        parameters.put("amount", StringUtils.nonNull(amount));
        parameters.put("tradeacco", StringUtils.nonNull(tradeacco));
        parameters.put("cardNo", StringUtils.nonNull(cardNo));
        parameters.put("payBankCode", StringUtils.nonNull(payBankCode));
        parameters.put("ifWxzz", StringUtils.nonNull(ifWxzz));
        parameters.put("isForceDeal", StringUtils.nonNull(isForceDeal));
        parameters.put("riskControlFlag", StringUtils.nonNull(riskControlFlag));
        parameters.put("clientIp", StringUtils.nonNull(clientIp));
        parameters.put("remark", StringUtils.nonNull(remark));

        return parameters;
    }
}
