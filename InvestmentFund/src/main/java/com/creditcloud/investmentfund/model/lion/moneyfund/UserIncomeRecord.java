/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.moneyfund;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserIncomeRecord extends FileRecord {

    @NotNull
    private String fundCode;// 基金代码	String(6)		否	
    @NotNull
    private String chargeType;//	收费方式 Number(1)	0-前收费 1-后收费	否	
    @NotNull
    private String distributorCode;//	销售人代码 String(9)	基金公司代码	否	
    @NotNull
    private String woAcco;//客户电商平台账户号 char (30)		否	
    @NotNull
    private String tradeacco;//交易账号 String(32)		否	
    @NotNull
    private String tAAccountID;//	投资人在基金公司的基金账号 String(12)	TA交易号	否	
    @NotNull
    private String income;//	客户当日收益 Number(16)	两位小数 客户当日收益	否	当日收益
    @NotNull
    private String totalIncome;//	客户累计收益 Number(16)	两位小数 客户累计收益	否	客户累计收益
    @NotNull
    private String incomefpDate;// 收益分配日	Number(8)	格式为：yyyyMMdd 表明是哪一天的收益数据 例如:周一下发周五,周六,周日三笔记录，对应的收益分配日分别为周五，周六，周日。	否	

}
