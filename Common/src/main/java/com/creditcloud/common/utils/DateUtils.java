/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.constant.GlobalConstant;
import com.creditcloud.model.constant.TimeConstant;
import com.creditcloud.model.loan.Duration;
import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;
import static org.apache.commons.lang3.time.DateUtils.addDays;
import static org.apache.commons.lang3.time.DateUtils.addMonths;
import static org.apache.commons.lang3.time.DateUtils.addYears;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sobranie
 */
@Slf4j
public class DateUtils {

    private static final GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();

    public static final Date FIRST_DATE = new Date(0);
    
    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);
    
    private static final  String DATE_FORMAT_TEMPLATE = "yyyy-MM-dd";

    private static final DateTimeFormatter format = DateTimeFormat.forPattern(DATE_FORMAT_TEMPLATE);
    
    /** 锁对象 */
    private static final Object lockObj = new Object();

    /** 存放不同的日期模板格式的sdf的Map */
    private static Map<String, ThreadLocal<SimpleDateFormat>> sdfMap = new HashMap<String, ThreadLocal<SimpleDateFormat>>();
    
    /**
     * 返回一个ThreadLocal的sdf,每个线程只会new一次sdf
     * 
     * @param pattern
     * @return
     */
    private static SimpleDateFormat getSdf(final String pattern) {
        ThreadLocal<SimpleDateFormat> tl = sdfMap.get(pattern);

        // 此处的双重判断和同步是为了防止sdfMap这个单例被多次put重复的sdf
        if (tl == null) {
            synchronized (lockObj) {
                tl = sdfMap.get(pattern);
                if (tl == null) {
                    // 只有Map中还没有这个pattern的sdf才会生成新的sdf并放入map
                    // 这里是关键,使用ThreadLocal<SimpleDateFormat>替代原来直接new SimpleDateFormat
                    tl = new ThreadLocal<SimpleDateFormat>() {
                        @Override
                        protected SimpleDateFormat initialValue() {
                            return new SimpleDateFormat(pattern);
                        }
                    };
                    sdfMap.put(pattern, tl);
                }
            }
        }
        return tl.get();
    }
    
     /**
     * 是用ThreadLocal<SimpleDateFormat>来获取SimpleDateFormat,这样每个线程只会有一个SimpleDateFormat
     * 
     * @param date
     * @param pattern
     * @return
     */
    public static String format(Date date) {
        return getSdf(DATE_FORMAT_TEMPLATE).format(date);
    }

    public static Date parse(String dateStr) throws ParseException {
        return getSdf(DATE_FORMAT_TEMPLATE).parse(dateStr);
    }

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
     * return the 0'clock time for a date, like 2013/8/1 23:59:59
     *
     * @param date
     * @return
     */
    public static Date get24OClock(Date date) {
        if (date == null) {
            return null;
        }

        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(year, month, day, 23, 59, 59);
        return calendar.getTime();
    }
    
    /**
     * return the 0'clock time for a date, like 2013/8/1 22:59:59
     *
     * @param date
     * @return
     */
    public static Date getCustomClock(Date date, int hourOfDay, int minute, int second) {
        if (date == null) {
            return null;
        }

        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(year, month, day, hourOfDay, minute, second);
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
    
    /**
     * 判断当前日期是否是周末或节假日
     * @param currentDate
     * @return 
     */
    public static boolean isPublicHoliday(LocalDate currentDate) {
        boolean isHoliday = false;
        //读取假日文件，判断假日文件中是否有当天
        File holidayFile = new File(GlobalConstant.CREDITCLOUD_HOME + File.separator + "holiday");
        if (holidayFile.canRead()) {
            try (Scanner scanner = new Scanner(holidayFile)) {
                while (scanner.hasNextLine()) {
                    if (scanner.nextLine().contains(currentDate.toString("yyyyMMdd"))) {
                        isHoliday = true;
                        break;
                    }
                }
            } catch (Exception ex) {
                logger.error("Can't use scanner on holiday file.");
            }
        }
        return isHoliday;
    }
    
    /**
     * 查找下一个工作日
     * @param currentDate 周末或者节假日
     * @return 
     */
    public static LocalDate nextWorkingDay(LocalDate currentDate) {
        boolean isPublicHoliday = isPublicHoliday(currentDate);
        //找周末或者节假日的下一个工作日
        if (isPublicHoliday) {
            currentDate = currentDate.plusDays(1);
            return nextWorkingDay(currentDate);
        }
        return currentDate;
    }

    /**
     * 判断日期是否在区间内
     * @param start 开始日期 2015-03-24
     * @param end 结束日期 2015-06-23
     * @param signDate 需要判断的日期
     * @return
     */
    public static boolean isDayBetween(Date start, Date end, Date signDate){
        DateTime t1 = DateTime.parse(new DateTime(start).toString("yyyy-MM-dd"),format);
        DateTime t2 = DateTime.parse(new DateTime(end).toString("yyyy-MM-dd"),format);
        DateTime sd = DateTime.parse(new DateTime(signDate).toString("yyyy-MM-dd"),format);
        
        if (t1.compareTo(sd)<=0 && t2.compareTo(sd)>=0){
            return true;
        }

        return  false;
    }

}
