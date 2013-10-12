/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.loan.LoanStatus;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * TODO逐步将AnalysisData替换成该类
 *
 * @author rooseek
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(value = {
    LoanStatus.class
})
public class ElementCount<T> extends BaseObject {

    private static final long serialVersionUID = 20131012L;

    private T element;

    @Min(0)
    private long count;

    public ElementCount() {
    }

    public ElementCount(T element, long count) {
        this.element = element;
        this.count = count;
    }

    public T getElement() {
        return element;
    }

    public long getCount() {
        return count;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
