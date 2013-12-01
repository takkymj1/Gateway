/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 自动投标信息统计，主要用于在CreditManager中查看
 *
 * @author rooseek
 */
@XmlRootElement
public class AutoBidStatistics extends BaseObject {

    private static final long serialVersionUID = 20131027L;

    /**
     * 开启自动投标的总数
     */
    private int active;

    /**
     * 开启自动投标的总金额
     */
    private long activeAmount;

    /**
     * 开启自动投标有效总数，投标设置正确且账户有足够余额
     */
    private int valid;

    /**
     * 开启自动投标有效总金额
     */
    private long validAmount;

    public AutoBidStatistics() {
    }

    public AutoBidStatistics(int active,
                             long activeAmount,
                             int valid,
                             long validAmount) {
        this.active = active;
        this.activeAmount = activeAmount;
        this.valid = valid;
        this.validAmount = validAmount;
    }

    public int getActive() {
        return active;
    }

    public long getActiveAmount() {
        return activeAmount;
    }

    public int getValid() {
        return valid;
    }

    public long getValidAmount() {
        return validAmount;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public void setActiveAmount(long activeAmount) {
        this.activeAmount = activeAmount;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public void setValidAmount(long validAmount) {
        this.validAmount = validAmount;
    }
}
