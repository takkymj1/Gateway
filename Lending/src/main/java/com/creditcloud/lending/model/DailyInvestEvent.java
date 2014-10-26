/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import java.util.Collection;
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
import org.codehaus.jackson.annotate.JsonTypeInfo;

/**
 *
 * @author rooseek
 */
@Getter
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
@XmlSeeAlso(value = {
    DailyInvestEvent.class
})
public class DailyInvestEvent extends BaseObject implements Comparable<DailyInvestEvent> {

    private static final long serialVersionUID = 20131015L;

    @NotNull
    @XmlElement(name = "date")
    private final Date date;

    //events中的event必須是排序的
    @NotNull
    @XmlElement(name = "events")
    private final Collection<InvestEvent> events;

    public DailyInvestEvent() {
        this.date = new Date();
        this.events = null;
    }


    @Override
    public int compareTo(DailyInvestEvent o) {
        return date.compareTo(o.getDate());
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DailyInvestEvent other = (DailyInvestEvent) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
}
