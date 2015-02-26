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
    public String userName;
    public String assignTitle;
    public String finishTime;
    public String bidAmount;
    public String amountRemain;
    public String bidDealAmount;
    public String serviceFee;
    
    public TenderNoticeAssign02Request(String userName,String assignTitle,String finishTime,String bidAmount,String amountRemain,String bidDealAmount,String serviceFee){
        this.template_id = "NOTI_ASSIGN_000002";
        this.userName = userName;
        this.assignTitle = assignTitle;
        this.finishTime = finishTime;
        this.bidAmount = bidAmount;
        this.amountRemain = amountRemain;
        this.bidDealAmount = bidDealAmount;
        this.serviceFee = serviceFee;
    }
}
