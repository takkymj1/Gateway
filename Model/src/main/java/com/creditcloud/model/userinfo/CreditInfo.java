/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.CreditRank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class CreditInfo extends BaseObject {

    //信用等级
    @NotNull
    private CreditRank creditRank;

    //信用评分
    @NotNull
    private int creditScore;

    //信用额度
    @NotNull
    private int creditLimit;

    //可用额度
    @NotNull
    private int creditAvailable;

    public CreditInfo() {
    }

    /**
     *
     * @param creditRank 信用等级
     * @param creditScore 信用评分
     * @param creditLimit 信用额度
     * @param creditAvailable 可用额度
     */
    public CreditInfo(CreditRank creditRank,
                      int creditScore,
                      int creditLimit,
                      int creditAvailable) {
        this.creditRank = creditRank;
        this.creditScore = creditScore;
        this.creditLimit = creditLimit;
        this.creditAvailable = creditAvailable;
    }

    public CreditRank getCreditRank() {
        return creditRank;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getCreditAvailable() {
        return creditAvailable;
    }

    public void setCreditRank(CreditRank creditRank) {
        this.creditRank = creditRank;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditAvailable(int creditAvailable) {
        this.creditAvailable = creditAvailable;
    }
}
