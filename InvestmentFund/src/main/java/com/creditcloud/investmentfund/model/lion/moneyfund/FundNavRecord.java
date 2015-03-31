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
 * 基金净值<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FundNavRecord extends FileRecord {

    @NotNull
    private String fundCode;//	基金代码(67) String(6)		否	
    @NotNull
    private String chargeType;//收费方式(260) Number(1)	0-前收费 1-后收费	否	
    @NotNull
    private String navDate;//净值日期 Number(8)	格式为：yyyyMMdd	否	
    @NotNull
    private String nav;// 净值 Number(8,4)		否	

    private String FundIncome;//货币基金万份收益 Number(8,5)	 	可	货币提供（包含正负）
    private String Yield;//	货币基金七日年化收益率 Number(8,5	 	可	货币提供
    private String FundYearIncomeRate;//	 最近一年货币基金年收益率 Number(8,5	 	可	货币提供

}
