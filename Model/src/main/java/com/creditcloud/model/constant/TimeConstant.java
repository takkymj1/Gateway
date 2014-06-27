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

    int DAYS_PER_MONTH  = 30;
    
    int MONTHS_PER_YEAR = 12;
    
    /**
     * yyyyMMdd
     */
    SimpleDateFormat SHORT_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
    
    /**
     * yyyy-MM-dd
     */
    SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    
    /**
     * yy年M月d日
     */
    SimpleDateFormat SIMPLE_CHINESE_DATE_FORMAT = new SimpleDateFormat("yy年M月d日");
    
    /**
     * yyyy年M月d日
     */
    SimpleDateFormat CHINESE_DATE_FORMAT = new SimpleDateFormat("yyyy年M月d日");
    
    /**
     * yy年M月d日 HH:mm
     */
    SimpleDateFormat SIMPLE_TIME_FORMAT = new SimpleDateFormat("yy年M月d日 HH:mm");
}
