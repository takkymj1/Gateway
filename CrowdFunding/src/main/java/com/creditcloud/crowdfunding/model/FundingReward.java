/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
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
    private String projectId;

    /**
     * donate/invest/pledge amount
     */
    @NotNull
    private BigDecimal amount;

    /**
     * reward number limit
     */
    @NotNull
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
    private String description;

    /**
     * return/delivery time :项目结束后**天
     */
    @NotNull
    private String deliveryTime;

    /**
     * delivery cost, area ...
     */
    private String deliveryDetail;

    /**
     * hard limit
     */
    private boolean hardLimit;

    /**
     * amount actual raised
     */
    private BigDecimal raiseAmount;

    public FundingReward(String id,
                         String projectId,
                         BigDecimal amount,
                         int limitNumber,
                         int raiseNumber,
                         String description,
                         String deliveryTime,
                         String deliveryDetail) {
        this.id = id;
        this.projectId = projectId;
        this.amount = amount;
        this.limitNumber = limitNumber;
        this.raiseNumber = raiseNumber;
        this.description = description;
        this.deliveryTime = deliveryTime;
        this.deliveryDetail = deliveryDetail;
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
