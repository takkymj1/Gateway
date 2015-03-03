/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.loan;

import com.creditcloud.model.user.User;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 *
 * @author zhanggm
 */
@Data
@XmlRootElement
@NoArgsConstructor
public class LoanRepaymentPageExt extends LoanRepayment{
    private String loanRepaymentStatusKey;
    private String statuskey;
    private String userId;
    private String loginName;
    private String loanId;
    private String loanTitle;
    private String serial;
    private String curPeriod;
    private String amount;
    private BigDecimal availableAmount;
    private boolean useUnionMobilePayment;
    private BigDecimal umpTenderBalance;
    private LocalDate dueDate;
    private Date rpyDate;
    private String repayId;
    private String mobile;
    private boolean enableLoanFastRepay;
    private boolean enableThirdPartyCollect;
    private String collectRecord;
    private String corporationName;
    
    public LoanRepaymentPageExt(LoanRepayment loanRepayment,Loan loan,BigDecimal availableAmount,User user, boolean useUnionMobilePayment
                            ,BigDecimal umpTenderBalance,boolean enableLoanFastRepay,String statuskey,boolean enableThirdPartyCollect){
        this.statuskey = statuskey;
        this.loanRepaymentStatusKey = loanRepayment.getStatus().getKey();
        this.userId = loanRepayment.getUserId();
        this.loginName = user.getLoginName();
        this.loanId = loanRepayment.getLoanId();
        this.loanTitle = loanRepayment.getLoanTitle();
        this.serial = loan.getLoanRequest().getSerial();
        this.curPeriod = loanRepayment.getCurrentPeriod()+"";
        this.amount = loanRepayment.getRepayment().getAmount().toString();
        this.availableAmount = availableAmount;
        this.useUnionMobilePayment = useUnionMobilePayment;
        this.umpTenderBalance = umpTenderBalance;
        this.dueDate = loanRepayment.getRepayment().getDueDate();
        this.rpyDate = loanRepayment.getRepayDate();
        this.repayId = loanRepayment.getId();
        this.mobile = user.getMobile();
        this.enableLoanFastRepay = enableLoanFastRepay;
        this.enableThirdPartyCollect = enableThirdPartyCollect;
        if(loan.getLoanRequest().getCorporation() != null){
            this.corporationName = loan.getLoanRequest().getCorporation().getName();
        }else{
            this.corporationName = "";
        }
    }
    
}
