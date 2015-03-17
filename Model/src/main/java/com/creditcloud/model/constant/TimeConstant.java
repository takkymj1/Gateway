/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

import java.text.SimpleDateFormat;

/**
 *
 * @author sobranie
 */
public interface TimeConstant {

    int DAYS_PER_YEAR = 365;

    int DAYS_PER_MONTH = 30;

    int MONTHS_PER_YEAR = 12;

    /**
     * yyyyMMdd
     */
    @Deprecated
    SimpleDateFormat SHORT_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");

    /**
     * yyyy-MM-dd
     */
    @Deprecated
    SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * yy年M月d日
     */
    @Deprecated
    SimpleDateFormat SIMPLE_CHINESE_DATE_FORMAT = new SimpleDateFormat("yy年M月d日");

    /**
     * yyyy年M月d日
     */
    @Deprecated
    SimpleDateFormat CHINESE_DATE_FORMAT = new SimpleDateFormat("yyyy年M月d日");

    /**
     * yy年M月d日 HH:mm
     */
    @Deprecated
    SimpleDateFormat SIMPLE_TIME_FORMAT = new SimpleDateFormat("yy年M月d日 HH:mm");

}
