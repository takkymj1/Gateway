/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.crowdfunding.enums.ProjectCategory;
import com.creditcloud.crowdfunding.enums.ProjectStatus;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@XmlRootElement
@Data
@NoArgsConstructor
public class FundingProject extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    @FormParam("id")
    private String id;
    
    /**
     * 编号
     */
    @FormParam("code")
    private String code;
    
    @NotNull
    @FormParam("title")
    private String title;
    
    /**
     * 简称
     */
    @FormParam("shortTitle")
    private String shortTitle;
    
    private ProjectStatus status;

    /**
     * project proposer
     */
    @NotNull
    @FormParam("userId")
    private String userId;

    /**
     * goal amount
     */
    @NotNull
    @FormParam("goalAmount")
    private BigDecimal goalAmount;

    /**
     * actual amount raised
     */
    @NotNull
    private BigDecimal raiseAmount;

    /**
     * raised number
     */
    @NotNull
    private int raiseNumber;

    private Date openTime;

    private Date finishTime;

    /**
     * time unit:hour
     */
    @NotNull
    @FormParam("timeOut")
    private int timeOut;

    /**
     * video url
     */
    @FormParam("videoUrl")
    private String videoUrl;

    @NotNull
    @FormParam("introduction")
    private String introduction;

    @FormParam("detail")
    private String detail;

    @FormParam("location")
    private String location;
    
    private ProjectCategory category;

    private int favorite;

    /**
     * amount already loaned
     */
    private BigDecimal loanAmount;

    /**
     * project without reward, reward is mandatory most of the time
     */
    private boolean noReward;

    /**
     * 发起人信息
     */
    @FormParam("qualification")
    private String qualification;//资质

    @FormParam("blog")
    private String blog;//博客

    @FormParam("website")
    private String website;//网址

    @FormParam("email")
    private String email;//联系邮箱

    @FormParam("mobile")
    private String mobile;//联系电话

    @FormParam("selfDescription")
    private String selfDescription;//自我介绍

    @FormParam("detailDescription")
    private String detailDescription;//详细介绍

    @FormParam("acknowledgement")
    private String acknowledgement;//感谢信
    /**
     * 发起人全称
     */
    @FormParam("publisherTitle")
    private String publisherTitle;
    
    private String productId;
    
    //众筹项目的序号,平台可以自定义,允许重复，对于历史数据则为null
    private Integer ordinal;
    
    /**
     * 只有项目，没有后续放款等
     */
    private boolean pureRequest;
    /**
     * 项目创建时间 
     */
    private Date timeCreated;
   
    /**
     * 企业
     */
    private String corporationId;
    
    /**
     * 产品风险等级
     */
    @FormParam("riskLevel")
    private String riskLevel;
    
    public FundingProject(String id,
                          String title,
                          ProjectStatus status,
                          String userId,
                          BigDecimal goalAmount,
                          int timeOut,
                          Date openTime,
                          Date finishTime,
                          String videoUrl,
                          String introduction,
                          String detail,
                          String location) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.userId = userId;
        this.goalAmount = goalAmount;
        this.timeOut = timeOut;
        this.openTime = openTime;
        this.finishTime = finishTime;
        this.videoUrl = videoUrl;
        this.introduction = introduction;
        this.detail = detail;
        this.location = location;
    }

    
    public FundingProject(String id,
                          String title,
                          ProjectStatus status,
                          String userId,
                          BigDecimal goalAmount,
                          int timeOut,
                          Date openTime,
                          Date finishTime,
                          String videoUrl,
                          String introduction,
                          String detail,
                          String location,
                          Date timeCreated) {
       this(id,title,status,userId,goalAmount,timeOut,openTime,finishTime,videoUrl,introduction,detail,location);
       this.timeCreated = timeCreated;
    }
    /**
     * TODO legacy dirty code. to be removed
     *
     * @return
     */
    public BigDecimal getLoanAmont() {
        return loanAmount == null ? BigDecimal.ZERO : loanAmount;
    }

    public BigDecimal getLoanAmount() {
        return getLoanAmont();
    }
}
