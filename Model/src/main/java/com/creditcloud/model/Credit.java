/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.user.CreditRank;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * 用户信用及认证
 *
 * @author rooseek
 */
public class Credit extends BaseObject {
    @Id
    private String id;

    @NotNull
    private String userId;

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

    public Credit() {
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

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getId() {
        return id;
    }
}
