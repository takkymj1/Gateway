/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
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

    private String projectId;

    /**
     * 投资金额
     */
    private BigDecimal amount;

    /**
     * 限定名额
     */
    private int limit;

    /**
     * 回报内容
     */
    private String description;

    /**
     * 回报/交付时间:项目结束后**天
     */
    private String deliveryTime;

}
