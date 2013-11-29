/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.credit.CreditRank;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class AutoBidRange extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    private int minRate;

    private int maxRate;

    private int minDuration;

    private int maxDuration;

    private CreditRank minCredit;

    private CreditRank maxCredit;

    public AutoBidRange() {
    }

    public AutoBidRange(int minRate,
                        int maxRate,
                        int minDuration,
                        int maxDuration,
                        CreditRank minCredit,
                        CreditRank maxCredit) {
        this.minRate = minRate;
        this.maxRate = maxRate;
        this.minDuration = minDuration;
        this.maxDuration = maxDuration;
        this.minCredit = minCredit;
        this.maxCredit = maxCredit;
    }

    public int getMinRate() {
        return minRate;
    }

    public int getMaxRate() {
        return maxRate;
    }

    public int getMinDuration() {
        return minDuration;
    }

    public int getMaxDuration() {
        return maxDuration;
    }

    public CreditRank getMinCredit() {
        return minCredit;
    }

    public CreditRank getMaxCredit() {
        return maxCredit;
    }

    public void setMinRate(int minRate) {
        this.minRate = minRate;
    }

    public void setMaxRate(int maxRate) {
        this.maxRate = maxRate;
    }

    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }

    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }

    public void setMinCredit(CreditRank minCredit) {
        this.minCredit = minCredit;
    }

    public void setMaxCredit(CreditRank maxCredit) {
        this.maxCredit = maxCredit;
    }
}
