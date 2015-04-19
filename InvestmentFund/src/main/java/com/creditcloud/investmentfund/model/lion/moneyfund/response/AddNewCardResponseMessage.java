/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.moneyfund.response;

import com.creditcloud.investmentfund.api.utils.StringUtils;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author guohuazhang
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AddNewCardResponseMessage extends ResponseMessageBase {

    private String naApplicationNo;//	诺安交易申请流水号	char(24)	C	基金公司业务流水号，同一销售机构不能重复；交易失败时为空；
    private String tradeacco;//诺安交易账户	char(32)	R	“非同卡进出”：对于非同卡进出模式，诺安基金会在该“交易账号”下为客户新增一张银行卡； “同卡进出模式”：对于同卡进出模式，诺安基金会为该客户增开“一个交易账号”。
    private String transactionDate;//交易所属日期	char (8)	C	基金的交易日期 格式为：YYYYMMDD 非冲正交易不可为空。 工作日
    private String transactionTime;//交易发生时间	char(14)	R	基金公司订单落地时间 a格式为：YYYYMMDDHHmmSS

    @Override
    public Map<String, String> toMap() {
        Map<String, String> parameters = super.toMap();

        parameters.put("naApplicationNo", StringUtils.nonNull(naApplicationNo));
        parameters.put("tradeacco", StringUtils.nonNull(tradeacco));
        parameters.put("transactionDate", StringUtils.nonNull(transactionDate));
        parameters.put("transactionTime", StringUtils.nonNull(transactionTime));
        return parameters;
    }

    public static AddNewCardResponseMessage fromMap(Map<String, String> items) {
        AddNewCardResponseMessage message = new AddNewCardResponseMessage();

        message.tradeacco = items.get("tradeacco");
        message.applicationNo = items.get("applicationNo");
        message.naApplicationNo = items.get("naApplicationNo");
        message.transactionDate = items.get("transactionDate");
        message.transactionTime = items.get("transactionTime");
        message.errorCode = items.get("errorCode");
        message.errorMessage = items.get("errorMessage");
        message.status = items.get("status");
        message.sign = items.get("sign");
        message.remark = items.get("remark");

        return message;
    }
}
