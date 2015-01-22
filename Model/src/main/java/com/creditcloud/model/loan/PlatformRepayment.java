/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 标的存在综合费率的时候，贷款发放后对应平台的每期还款 （参考担保机构是证大速贷的标的）
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class PlatformRepayment extends BaseObject {
    
    private static final long serialVersionUID = 2015001001L;

    @NotNull
    private String id;

    /**
     * 偿还本金
     */
    @Min(0)
    @Column(nullable = false,
            precision = 15,
            scale = 2)
    private BigDecimal amountPrincipal;

    /**
     * 偿还利息
     */
    @Min(0)
    @Column(nullable = false,
            precision = 15,
            scale = 2)
    private BigDecimal amountInterest;

    /**
     * 剩余本息
     */
    @Min(0)
    @Column(nullable = false,
            precision = 15,
            scale = 2)
    private BigDecimal amountOutstanding;
    
    public PlatformRepayment(String id, 
                               BigDecimal amountPrincipal,
                               BigDecimal amountInterest,
                               BigDecimal amountOutstanding) {
        this.id = id;
        this.amountPrincipal = amountPrincipal;
        this.amountInterest = amountInterest;
        this.amountOutstanding = amountOutstanding;
    }
    
    /**
     * 当期的应还款总额.
     *
     * amountPrincipal + amountInterest
     *
     * @return
     */
    public BigDecimal getAmount() {
        return amountInterest.add(amountPrincipal);
    }
    
    public BigDecimal getTotal(BigDecimal loanFee, BigDecimal manageFee) {
        return getAmount().add(loanFee != null ? loanFee: BigDecimal.ZERO).add(manageFee != null ? manageFee: BigDecimal.ZERO);
    }
}
