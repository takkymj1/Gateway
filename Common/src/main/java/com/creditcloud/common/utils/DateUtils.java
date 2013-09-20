/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.loan.Duration;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static org.apache.commons.lang3.time.DateUtils.*;
import org.joda.time.LocalDate;

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

    /**
     * Joda Time versoin of offset
     *
     * @param asOfDate
     * @param duration
     * @return
     */
    public static LocalDate offset(LocalDate asOfDate, Duration duration) {
        return asOfDate.plusDays(duration.getDays()).plusMonths(duration.getMonths()).plusYears(duration.getYears());
    }

    /**
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

    /**
     * return the 0'clock time for a date, like 2013/8/1 0:0:0
     *
     * @param date
     * @return
     */
    public static Date get0OClock(Date date) {
        if (date == null) {
            return null;
        }

        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(year, month, day, 0, 0, 0);
        return calendar.getTime();
    }
    
    /**
     * 为使stock曲线平滑，填满遗漏的值
     *
     * @param data
     */
    public static void enrichStockData(Map<LocalDate, BigDecimal> data) {
        Entry<LocalDate, BigDecimal> current = null;
        Map<LocalDate, BigDecimal> extraData = new HashMap<>();
        for (Entry<LocalDate, BigDecimal> entry : data.entrySet()) {
            if (current == null) {
                current = entry;
            } else {
                LocalDate date = current.getKey().plusDays(1);
                while (date.isBefore(entry.getKey())) {
                    extraData.put(date, current.getValue());
                    date = date.plusDays(1);
                }
                current = entry;
            }
        }
        data.putAll(extraData);
    }
}
