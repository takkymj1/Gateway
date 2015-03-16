/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.moneyfund.response;

import com.creditcloud.model.BaseObject;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestQueryResponseMessage extends BaseObject {

    protected String tradeacco;//交易账号 char(32)	R	货币转账交易，此处为转出方交易账号
    protected String rtradeacco;// 转入方交易账号	char(32)	R	如果是货币转账交易，此处为转入方交易账号
    protected String applicationNo;//请求流水号	char (50)	R	需要查询的原申请单编号
    protected String naApplicationNo;//	诺安交易申请流水号	char(24)	C	基金公司业务流水号，同一销售机构不能重复；交易失败时为空；
    protected String transName;// 业务类型	Char(10)	业务类型	transName
    protected String accStatus;//	受理状态	 char(1)	R	对于申购：0．成功（扣款成功），1.失败（扣款失败），2-未知（扣款状态未知）；
    protected String applicationAmount;//申请金额	Number(16)	O	两位小数
    protected String applicationVol;//申请赎回份额 Number(16)	O	两位小数
    protected String UniVol;//申请过户基金份数 char(16)	C	过户给电商平台份数
    protected String confirmedVol;// 确认份额	Number(16)	O	两位小数 （TA确认后给出该数据）
    protected String transactionTime;//交易发生时间 Number(14)	O	格式为：YyyyMMdd HH:mm:ss 业务类型为121、125时为必填项
    protected String preTransactionCfmDate;//交易确认日期 Number(8)	O	格式为：yyyyMMdd 如果交易没有确认，给出预计确认日期
    protected String errorCode;//	错误代码 char (4)	R	 (查询本身成功或者失败.查询到该条记录0000;查询不到记录9999)
    protected String errorMessage;//错误描述 char (256)	O	
    protected String sign;//	签名 char(500)	R	
    protected String remark;//备注 char(500)	O	

    public static RequestQueryResponseMessage fromMap(Map<String, String> items) {
        RequestQueryResponseMessage message = new RequestQueryResponseMessage();

        message.tradeacco = items.get("tradeacco");
        message.rtradeacco = items.get("rtradeacco");
        message.applicationNo = items.get("applicationNo");
        message.naApplicationNo = items.get("naApplicationNo");
        message.transName = items.get("transName");
        message.accStatus = items.get("accStatus");
        message.applicationAmount = items.get("applicationAmount");
        message.applicationVol = items.get("applicationVol");
        message.UniVol = items.get("UniVol");
        message.confirmedVol = items.get("confirmedVol");
        message.transactionTime = items.get("transactionTime");
        message.preTransactionCfmDate = items.get("preTransactionCfmDate");
        message.errorCode = items.get("errorCode");
        message.errorMessage = items.get("errorMessage");
        message.sign = items.get("sign");
        message.remark = items.get("remark");

        return message;
    }
}
