package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.lion.moneyfund.enums.TransName;
import com.creditcloud.investmentfund.api.utils.StringUtils;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 诺安货币基金赎回请求报文<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author GuohuaZhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RedemptionRequestApplyMessage extends RequestApplyMessageBase {

    @NotNull
    protected String fundCode;//基金代码	char(6)	R
    @NotNull
    protected String applicationVol;//申请赎回基金份数	char(16)	R 两位小数（客户申请赎回或货币支付的份数）
    @NotNull
    protected String isForceDeal = "1";//是否同意顺延至下一工作日 char(1)	R 0-	不同意,1-同意 目前要求强制同意。
    protected String bankProvinceCode;//用户银行卡省 char(10)	O
    protected String bankCityCode;//用户银行卡城市	char(10)	O
    @NotNull
    protected String tradeacco;//诺安交易账户	char(32)	R
    @NotNull
    protected String cardNo;//银行卡号码 char(20)	R
    @NotNull
    protected String payBankCode;//支付工具类型	char(6)	R
    @NotNull
    protected String operatorTime;//操作时间	char(14)	R
    @NotNull
    protected String isQuickRedeem;//是否是快速赎回	char(1)	R 1-是，0-否
    protected String clientIp;//客户IP地址	char(20)	O
    protected String remark;//备注	char(500)	O

    public RedemptionRequestApplyMessage() {
        this.transName = TransName.REDEEM.getCode();
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
