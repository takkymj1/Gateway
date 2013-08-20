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
     * 默认的借款标募集期
     */
    int DEFAULT_LOAN_OPEN_HOURS = 72;
    
    /**
     * yyyy-MM-dd
     */
    SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    
    /**
     * yy年M月d日
     */
    SimpleDateFormat SIMPLE_CHINESE_DATE_FORMAT = new SimpleDateFormat("yy年M月d日");
}
