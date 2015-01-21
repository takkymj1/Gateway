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
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author xiongyong
 */
@XmlRootElement
@Data
@NoArgsConstructor
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


    public FundingExperienceApply(String id,
                         String projectId,
                         String rewardId,
                         String userId,
                         Date submitTime) {
        this.id = id;
        this.projectId = projectId;
        this.rewardId = rewardId;
        this.userId = userId;
        this.submitTime = submitTime;
    }
}