/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import javax.persistence.Embeddable;
import lombok.Data;

/**
 * 投资的额度限制
 *
 * @author rooseek
 */
@Data
@Embeddable
public class InvestQuota extends BaseEntity {

    private static final long serialVersionUID = 20140102L;

    /**
     * 最小投资额
     */
    private int minAmount;

    /**
     * 最大投资额
     */
    private int maxAmount;

    /**
     * 投资金额增量
     */
    private int stepAmount;

    public InvestQuota() {
    }

    public InvestQuota(int minAmount, int maxAmount, int stepAmount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.stepAmount = stepAmount;
    }
}
