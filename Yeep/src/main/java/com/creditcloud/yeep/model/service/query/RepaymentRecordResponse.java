/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service.query;

import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;

/**
 * 还款记录
 * 
 * @author tinglany
 */

@XmlRootElement (name = "response")
public class RepaymentRecordResponse extends BaseResponse {
    
    //还款金额
    @NotNull
    private String repaymentAmount;
    
    //原投资人的标识
    @NotNull
    private String targetUserNo;
    
    //还款时间
    private LocalDate loanTime;
    
    //还款状态
    @NotNull
    private String status;

    public RepaymentRecordResponse() {
    }
        
    public RepaymentRecordResponse(String repaymentAmount,
                                   String targetUserNo,
                                   LocalDate loanTime,
                                   String status) {
        this.repaymentAmount = repaymentAmount;
        this.targetUserNo = targetUserNo;
        this.loanTime = loanTime;
        this.status = status;
    }

    public String getRepaymentAmount() {
        return repaymentAmount;
    }

    public String getTargetUserNo() {
        return targetUserNo;
    }

    public LocalDate getLoanTime() {
        return loanTime;
    }

    public String getStatus() {
        return status;
    }

    public void setRepaymentAmount(String repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public void setTargetUserNo(String targetUserNo) {
        this.targetUserNo = targetUserNo;
    }

    public void setLoanTime(LocalDate loanTime) {
        this.loanTime = loanTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
