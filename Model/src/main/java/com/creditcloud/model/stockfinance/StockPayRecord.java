/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.stockfinance;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.LoanConstant;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

/**
 * 配资人付款（保证金、服务费、利息）时，向数据库添加一条记录
 * 
 * @author zhaobs
 */
@XmlRootElement
@Data
@NoArgsConstructor
public class StockPayRecord extends BaseObject {

    private static final long serialVersionUID = 20150507L;

    /**
     * StockRequest Id,与requestId一一对应（配资人的requestId,不是股东的requestId）
     */
    @XmlElement(name = "requestId")
    private String requestId;
    
    /**
     * 保证金（即本金）
     */
    @XmlElement(name = "amount")
    private BigDecimal amount;
    
    /**
     * 杠杆
     */
    @XmlElement(name = "leverage")
    private int leverage;
    
   /**
    * 预警线
    */
   @XmlElement(name = "alarmAmount")
   private BigDecimal alarmAmount;
   
   /**
    * 平仓线
    */
   @XmlElement(name = "coverAmount")
   private BigDecimal coverAmount;
    
    /**
     * 服务费
     */
    @XmlElement(name = "serviceFee")
    private BigDecimal serviceFee;
    
    /**
     * 利息
     */
    @XmlElement(name = "interestFee")
    private BigDecimal interestFee;
    
    /**
     * 支付时间
     */
    @NotNull
    @XmlElement(name = "timeSubmit")
    private Date timeSubmit;
    
    /**
     * 配资到期时间
     */
    @NotNull
    @XmlElement(name = "dueTime")
    private Date dueTime;

    /**
     * 自定义（json string）
     */
    @Size(max = LoanConstant.MAX_LOAN_DESCRIPTION)
    private String clientPriv;
    
    /**
     *
     * @param requestId    LoanRequest Id, nullable
     * @param amount       保证金
     * @param leverage     杠杆
     * @param alarmAmount  预警线
     * @param coverAmount  平仓线
     * @param serviceFee   服务费
     * @param interestFee  利息
     * @param timeSubmit   支付时间
     * @param dueTime      配资到期时间
     * @param clientPriv   自定义
     */
    public StockPayRecord(String requestId,
                       BigDecimal amount,
                       int leverage,
                       BigDecimal alarmAmount,
                       BigDecimal coverAmount,
                       BigDecimal serviceFee,
                       BigDecimal interestFee,
                       Date timeSubmit,
                       Date dueTime,
                       String clientPriv) {
        this.requestId = requestId;
        this.amount = amount;
        this.leverage = leverage;
        this.alarmAmount = alarmAmount;
        this.coverAmount = coverAmount;
        this.serviceFee = serviceFee;
        this.interestFee = interestFee;
        this.timeSubmit = timeSubmit;
        this.dueTime = dueTime;
        this.clientPriv = clientPriv;
    }
}
