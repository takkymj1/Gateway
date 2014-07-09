/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.taglib;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yangxiongwei
 */
public class AgeHandler extends SimpleTagSupport {

    static Logger logger = LoggerFactory.getLogger(AgeHandler.class);

    Date birthday;

    @Override
    public void doTag() throws JspException, IOException {
        if (birthday == null) {
            logger.warn("Invalid birthday is null.");
            return;
        }
        JspWriter writer = getJspContext().getOut();
        logger.debug("Mask birtyday {}", birthday);
        int age =  Calendar.getInstance().get(Calendar.YEAR) -   birthday.getYear() - 1900;
        writer.write(age+"岁");
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
