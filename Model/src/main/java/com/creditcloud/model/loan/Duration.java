/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.Jsonizable;
import static com.creditcloud.model.constant.TimeConstant.*;
import javax.json.Json;

/**
 * Object represent a certain duration including years/months and days
 *
 * @author sobranie
 */
public class Duration extends BaseObject implements Comparable<Duration> ,Jsonizable<Duration>{

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
    
    
    @Override
    public Duration fromJsonString(String jsonString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toJsonString() {
        return Json.createObjectBuilder()
                .add("years", years)
                .add("months", months)
                .add("days", days)
                .build().toString();
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
