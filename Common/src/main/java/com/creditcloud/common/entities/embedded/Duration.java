/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.constant.LoanConstant;
import static com.creditcloud.model.constant.TimeConstant.MONTHS_PER_YEAR;
import com.creditcloud.model.constraints.IncrementalInteger;
import javax.persistence.Embeddable;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author sobranie
 */
@Embeddable
public class Duration extends BaseEntity implements Comparable<Duration> {

    @IncrementalInteger(min = 0,
                        increment = 1,
                        max = LoanConstant.MAX_LOAN_YEAR)
    private int years;

    @IncrementalInteger(min = 0,
                        increment = 1,
                        max = 11)
    private int months;

    @IncrementalInteger(min = 0,
                        increment = 1,
                        max = 31)
    private int days;

    public Duration() {
    }

    public Duration(int years, int months, int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
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
    
    public int getTotalMonths() {
        return years * MONTHS_PER_YEAR + months;
    }
}
