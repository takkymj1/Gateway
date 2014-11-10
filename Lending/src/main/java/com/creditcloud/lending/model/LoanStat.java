/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 贷款分项统计
 *
 * @author rooseek
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(value = {
    LoanStatus.class,
    RepaymentMethod.class,
    Source.class,
    Boolean.class})
public class LoanStat<T> extends BaseObject {

    private static final long serialVersionUID = 20131029L;

    private T elememt;

    private int count;

    private long sum;

    public LoanStat() {
    }

    public LoanStat(T elememt, int count, long sum) {
        this.elememt = elememt;
        this.count = count;
        this.sum = sum;
    }

    public T getElememt() {
        return elememt;
    }

    public int getCount() {
        return count;
    }

    public long getSum() {
        return sum;
    }

    public void setElememt(T elememt) {
        this.elememt = elememt;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
