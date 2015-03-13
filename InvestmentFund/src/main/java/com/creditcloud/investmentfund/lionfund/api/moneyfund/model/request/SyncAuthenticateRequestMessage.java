package com.creditcloud.investmentfund.lionfund.api.moneyfund.model.request;

import com.creditcloud.investmentfund.lionfund.api.moneyfund.utils.StringUtils;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SyncAuthenticateRequestMessage extends RequestMessageBase {

    protected String woAcco;// 电商平台用户ID char (30) R
    protected String investorName;// 投资人姓名 char (120) R 投资人姓名
    protected String certType = "00";// 证件类型 char (2) R 见证件类型一览表(只支持身份证开户) 00 身份证

    protected String certificateNo;// 证件号码 char (30) R
    protected String cardNo;// 银行卡号码 char(20) R
    protected String bankProvinceCode;// 银行省代码 char(10) C 电商平台需要将不同的”支付工具类型”下的银行卡配置成是否”银行省代码”必输.
    protected String bankCityCode;// 银行市代码 char(10) C 电商平台需要将不同的”支付工具类型”下的银行卡配置成是否” 银行市代码”必输.
    protected String payBankCode;// 支付工具类型 char(6) R 需诺安基金提供。 对应诺安内部系统“渠道编码”。
    protected String telNo;// 银行预留手机号 char (20) R
    protected String remark;// 备注 char(500) O

    @Override
    public Map<String, String> toMap() {
        Map<String, String> parameters = super.toMap();

        parameters.put("woAcco", StringUtils.nonNull(woAcco));
        parameters.put("investorName", StringUtils.nonNull(investorName));
        parameters.put("certType", StringUtils.nonNull(certType));
        parameters.put("certificateNo", StringUtils.nonNull(certificateNo));
        parameters.put("cardNo", StringUtils.nonNull(cardNo));
        parameters.put("bankProvinceCode", StringUtils.nonNull(bankProvinceCode));
        parameters.put("bankCityCode", StringUtils.nonNull(bankCityCode));
        parameters.put("payBankCode", StringUtils.nonNull(payBankCode));
        parameters.put("telNo", StringUtils.nonNull(telNo));
        parameters.put("remark", StringUtils.nonNull(remark));

        return parameters;
    }

}
