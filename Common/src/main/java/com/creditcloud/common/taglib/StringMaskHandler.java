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

    int start = 1;

    int length = 0;

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
        if (length <= 0) {
            length = beforeMask.length()-2;
        }
        System.out.println(start+" "+length);
        String afterMask = mask(beforeMask, start, length);
        writer.write(afterMask);
    }

    public void setBeforeMask(String beforeMask) {
        this.beforeMask = beforeMask.trim();
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    private static String mask(String content, int offset, int length) {
        char[] chars = content.toCharArray();
        for (int i = offset; i < offset + length; i++) {
            chars[i] = '*';
        }
        return new String(chars);
    }
}
