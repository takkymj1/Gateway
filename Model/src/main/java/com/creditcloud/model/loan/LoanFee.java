/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;

import java.math.BigDecimal;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 每个贷款申请对应的收费费率,只能变动浮动费率部分
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class LoanFee extends BaseObject {

    private static final long serialVersionUID = 20140102L;

    /**
     * 对应贷款申请的id
     */
    @FormParam("requestId")
    private String requestId;

    /**
     * 担保费率,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Min(0)
    @Max(1)
    @FormParam("loanGuaranteeFee")
    private BigDecimal loanGuaranteeFee;

    /**
     * 风险管理费率,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Min(0)
    @Max(1)
    @FormParam("loanRiskFee")
    private BigDecimal loanRiskFee;

    /**
     * 服务费率,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Min(0)
    @Max(1)
    @FormParam("loanServiceFee")
    private BigDecimal loanServiceFee;

    /**
     * 管理费率,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Min(0)
    @Max(1)
    @FormParam("loanManageFee")
    private BigDecimal loanManageFee;

    /**
     * 贷款利息管理费,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Min(0)
    @Max(1)
    @FormParam("loanInterestFee")
    private BigDecimal loanInterestFee;

    /**
     * 投资利息管理费,为null表示使用配置文件，否则覆盖配置文件中默认费率
     */
    @Min(0)
    @Max(1)
    @FormParam("investInterestFee")
    private BigDecimal investInterestFee;

    public LoanFee(String requestId,
                   BigDecimal loanGuaranteeFee,
                   BigDecimal loanRiskFee,
                   BigDecimal loanServiceFee,
                   BigDecimal loanManageFee,
                   BigDecimal loanInterestFee,
                   BigDecimal investInterestFee) {
        this.requestId = requestId;
        this.loanGuaranteeFee = loanGuaranteeFee;
        this.loanRiskFee = loanRiskFee;
        this.loanServiceFee = loanServiceFee;
        this.loanManageFee = loanManageFee;
        this.loanInterestFee = loanInterestFee;
        this.investInterestFee = investInterestFee;
    }
}
