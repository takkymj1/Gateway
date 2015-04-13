package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.lion.moneyfund.enums.TransName;
import com.creditcloud.investmentfund.api.utils.StringUtils;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 诺安货币基金申购请求报文<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author GuohuaZhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SubscriptionRequestApplyMessage extends RequestApplyMessageBase {

    @NotNull
    protected String fundCode;//基金代码	char(6)	R
    @NotNull
    protected String amount;//申请金额	char (16)	R	两位小数
    @NotNull
    protected String tradeacco;//诺安交易账户	char(32)	R
    @NotNull
    protected String cardNo;//银行卡号码	char(20)	R
    @NotNull
    protected String payBankCode;//支付工具类型	char(6)	R	需诺安基金提供。对应诺安内部系统“渠道编码”
    @NotNull
    protected String ifWxzz;//是否网下转账	char (1)	R
    @NotNull
    protected String isForceDeal = "1";//是否同意顺延至下一工作日		char (1)	R
    @NotNull
    protected String riskControlFlag = "0";//风险匹配标志	char(1)	R	0-正常，1-异常，默认都给0
    protected String clientIp;//客户IP	clientIp	char(20)	O
    protected String remark;//备注	remark	char(500)	O

    public SubscriptionRequestApplyMessage() {
        this.transName = TransName.SUBSCRIBE.getCode();
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
