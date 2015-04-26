/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentPeriod;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 与RepaymentMethod结合应用，来调整还款表的生成.
 * 
 * <strong>DTO同时也是Embeddable</strong>
 * 
 * @author sobranie
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class RepaymentRule extends BaseObject {

    private static final long serialVersionUID = 20150426L;
    
    /**
     * 默认值
     */
    public static final RepaymentRule DEFAULT = new RepaymentRule();
    
    /**
     * 一年按照多少天计算.
     * 
     * 可能的取值有360、365、366，默认365
     * 
     * 主要用在按日一次性还本付息的计算中
     */
    @DefaultValue("365")
    @FormParam("daysOfYear")
    @Min(360)
    @Max(365)
    private int daysOfYear = 365;
    
    /**
     * 对于多次还款的几种方式，规定的还款周期.
     * 
     * 可以按月、双月、按季度、半年以及一年
     */
    @DefaultValue("Monthly")
    @FormParam("repaymentPeriod")
    private RepaymentPeriod repaymentPeriod = RepaymentPeriod.Monthly;
    
    /**
     * 固定日还款，还款的日期(day of month).
     * 
     * 1~31 表示日期，0表示非固定日还款(按照起息日/结标日推算)
     */
    @DefaultValue("0")
    @FormParam("dayOfRepayment")
    @Min(0)
    @Max(31)
    private int dayOfRepayment = 0;
    
}
