/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.misc.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static org.apache.commons.lang3.time.DateUtils.*;

/**
 *
 * @author sobranie
 */
public class DateUtils {

    private static final GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();

    public static Date offset(final Date asOfDate, final Duration duration) {
        Date result = addYears(asOfDate, duration.getYears());
        result = addMonths(result, duration.getMonths());
        result = addDays(result, duration.getDays());
        return result;
    }


    /*
     * list all dates between start date and end date, both day included
     */
    public static List<Date> listDates(Date start, Date end) {
        List<Date> dates = new ArrayList();

        Date date = start;
        calendar.setTime(start);
        while (date.before(end)) {
            dates.add(date);
            calendar.add(Calendar.DAY_OF_WEEK, 1);
            date = calendar.getTime();
        }
        if (date.equals(end)) {
            dates.add(end);
        }

        return dates;
    }
}
