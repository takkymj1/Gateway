/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.fund;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.credit.CreditRank;

/**
 *
 * @author rooseek
 */
public class AutoBidRange extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    private final int minRate;

    private final int maxRate;

    private final int minDuration;

    private final int maxDuration;

    private final CreditRank minCredit;

    private final CreditRank maxCredit;

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
}
