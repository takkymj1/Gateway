/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.taglib;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 将生日显示为 198*年**月**日
 * 
 * @author sobranie
 */
public class BirthdayHandler extends SimpleTagSupport {

    static Logger logger = LoggerFactory.getLogger(BirthdayHandler.class);
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    
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
        String content = "";
        try {
            logger.debug("Mask birtyday {}", birthday);
            String year = sdf.format(birthday);
            if (year.length() == 4) {
                content = content.concat(year.substring(0, 3)).concat("*年**月**日");
            }
        } catch (Exception ex) {
            logger.error("Error happend when format birthday.{}", birthday, ex);
            return;
        }
        JspWriter writer = getJspContext().getOut();
        writer.write(content);
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
