/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fengMessage.model;

import lombok.Data;

/**
 *
 * @author zhanggm
 * 站内信发送接口对象
 */
@Data
public class TenderMailTemplateRequest {
    private String userName;
    private String projectName;
    private String date;
    private String time;
    private String dealAmount;
    private String leftAmount;
    private String backAmount;
    private String serviceFee;
    
    public TenderMailTemplateRequest(String userName, String projectName,String date,String time,String dealAmount,String leftAmount,String backAmount,String serviceFee){
        this.userName = userName;
        this.projectName = projectName;
        this.date = date;
        this.time = time;
        this.dealAmount = dealAmount;
        this.leftAmount = leftAmount;
        this.backAmount = backAmount;
        this.serviceFee = serviceFee;
    }
}
