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
    
    SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
}
