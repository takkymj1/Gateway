/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.constraints.IncrementalInteger;
import javax.persistence.Embeddable;

/**
 *
 * @author sobranie
 */
@Embeddable
public class Duration extends BaseEntity implements Comparable<Duration> {

    @IncrementalInteger(min = 0,
                        increment = 1,
                        /**
                         * 最长三年
                         */
                        max = 3)
    private int years;

    @IncrementalInteger(min = 0,
                        increment = 1,
                        max = 12)
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
}
