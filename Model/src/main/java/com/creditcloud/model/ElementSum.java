/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 按照element区分来统计某项数据之和，主要用于前端页面显示用<p>
 * 例如：按年度统计平台上所有p2p公司的贷款金额和利息收入总和
 *
 * @author rooseek
 * @see ElementCount 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(value = {
    LoanStatus.class,
    InvestStatus.class,
    Date.class
})
public class ElementSum<T> extends BaseObject{

    private static final long serialVersionUID = 20131012L;

    private T element;

    private BigDecimal sum;

    public ElementSum() {
    }

    public ElementSum(T element, BigDecimal sum) {
        this.element = element;
        this.sum = sum;
    }

    public T getElement() {
        return element;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
}
