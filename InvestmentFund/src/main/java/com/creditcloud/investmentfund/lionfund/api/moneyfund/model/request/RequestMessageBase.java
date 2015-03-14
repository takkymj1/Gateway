package com.creditcloud.investmentfund.lionfund.api.moneyfund.model.request;

import com.creditcloud.investmentfund.lionfund.api.moneyfund.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class RequestMessageBase {

    protected String applicationNo;// 请求流水号 char(50) R 请求唯一标识 以交易所属自然日”YYYYMMDD“ 开头。

    protected String version = "2.0";// 版本号 char(7) R 目前版本号：2.0
    protected String instId;// 机构标识 char(10) R 报文发送方的机构标识。
    protected String certId;// 数字证书标识char(16) R 基金公司端证书标识码，对报文进行签名的数字证书标识.

    protected String transName;// 业务类型 Char(10)
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
