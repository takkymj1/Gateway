/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.taglib;

import java.io.IOException;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 输出date到今日的时间差：如10秒前、10分钟前、10小时前、10天前、10个月前
 * @author keven
 */
public class PrettyDateHandler extends SimpleTagSupport {

    static Logger logger = LoggerFactory.getLogger(DurationHandler.class);

    Date date;

    @Override
    public void doTag() throws JspException, IOException {
        if (date == null) {
            logger.error("date cannot be null.");
            return;
        }
        long time = date.getTime();
        long now = (new Date()).getTime();
        long gap = now - time;
        gap = gap - gap % 1000;

        int seconds = (int) (gap / 1000);

        StringBuilder sb = new StringBuilder();

        if (seconds < 60) {
            sb.append(seconds).append("秒前");
        } else {
            int mins = (seconds - seconds % 60) / 60;
            if (mins < 60) {
                sb.append(mins).append("分钟前");
            } else {
                int hours = (mins - mins % 60) / 60;
                if (hours < 24) {
                    sb.append(hours).append("小时前");
                } else {
                    int days = (hours - hours % 24) / 24;
                    if (days < 30) {
                        sb.append(days).append("天前");
                    } else {
                        int months = (days - days % 30) / 30;
                        sb.append(months).append("个月前");
                    }
                }
            }
        }
        JspWriter writer = getJspContext().getOut();
        try {
            writer.write(sb.toString());
        } catch (IOException ex) {
            logger.error("Error happends:", ex);
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
