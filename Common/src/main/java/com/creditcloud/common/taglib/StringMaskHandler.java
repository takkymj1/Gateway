/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.taglib;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author keven
 */
public class StringMaskHandler extends SimpleTagSupport {
    
    static Logger logger = LoggerFactory.getLogger(BirthdayHandler.class);
    
    String beforeMask;
    
    /**
     * 字符串打码。例如：keven -> k***n
     * 
     * @throws JspException
     * @throws IOException 
     */
    @Override
    public void doTag() throws JspException, IOException {
        if (StringUtils.isBlank(beforeMask)) {
            logger.warn("Invalid beforeMask String is null.");
            return;
        }
        
        JspWriter writer = getJspContext().getOut();
        int length = beforeMask.length();
        writer.write(beforeMask, 0, 1);
        for (int i=0; i<length-2; i++) {
            writer.write("*");
        }
        if (length > 2) {
            writer.write(beforeMask, length-1, 1);
        }
    }

    public void setBeforeMask(String beforeMask) {
        this.beforeMask = beforeMask.trim();
    }
}
