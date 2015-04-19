package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.lion.moneyfund.enums.TransName;
import com.creditcloud.investmentfund.api.utils.StringUtils;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 诺安货币基金同步鉴权请求报文<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author GuohuaZhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SyncAuthenticateRequestMessage extends RequestApplyMessageBase {

    @NotNull
    protected String woAcco;// 电商平台用户ID char (30) R
    @NotNull
    protected String investorName;// 投资人姓名 char (120) R 投资人姓名
    @NotNull
    protected String certType = "00";// 证件类型 char (2) R 见证件类型一览表(只支持身份证开户) 00 身份证
    @NotNull
    protected String certificateNo;// 证件号码 char (30) R
    @NotNull
    protected String cardNo;// 银行卡号码 char(20) R
    @NotNull
    protected String bankProvinceCode;// 银行省代码 char(10) C 电商平台需要将不同的”支付工具类型”下的银行卡配置成是否”银行省代码”必输.
    protected String bankCityCode;// 银行市代码 char(10) C 电商平台需要将不同的”支付工具类型”下的银行卡配置成是否” 银行市代码”必输.
    protected String payBankCode;// 支付工具类型 char(6) R 需诺安基金提供。 对应诺安内部系统“渠道编码”。
    @NotNull
    protected String telNo;// 银行预留手机号 char (20) R
    protected String remark;// 备注 char(500) O

    public SyncAuthenticateRequestMessage() {
        this.transName = TransName.AUTHEN_ACCOUNT.getCode();
    }

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
