/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fengMessage.model;

import com.creditcloud.fengMessage.model.base.BaseRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * hugang.liu 20150507 added
 * 提前还款后，需要通过站内信告知用户，1提前还款的标的，2还款的本金、3利息及4罚息
 * 站内信模板：您好，您投资的项目XXXX发送了提前还款。根据该项目的合同约定，您获得提前还款金额总共XXX元。其中本金XXX元，已经发生利息XX元，剩余利息补偿XX元。请悉知。
 */
@Data
@NoArgsConstructor
public class TenderNoticePreRepay01Request extends BaseRequest{
    /**
     * 投资项目标题
     */
    private String investProjectTitle;

    /**
     *提前还款总金额
     */
    private String repayAmount;

    /**
     * 本金
     */
    private String principal;

    /**
     * 利息
     */
    private String interest;

    /**
     * 利息补偿
     */
    private String interestCompensation;

    public TenderNoticePreRepay01Request(String investProjectTitle, String repayAmount, String principal, String interest, String interestCompensation){
        this.setTemplate_id("NOTI_PREPAYMENT_001");
        this.investProjectTitle = investProjectTitle;
        this.repayAmount = repayAmount;
        this.principal = principal;
        this.interest = interest;
        this.interestCompensation = interestCompensation;
    }
}
