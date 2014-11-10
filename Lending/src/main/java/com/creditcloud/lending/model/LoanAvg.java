/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 统计贷款平均值
 *
 * @author rooseek
 */
@XmlRootElement
public class LoanAvg extends BaseObject {

    private static final long serialVersionUID = 20131029L;

    /**
     * 金额
     */
    private int amount;

    /**
     * 利率
     */
    private int rate;

    /**
     * 期限
     */
    private double days;

    /**
     * 投标数
     */
    private double bidNumber;

    /**
     * 满标花费时间，单位毫秒
     */
    private long bidTime;

    public LoanAvg() {
    }

    public LoanAvg(int amount,
                   int rate,
                   double days,
                   double bidNumber,
                   long bidTime) {
        this.amount = amount;
        this.rate = rate;
        this.days = days;
        this.bidNumber = bidNumber;
        this.bidTime = bidTime;
    }

    public int getAmount() {
        return amount;
    }

    public int getRate() {
        return rate;
    }

    public double getBidNumber() {
        return bidNumber;
    }

    public long getBidTime() {
        return bidTime;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setBidNumber(double bidNumber) {
        this.bidNumber = bidNumber;
    }

    public void setBidTime(long bidTime) {
        this.bidTime = bidTime;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }
}
