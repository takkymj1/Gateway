/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.taglib;

import java.io.IOException;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sobranie
 */
public class TimeTagHandler extends SimpleTagSupport {
    
    Logger logger = LoggerFactory.getLogger(TimeTagHandler.class);
    
    /**
     * 时间(毫秒)
     */
    private long time;
    
    @Override
    public void doTag() throws JspException {
        
        if (time < 0) {
            logger.warn("Illegal time.[time={}]", time);
            return;
        }
        
        //Get JSP Context
        JspContext jspContext = getJspContext();
        
        int seconds, minuts = 0, hours = 0, days = 0;
        StringBuilder sb = new StringBuilder();
        
        time = time - time % 1000;
        seconds = (int) (time / 1000);
        if (seconds > 60) {
            minuts = (seconds - seconds % 60) / 60;
            seconds = seconds % 60;
            if (minuts > 60) {
                hours = (minuts - minuts % 60) / 60;
                minuts = minuts % 60;
                if (hours > 24) {
                    days = (hours - hours % 24) / 24;
                    hours = hours % 24;
                }
            }
        }
        
        if (days > 0) {
            sb.append(days).append("天 ");
        }
        if (hours > 0) {
            sb.append(hours).append("小时 ");
        }
        if (minuts > 0) {
            sb.append(minuts).append("分 ");
        }
        if (seconds > 0) {
            sb.append(seconds).append("秒");
        }
        
        try {
            jspContext.getOut().write(sb.toString());
        } catch (IOException ex) {
            logger.error("Error happends", ex);
        }
    }
    
    public void setTime(long time) {
        this.time = time;
    }
    
}
