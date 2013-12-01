/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 自动投标的排名信息，只统计与本自动投标策略有交集的样本集
 *
 * @author rooseek
 */
@XmlRootElement
public class AutoBidRank extends BaseObject {

    private static final long serialVersionUID = 20131027L;

    /**
     * 开启自动投标的总数
     */
    private int total;

    /**
     * 开启自动投标的总金额
     */
    private long totalAmount;

    /**
     * 本投标的排名
     */
    private int rank;

    /**
     * 本投标前面排队的总金额
     */
    private long rankAmount;

    public AutoBidRank() {
    }

    public AutoBidRank(int total, 
                       long totalAmount, 
                       int rank, 
                       long rankAmount) {
        this.total = total;
        this.totalAmount = totalAmount;
        this.rank = rank;
        this.rankAmount = rankAmount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public long getRankAmount() {
        return rankAmount;
    }

    public void setRankAmount(long rankAmount) {
        this.rankAmount = rankAmount;
    }

}
