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
 *
 * @author sobranie
 */
public class BirthdayHandler extends SimpleTagSupport {

    static Logger logger = LoggerFactory.getLogger(BirthdayHandler.class);
    /**
     * 出生日期格式：1987-01-01
     */
    Date birthday;

    @Override
    public void doTag() throws JspException, IOException {
        if (birthday == null) {
            logger.warn("Invalid birthday is null.");
            return;
        }
        JspWriter writer = getJspContext().getOut();
        logger.debug("Mask birtyday {}", birthday);
        String year = (birthday.getYear()+1900)+"";
        writer.write(year, 0, 3);
        writer.write("*年**月**日");
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
