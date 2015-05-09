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

    private String id;

    @NotNull
    private String title;

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
    private String qualification;//资质

    private String blog;//博客

    private String website;//网址

    private String email;//联系邮箱

    private String mobile;//联系电话

    private String selfDescription;//自我介绍

    private String detailDescription;//详细介绍

    private String acknowledgement;//感谢信
    
    private String productId;
    
    //众筹项目的序号,平台可以自定义,允许重复，对于历史数据则为null
    private Integer ordinal;
    
    /**
     * 只有项目，没有后续放款等
     */
    private boolean pureRequest;

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
