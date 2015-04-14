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
public class TenderNoticeAssign04Request extends BaseRequest{
    private String loanTitle;
    private String assignUserName;
    private String creditAmount;
    private String investUserName;
    public TenderNoticeAssign04Request(String loanTitle,String assignUserName,
        String creditAmount,String investUserName){
        this.setTemplate_id("NOTI_ASSIGN_000004");
        this.loanTitle = loanTitle;
        this.assignUserName = assignUserName;
        this.creditAmount = creditAmount;
        this.investUserName = investUserName;
    }
}
