/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
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
public class FundingRewardRestriction extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    @NotNull
    private String projectId;

    @NotNull
    private String rewardId;
    
    /**
     * 
     */
    @NotNull
    private String restrictionKey;

    /**
     * 
     */
    @NotNull
    private String restrictionValue;
    
    /**
     * 
     */
    private Date startTime;

    /**
     * 
     */
    private Date endTime;

    public FundingRewardRestriction(String id,
                                    String projectId,
                                    String rewardId,
                                    String restrictionKey,
                                    String restrictionValue,
                                    Date startTime,
                                    Date endTime) {
        this.id = id;
        this.projectId = projectId;
        this.rewardId = rewardId;
        this.restrictionKey = restrictionKey;
        this.restrictionValue = restrictionValue;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
