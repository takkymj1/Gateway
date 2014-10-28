/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
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
public class FundingReward extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    @NotNull
    @PathParam("projectId")
    private String projectId;

    /**
     * donate/invest/pledge amount
     */
    @NotNull
    @FormParam("amount")
    private BigDecimal amount;

    /**
     * reward number limit
     */
    @NotNull
    @FormParam("limitNumber")
    private int limitNumber;

    /**
     * number raised
     */
    @NotNull
    private int raiseNumber;

    /**
     * return description
     */
    @NotNull
    @FormParam("description")
    private String description;

    /**
     * delivery cost, area, time ...</p>
     * can be json
     */
    @FormParam("deliveryDetail")
    private String deliveryDetail;

    /**
     * hard limit
     */
    private boolean hardLimit;

    /**
     * amount actual raised
     */
    private BigDecimal raiseAmount;

    /**
     * 预计回报发送时间
     */
    private String deliveryTime;

    public FundingReward(String id,
                         String projectId,
                         BigDecimal amount,
                         int limitNumber,
                         String description,
                         String deliveryDetail) {
        this.id = id;
        this.projectId = projectId;
        this.amount = amount;
        this.limitNumber = limitNumber;
        this.description = description;
        this.deliveryDetail = deliveryDetail;
    }

    public FundingReward(String id,
                         String projectId,
                         BigDecimal amount,
                         int limitNumber,
                         String description,
                         String deliveryDetail,
                         String deliveryTime) {
        this.id = id;
        this.projectId = projectId;
        this.amount = amount;
        this.limitNumber = limitNumber;
        this.description = description;
        this.deliveryDetail = deliveryDetail;
        this.deliveryTime = deliveryTime;
    }

    /**
     * left number
     *
     * @return
     */
    public int getLeftNumber() {
        int result = limitNumber - raiseNumber;
        return result < 0 ? 0 : result;
    }
}
