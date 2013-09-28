/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.taglib;

import com.creditcloud.common.utils.DTOUtils;
import com.creditcloud.model.loan.Duration;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sobranie
 */
public class DurationHandler extends SimpleTagSupport {
    
    private static final String YEAR = "年";
    
    private static final String MONTH = "个月";
    
    private static final String DAY = "天";
    
    private static final String AND = "零";

    static Logger logger = LoggerFactory.getLogger(DurationHandler.class);

    Duration duration;
    
    @Override
    public void doTag() throws JspException, IOException {
        if (duration == null) {
            return ;
        }
        JspWriter writer = getJspContext().getOut();
        int years = duration.getYears();
        int months = duration.getMonths();
        int days = duration.getDays();
        StringBuilder sb = new StringBuilder();
        if (years != 0) {
            sb.append(years).append(YEAR);
            if (months != 0 || days != 0) {
                sb.append(AND);
            }
        }
        if (months != 0) {
            sb.append(months).append(MONTH);
            if (days != 0) {
                sb.append(AND);
            }
        }
        if (days != 0) {
            sb.append(days).append(DAY);
        }
        writer.write(sb.toString());
    }

    public void setDuration(Object duration) {
        if (duration instanceof Duration) {
            this.duration = (Duration) duration;
        } else if (duration instanceof com.creditcloud.common.entities.embedded.Duration) {
            this.duration = DTOUtils.getDurationDTO((com.creditcloud.common.entities.embedded.Duration) duration);
        } else {
            logger.error("The type of passed-in duration is invalid.\n{}", duration);
        }
    }
}
