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
 * 基金份额对账确认文件<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DividendConfirmRecord extends FileRecord {

    @NotNull
    private String fundCode;//	基金代码	String(6)		否	
    @NotNull
    private String chargeType;//收费方式	Number(1)	0-前收费 1-后收费	否	
    @NotNull
    private String distributorCode;//	销售人代码	String(9)	基金公司代码	否	
    @NotNull
    private String woAcco;//	客户电商平台账户号	char (30)	R		
    @NotNull
    private String tradeacco;//	交易账号	String(32)		否	
    @NotNull
    private String tAAccountID;//	投资人在基金公司的基金账号	String(12)	TA交易号	否	
    @NotNull
    private String totalVolOfDistributorInTA;//	基金总份额	Number(16)	两位小数 基金可用份额	否	总份额已经包含了当日收益
    @NotNull
    private String totalFrozenVol;//	基金冻结总份额	Number(16)	两位小数 基金冻结总份额	否	冻结含所有包括司法冻结等.(没有统计T日15:00之后赎回在途交易冻结的份额)。
    @NotNull
    private String availableVol;//	基金可以用总份额	Number(16)	两位小数 基金可用总份额	否	(没有统计T日15:00之后赎回在途交易冻结的份额)。
    @NotNull
    private String defDividendMethod;//	默认分红方式	Number(1)	0－红利转投，1-现金分红	否	
    private String transactionCfmDate;//	交易确认日期	Number(8)	格式为：yyyyMMdd 表明是哪一天的持仓数据	否	

}
