/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.moneyfund;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseConfirmRecord extends BaseObject {

    @NotNull
    private String tradeacco;//交易账号	String(32)		否	
    @NotNull
    private String naApplicationNo;//	诺安交易申请流水号	String(24)	同一销售机构不能重复	否	
    @NotNull
    private String tASerialNO;//	TA确认交易流水号 Number(20)		否	
    private String applicationNo;//	请求流水号 String(50)		是	
    @NotNull
    private String distributorCod;//	销售人代码 String(9)	基金公司代码	否	
    private String transactionDate;//交易所属日期 Number(8)	基金的交易日期 格式为：yyyyMMdd 非撤销交易不可为空。	否	国庆前一天晚上发生的交易，其交易所属日期是国庆后第一个交易日
    @NotNull
    private String transactionTime;//交易发生时间 Number(14)	基金公司订单落地时间 格式为：YyyyMMdd HH:mm:ss	否	
    @NotNull
    private String transactionCfmDate;//交易确认日期	Number(8)	格式为：yyyyMMdd	否	
    @NotNull
    private String transCode;//业务代码 Number(3)	编码见业务代码一览表	否	交易确认的业务代码（申购122）
    @NotNull
    private String fundCode;//	基金代码	String(6)		否	
    @NotNull
    private String chargeType;//	收费方式	 Number(1)	0-前收费 1-后收费	否	
    @NotNull
    private String nAV;//基金单位净值 Number(7)	四位小数	否	
    @NotNull
    private String applicationAmount;// 申请金额	Number(16)	两位小数 业务类型为申购确认、认购确认、定投申请确认时为必填项	否	
    @NotNull
    private String confirmedVol;//	基金账户交易确认份数 Number(16)	两位小数 业务类型为申购确认、认购确认、定投申请确认、时为必填项	否	
    @NotNull
    private String confirmedAmount;//每笔交易确认金额	Number(16)	两位小数 含所有费用的总金额	否	
    @NotNull
    private String charge;//手续费 Number(10)	两位小数 投资人应付总手续费	否	
    @NotNull
    private String returnCode;//交易处理返回代码 Number(4)	见交易返回码	否	
    @NotNull
    private String returnMsg;//交易处理返回描述	String(128)	交易处理返回描述	否	

}
