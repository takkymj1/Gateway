/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.crowdfunding.enums.FundingDreamTag;
import com.creditcloud.model.BaseObject;
import java.util.Date;
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
    
    @NotNull
    private String userId;
    
    private String title;
    
    private int timeOut;
    
    private String purpose;
    
    private String detail;
    
    private FundingDreamTag tag;
    
    private String website;
    
    private String videoUrl;
    
    private String contactName;
    
    private String contactMobile;
    
    private String selfDescription;//自我介绍
    
    private Date createTime;//创建时间
    
    //private List<FundingReward> fundingRewardList = null;
    
    public FundingDream(String id,
                          String userId,
                          String title,
                          int timeOut,
                          String purpose,
                          String detail,
                          String website,
                          String videoUrl,
                          FundingDreamTag tag,
                          String contactName,
                          String contactMobile,
                          Date createTime,
                          String selfDescription) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.timeOut = timeOut;
        this.purpose = purpose;
        this.detail = detail;
        this.website = website;
        this.videoUrl = videoUrl;
        this.tag = tag;
        this.contactName = contactName;
        this.contactMobile = contactMobile;
        this.createTime = createTime;
        this.selfDescription = selfDescription;
    }
}