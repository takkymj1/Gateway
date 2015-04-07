/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.LoanRequestAssignType;
import com.creditcloud.model.enums.loan.PreRepaymentStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 提前还款：记录标的的还款状态等信息
 * @author peili
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class LoanPreRepaymentStatus extends BaseObject {
    
    private static final long serialVersionUID = 20150407L;
    
    private String loanId;
    
    //标的还款状态 (取值只能是PREREPAYING、NORMALREPAYING或者PREREPAYED)
    private PreRepaymentStatus status;
    
    //预备还款日期(该日期不能进行债权转让)，实际的还款日期由财务人员控制
    private Date timeScheduled;
    
    //标的的原始可转让属性
    private LoanRequestAssignType originalAssignable;
    
    //当前提前还款的期数
    private int currentPeriod;
    
    //提前还款的日期
    private Date timePreRepayed;
    
    //提前还款的罚息率
    private BigDecimal penaltyRate;
    
    public LoanPreRepaymentStatus(String loanId,
                                  PreRepaymentStatus status,
                                  Date timeScheduled,
                                  LoanRequestAssignType originalAssignable,
                                  int currentPeriod,
                                  Date timePreRepayed,
                                  BigDecimal penaltyRate) {
        this.loanId = loanId;
        this.status = status;
        this.timeScheduled = timeScheduled;
        this.originalAssignable = originalAssignable;
        this.currentPeriod = currentPeriod;
        this.timePreRepayed = timePreRepayed;
        this.penaltyRate = penaltyRate;
    }
}
