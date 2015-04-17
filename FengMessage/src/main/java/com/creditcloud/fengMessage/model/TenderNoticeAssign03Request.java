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
public class TenderNoticeAssign03Request extends BaseRequest{
    
    private String userName;
    private String assignTitle;
    private String dealAmount;
    private String investAmount;
    
    public TenderNoticeAssign03Request(String assignTitle,String userName,
            String dealAmount,String investAmount){
        this.setTemplate_id("NOTI_ASSIGN_000003");
        this.userName = userName;
        this.assignTitle = assignTitle;
        this.dealAmount = dealAmount;
        this.investAmount = investAmount;
    }
}
