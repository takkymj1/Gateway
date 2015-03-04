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
public class FundingDreamReward extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    @NotNull
    private String dreamId;

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
     * return description
     */
    @NotNull
    @FormParam("description")
    private String description;

    
    public FundingDreamReward(String id,
                         String dreamId,
                         BigDecimal amount,
                         int limitNumber,
                         String description) {
        this.id = id;
        this.dreamId = dreamId;
        this.amount = amount;
        this.limitNumber = limitNumber;
        this.description = description;
    }


}