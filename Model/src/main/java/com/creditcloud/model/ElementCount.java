/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.user.credit.CertificateType;
import com.creditcloud.model.enums.user.credit.CreditRank;
import com.creditcloud.model.enums.user.credit.ProofType;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.joda.time.LocalDate;

/**
 * 按element区分来统计某项实体的个数，主要用于前端页面显示用<p>
 * 例如：按月份统计某借款人的贷款申请数目
 *
 * @author rooseek
 *
 * @see ElementSum
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(value = {
    LoanStatus.class,
    InvestStatus.class,
    RepaymentMethod.class,
    Source.class,
    ProofType.class,
    CertificateType.class,
    CreditRank.class,
    Boolean.class,
    Date.class,
    LocalDate.class
})
public class ElementCount<T> extends BaseObject {

    private static final long serialVersionUID = 20131012L;

    private T element;

    @Min(0)
    private int count;

    public ElementCount() {
    }

    public ElementCount(T element, int count) {
        this.element = element;
        this.count = count;
    }

    public T getElement() {
        return element;
    }

    public int getCount() {
        return count;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
