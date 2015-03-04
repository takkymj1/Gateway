/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author xiongyong
 */
@XmlRootElement
@Data
@NoArgsConstructor
public class FundingDream extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    
    
    /*
     * project proposer
     */
    @NotNull
    private String userId;
    
    private String title;
    
    private int timeOut;
    
    private String purpose;
    
    private String detail;
    
    private String website;//网址
    
    private String contactName;
    
    private String contactMobile;
    
    private String selfDescription;//自我介绍

    
    //private List<FundingReward> fundingRewardList = null;
    
    public FundingDream(String id,
                          String userId,
                          String title,
                          int timeOut,
                          String purpose,
                          String detail,
                          String website,
                          String contactName,
                          String contactMobile,
                          String selfDescription) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.timeOut = timeOut;
        this.purpose = purpose;
        this.detail = detail;
        this.website = website;
        this.contactName = contactName;
        this.contactMobile = contactMobile;
        this.selfDescription = selfDescription;
    }
}