/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.InvestStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundingInvest extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    /**
     * project
     */
    @NotNull
    private String projectId;

    @NotNull
    private InvestStatus status;

    /**
     * amount pledged/donated/invested
     */
    @NotNull
    private BigDecimal amount;

    /**
     * corresponding reward
     */
    @NotNull
    private String rewardId;

    @NotNull
    private String userId;

    private String message;

    private Date timeRecorded;

    /**
     * eg:西直门大街1号金茂中心1102室</p>
     * or json string</p>
     */
    private String deliveryDetail;

}
