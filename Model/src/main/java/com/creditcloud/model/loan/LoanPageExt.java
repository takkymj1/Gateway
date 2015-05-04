/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.loan;

import com.creditcloud.model.util.DateUtils;
import com.creditcloud.model.enums.loan.PreRepaymentPenaltyInterestType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 *
 * @author zhanggm
 */
@Data
@NoArgsConstructor
public class LoanPageExt extends Loan{
    
    private String loanRequestSerial;
    private String userId;
    private String loginName;
    private String purposeKey;
    private String methodKey;
    private String durationStr;
    private boolean enableAdvanceRepay;
    private String penaltyInterestRatio;
    private String preRepaymentUseable;

    public LoanPageExt(Loan loan,String loginName,boolean enableAdvanceRepay,boolean isDueDate){
        super.setId(loan.getId());
        super.setTitle(loan.getTitle());
        super.setBidNumber(loan.getBidNumber());
        super.setAmount(loan.getAmount());
        super.setRate(loan.getRate());
        this.loanRequestSerial = loan.getLoanRequest().getSerial();
        this.userId = loan.getLoanRequest().getUserId();
        this.loginName = loginName;
        this.purposeKey = loan.getLoanRequest().getPurpose().getKey();
        this.methodKey = loan.getMethod().getKey();
        this.durationStr = Duration.getChaDuration(loan.getDuration());
        this.enableAdvanceRepay = enableAdvanceRepay;

        //hugang.liu 20150424 added
        //计算罚息比例
        //先判断是否有罚息，如果有再根据是否大于6个月来判断罚息大小
        if(loan != null && loan.getLoanRequest() != null){

            if(PreRepaymentPenaltyInterestType.NONE_PENALTYINTEREST.equals(loan.getLoanRequest().getPenaltyType())){
                penaltyInterestRatio = "0%";
            }else if(PreRepaymentPenaltyInterestType.EXIST_PENALTYINTEREST.equals(loan.getLoanRequest().getPenaltyType())){

                if(loan.getDuration() != null && loan.getDuration().getTotalMonths()<=6){
                    penaltyInterestRatio = "20%";
                }else if(loan.getDuration() != null && loan.getDuration().getTotalMonths()>6){
                    penaltyInterestRatio = "15%";
                }
            }

        }

        //hugang.liu 20150425 added
        //判断提前还款按钮是否可用 preRepaymentUseable
        //处于还款日当天（实际还款日，包括预计还款日和节假日顺延的第一天）或节假日，“提前还款”按钮不可以点击
        //TODO

        boolean isHoliday = DateUtils.isPublicHoliday(LocalDate.now());
        //不是节假日则继续判断当天是否处于还款日当天
        if(isHoliday == false){

            if(isDueDate == false){
                preRepaymentUseable = "false";
            }else if(isDueDate == true){
                preRepaymentUseable = "true";
            }

        }else{
            preRepaymentUseable = "false";
        }

    }
    
}
