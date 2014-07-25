/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 贷款发放后对应的每期还款
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class LoanRepayment extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private  String id;

    @NotNull
    private  String loanId;
    
    @NotNull
    private String userId;

    //还款第几期
    @NotNull
    private  int currentPeriod;

    //应还款
    @NotNull
    private  Repayment repayment;

    //回款状态
    @NotNull
    private  RepaymentStatus status;

    /**
     * 实际回款金额
     */
    @NotNull
    private  BigDecimal repayAmount;

    /**
     * 实际回款时间
     */
    private  Date repayDate;
    
    /**
     * 还款来源，实际还款人，如果为null则为loan中借款人，还可以为平台或者担保公司等
     */
    private RealmEntity repaySource;

    public LoanRepayment(String id,
                         String loanId,
                         String userId,
                         int currentPeriod,
                         Repayment repayment,
                         RepaymentStatus status,
                         BigDecimal repayAmount,
                         Date repayDate,
                         RealmEntity repaySource) {
        this.id = id;
        this.loanId = loanId;
        this.userId = userId;
        this.currentPeriod = currentPeriod;
        this.repayment = repayment;
        this.status = status;
        this.repayAmount = repayAmount;
        this.repayDate = repayDate;
        this.repaySource = repaySource;
    }
}
