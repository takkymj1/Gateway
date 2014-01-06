/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;


import java.math.BigDecimal;
import javax.persistence.Column;
import lombok.Data;

/**
 * 每个贷款申请对应的收费费率
 *
 * @author rooseek
 */
@Data
public class LoanFee extends BaseObject {

    private static final long serialVersionUID = 20140102L;

    /**
     * 对应贷款申请的id
     */
    private String requestId;

    /**
     * 担保费率,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Column(nullable = true)
    private BigDecimal loanGuaranteeFee;

    /**
     * 服务费率,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Column(nullable = true)
    private BigDecimal loanServiceFee;

    /**
     * 管理费率,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Column(nullable = true)
    private BigDecimal loanManagerFee;

    /**
     * 贷款利息管理费,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Column(nullable = true)
    private BigDecimal loanInterestFee;

    /**
     * 投资利息管理费,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Column(nullable = true)
    private BigDecimal investInterestFee;

    public LoanFee() {
    }

    public LoanFee(String requestId,
                   BigDecimal loanGuaranteeFee,
                   BigDecimal loanServiceFee,
                   BigDecimal loanManagerFee,
                   BigDecimal loanInterestFee,
                   BigDecimal investInterestFee) {
        this.requestId = requestId;
        this.loanGuaranteeFee = loanGuaranteeFee;
        this.loanServiceFee = loanServiceFee;
        this.loanManagerFee = loanManagerFee;
        this.loanInterestFee = loanInterestFee;
        this.investInterestFee = investInterestFee;
    }
}
