/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.InvestEventType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.codehaus.jackson.annotate.JsonTypeInfo;

/**
 * 用户投资借款相关事件
 *
 * @author rooseek
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
@XmlSeeAlso(value = {
    InvestEvent.class
})
@Getter
@AllArgsConstructor
public class InvestEvent extends BaseObject implements Comparable<InvestEvent> {

    private static final long serialVersionUID = 20131015L;

    @NotNull
    @XmlElement(name = "eventType")
    private final InvestEventType eventType;

    @NotNull
    @XmlElement(name = "eventTime")
    private final Date eventTime;

    @NotNull
    @XmlElement(name = "amount")
    private final BigDecimal amount;

    public InvestEvent() {
        this.eventType = null;
        this.eventTime = null;
        this.amount = BigDecimal.ZERO;
    }


    @Override
    public int compareTo(InvestEvent o) {
        return eventTime.compareTo(o.getEventTime());
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventType).append(eventTime).append(amount).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InvestEvent other = (InvestEvent) obj;
        if (this.eventType != other.eventType) {
            return false;
        }
        if (!Objects.equals(this.eventTime, other.eventTime)) {
            return false;
        }
        if (this.amount.compareTo(other.amount) != 0) {
            return false;
        }
        return true;
    }
}
