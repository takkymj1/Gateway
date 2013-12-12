/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import static com.creditcloud.model.constant.TimeConstant.*;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Object represent a certain duration including years/months and days
 *
 * @author sobranie
 */
@XmlRootElement
public class Duration extends BaseObject implements Comparable<Duration> {

    private static final long serialVersionUID = 20130918L;

    @FormParam("years")
    @XmlElement(name = "years")
    private int years;

    @FormParam("months")
    @XmlElement(name = "months")
    private int months;

    @FormParam("days")
    @XmlElement(name = "days")
    private int days;

    public Duration() {
    }

    public Duration(final int years,
                    final int months,
                    final int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    /**
     * @deprecated use the other constructor
     * @param duration
     */
    public Duration(final int duration) {
        years = duration / DAYS_PER_YEAR;
        months = (duration % DAYS_PER_YEAR) / DAYS_PER_MONTH;
        days = duration - years * DAYS_PER_YEAR - months * DAYS_PER_MONTH;
    }

    public int getYears() {
        return years;
    }

    public int getMonths() {
        return months;
    }

    public int getDays() {
        return days;
    }

    public int getTotalMonths() {
        return years * MONTHS_PER_YEAR + months;
    }

    /**
     * @deprecated The return value is WRONG !
     * @return
     */
    public int getTotalDays() {
        return getTotalMonths() * DAYS_PER_MONTH + days;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(years).append(months).append(days).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Duration other = (Duration) obj;
        if (this.years != other.years) {
            return false;
        }
        if (this.months != other.months) {
            return false;
        }
        if (this.days != other.days) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Duration o) {
        if (!(years == o.years)) {
            return years > o.years ? 1 : -1;
        }
        if (!(months == o.months)) {
            return months > o.months ? 1 : -1;
        }
        if (!(days == o.days)) {
            return days > o.days ? 1 : -1;
        }
        return 0;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
