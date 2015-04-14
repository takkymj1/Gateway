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
 *
 * @author zhanggm
 */
@Data
@NoArgsConstructor
public class TenderNoticeAssign02Request extends BaseRequest{
    private String userName;
    private String assignTitle;
    private String finishTime;
    private String bidAmount;
    private String amountRemain;
    private String bidDealAmount;
    private String serviceFee;
    
    public TenderNoticeAssign02Request(String userName,String assignTitle,String finishTime,String bidAmount,String amountRemain,String bidDealAmount,String serviceFee){
        this.setTemplate_id("NOTI_ASSIGN_000002");
        this.userName = userName;
        this.assignTitle = assignTitle;
        this.finishTime = finishTime;
        this.bidAmount = bidAmount;
        this.amountRemain = amountRemain;
        this.bidDealAmount = bidDealAmount;
        this.serviceFee = serviceFee;
    }
}
