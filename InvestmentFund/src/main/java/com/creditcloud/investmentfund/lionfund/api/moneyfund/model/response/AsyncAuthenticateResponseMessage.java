package com.creditcloud.investmentfund.lionfund.api.moneyfund.model.response;

import com.creditcloud.investmentfund.lionfund.api.moneyfund.utils.StringUtils;
import java.util.Map;
import lombok.Data;

import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AsyncAuthenticateResponseMessage extends ResponseMessageBase {

    protected String naApplicationNo;//诺安交易申请流水号	char(24)	C	基金公司业务流水号，同一销售机构不能重复；交易失败时为空；
    protected String tradeacco;//诺安交易账户	char(32)	C	交易失败时为空 同一个“证件类型+证件号码”，只要电商平台ID号不同，诺安基金会为其分配不同的交易账号。
    protected String transactionDate;//交易所属日期	char (8)	C	基金的交易日期 格式为：YYYYMMDD 非冲正交易不可为空。 工作日
    protected String transactionTime;//交易发生时间	char(14)	R	基金公司订单落地时间 格式为：YYYYMMDDHHmmSS

    @Override
    public Map<String, String> toMap() {
        Map<String, String> parameters = super.toMap();

        parameters.put("naApplicationNo", StringUtils.nonNull(naApplicationNo));
        parameters.put("tradeacco", StringUtils.nonNull(tradeacco));
        parameters.put("transactionDate", StringUtils.nonNull(transactionDate));
        parameters.put("transactionTime", StringUtils.nonNull(transactionTime));
        
        return parameters;
    }
}
