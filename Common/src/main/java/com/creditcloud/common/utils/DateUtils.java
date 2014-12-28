/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.constant.TimeConstant;
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
import lombok.extern.slf4j.Slf4j;

import static org.apache.commons.lang3.time.DateUtils.*;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author sobranie
 */
@Slf4j
public class DateUtils {

    private static final GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();

    public static final Date FIRST_DATE = new Date(0);

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
     *
     * @param start
     * @param end
     * @return
     */
    public static List<Date> listDates(Date start, Date end) {
        List<Date> dates = new ArrayList<>();

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

    /**
     * 根据身份证号计算年龄，按照周岁计算
     *
     * @param idNumber
     * @return 0 idNumber格式错误
     */
    public static int getAgeFromIdNumber(String idNumber) {
        LocalDate birthday = LocalDate.now();
        try {
            if (idNumber.length() == 18) {
                birthday = LocalDate.parse(idNumber.substring(6, 14), DateTimeFormat.forPattern("yyyyMMdd"));
            } else if (idNumber.length() == 15) {
                birthday = LocalDate.parse(idNumber.substring(6, 12), DateTimeFormat.forPattern("yyMMdd"));
            }
        } catch (Exception ex) {
            log.error("Error happend when parse age from idNumber.[idNumber={}]", idNumber, ex);
        }
        return Years.yearsBetween(birthday, LocalDate.now()).getYears();
    }

    /**
     * 根据总月份计算Duration
     *
     * @param totalMonths
     * @return
     */
    public static Duration getDurationFromMonths(int totalMonths) {
        int months = totalMonths % TimeConstant.MONTHS_PER_YEAR;
        int years = (totalMonths - months) / TimeConstant.MONTHS_PER_YEAR;
        return new Duration(years, months, 0);
    }

    /**
     * 判断某天是否为周末
     *
     * @param date
     * @return
     */
    public static boolean isWeekend(LocalDate date) {
        if (date == null) {
            return false;
        }
        int dayOfWeek = date.getDayOfWeek();
        return DateTimeConstants.SATURDAY == dayOfWeek || DateTimeConstants.SUNDAY == dayOfWeek;
    }
}
