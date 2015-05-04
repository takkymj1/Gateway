/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fengMessage.model.base;

import com.creditcloud.model.BaseObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author zhanggm
 */
@Data
@NoArgsConstructor
public class BaseRequest extends BaseObject {
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy年MM月dd日");
    private static final SimpleDateFormat DATETIME_FORMATTER =  new SimpleDateFormat("yyyy年MM月dd日 hh:mm");
    
    protected String template_id;
    
    private static final ThreadLocal<SimpleDateFormat> formatLocal = new ThreadLocal<SimpleDateFormat>() {  
        @Override
        public SimpleDateFormat initialValue() {  
            return DATE_FORMATTER;  
        }  
    };
    
    public static String format(Date date) {
        return formatLocal.get().format(date);
    }

    public static Date parse(String dateStr) throws ParseException {
        return formatLocal.get().parse(dateStr);
    }
    
    private static final ThreadLocal<SimpleDateFormat> dateTimeFormatLocal = new ThreadLocal<SimpleDateFormat>() {  
        @Override
        public SimpleDateFormat initialValue() {  
            return DATETIME_FORMATTER;  
        }  
    };
    
    public static String formatByDateTime(Date date) {
        return dateTimeFormatLocal.get().format(date);
    }

    public static Date parseByDateTime(String dateStr) throws ParseException {
        return dateTimeFormatLocal.get().parse(dateStr);
    }
    
}
