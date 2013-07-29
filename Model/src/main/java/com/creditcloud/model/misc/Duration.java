/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import static com.creditcloud.model.constant.TimeConstant.*;

/**
 * Object represent a certain duration including years/months and days
 *
 * @author sobranie
 */
public class Duration extends BaseObject {

    private final int years;

    private final int months;

    private final int days;
    
    public Duration(final int years,
                    final int months,
                    final int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    public Duration(int duration) {
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
    
    public int getTotalMonths () {
        return years * MONTHS_PER_YEAR + months;
    }
    
    public int getTotalDays () {
        return getTotalMonths() * DAYS_PER_MONTH + days;
    }
}
