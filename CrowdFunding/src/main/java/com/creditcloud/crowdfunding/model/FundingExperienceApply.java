/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author xiongyong
 * 众筹项目回报的申请体验
 * 
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundingExperienceApply extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    /**
     * project
     */
    @NotNull
    private String projectId;

    /**
     * corresponding reward
     */
    @NotNull
    private String rewardId;

    @NotNull
    private String userId;

    private Date submitTime;
}