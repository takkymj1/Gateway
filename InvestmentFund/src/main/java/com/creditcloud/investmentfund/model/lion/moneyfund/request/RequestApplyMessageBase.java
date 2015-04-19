package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.utils.StringUtils;
import com.creditcloud.investmentfund.constant.FundInterfaceConstants;
import com.creditcloud.model.BaseObject;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * 诺安货币货币基金通用请求报文 <br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author GuohuaZhang
 */
@Getter
public class RequestApplyMessageBase extends BaseObject{
    @NotNull
    @Setter
    protected String applicationNo;// 请求流水号 char(50) R 请求唯一标识 以交易所属自然日”YYYYMMDD“ 开头。
    @NotNull
    protected final String version = FundInterfaceConstants.LOIN_MONEY_FUND_INTERFACE_VERSION;// 版本号 char(7) R 目前版本号：2.0
    @NotNull
    @Setter
    protected String instId;// 机构标识 char(10) R 报文发送方的机构标识。
    @NotNull
    @Setter
    protected String certId;// 数字证书标识char(16) R 基金公司端证书标识码，对报文进行签名的数字证书标识.

    @NotNull
    @Getter
    protected String transName;// 业务类型 Char(10) R
    @NotNull
    @Setter
    protected String sign;// 签名 char(500) R

    public Map<String, String> toMap() {
        Map<String, String> parameters = new HashMap<>();

        parameters.put("applicationNo", StringUtils.nonNull(applicationNo));
        parameters.put("version", StringUtils.nonNull(version));
        parameters.put("instId", StringUtils.nonNull(instId));
        parameters.put("certId", StringUtils.nonNull(certId));
        parameters.put("transName", StringUtils.nonNull(transName));
        parameters.put("sign", StringUtils.nonNull(sign));

        return parameters;
    }
}
