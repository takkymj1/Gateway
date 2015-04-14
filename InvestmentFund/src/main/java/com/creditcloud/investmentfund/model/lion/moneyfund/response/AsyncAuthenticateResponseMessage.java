package com.creditcloud.investmentfund.model.lion.moneyfund.response;

import com.creditcloud.investmentfund.api.utils.StringUtils;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Data;

import lombok.EqualsAndHashCode;
/**
 *  诺安货币基金异步鉴权请求对应的异步回执报文<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AsyncAuthenticateResponseMessage extends ResponseMessageBase {

    @NotNull
    protected String woAcco;//	电商平台用户ID char (30)	R	
    protected String naApplicationNo;//诺安交易申请流水号 char(24)	C	基金公司业务流水号，同一销售机构不能重复；交易失败时为空；
    protected String tradeacco;//诺安交易账户 char(32)	C	交易失败时为空 同一个“证件类型+证件号码”，只要电商平台ID号不同，诺安基金会为其分配不同的交易账号。
    protected String transactionDate;//	交易所属日期 char (8)	C	基金的交易日期 格式为：YYYYMMDD 非冲正交易不可为空。 工作日
    @NotNull
    protected String transactionTime;//交易发生时间 char(14)	R	基金公司订单落地时间 格式为：YYYYMMDDHHmmSS

    @Override
    public Map<String, String> toMap() {
        Map<String, String> parameters = super.toMap();

        parameters.put("woAcco", StringUtils.nonNull(woAcco));
        parameters.put("naApplicationNo", StringUtils.nonNull(naApplicationNo));
        parameters.put("tradeacco", StringUtils.nonNull(tradeacco));
        parameters.put("transactionDate", StringUtils.nonNull(transactionDate));
        parameters.put("transactionTime", StringUtils.nonNull(transactionTime));

        return parameters;
    }
}
