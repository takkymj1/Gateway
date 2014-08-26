/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.constant.LoanConstant;
import static com.creditcloud.model.constant.TimeConstant.DAYS_PER_MONTH;
import static com.creditcloud.model.constant.TimeConstant.MONTHS_PER_YEAR;
import com.creditcloud.model.constraints.IncrementalInteger;
import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.LocalDate;

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

    @Max(LoanConstant.MAX_LOAN_DURATION)
    public int getTotalMonths() {
        return years * MONTHS_PER_YEAR + months;
    }

    /**
     * @deprecated The return value is WRONG ! ONLY FOR VALIDATION
     * @return
     */
    @Min(1)
    public int getTotalDays() {
        return getTotalMonths() * DAYS_PER_MONTH + days;
    }

    /**
     * return copy of Duration minus specified number of months
     *
     * @param months
     * @return
     */
    public Duration minusMonths(int months) {
        if (months < 0) {
            return null;
        }
        int totalMonths = getTotalMonths() - months;
        if (totalMonths < 0) {
            return null;
        }
        int years_ = totalMonths / 12;
        int months_ = totalMonths - 12 * years_;
        int days_ = days;
        return new Duration(years_, months_, days_);
    }

    /**
     * return copy of Duration plus specified number of months
     *
     * @param months
     * @return
     */
    public Duration plusMonths(int months) {
        if (months < 0) {
            return null;
        }
        int totalMonths = getTotalMonths() + months;
        int years_ = totalMonths / 12;
        int months_ = totalMonths - 12 * years_;
        int days_ = days;
        return new Duration(years_, months_, days_);
    }

}
