/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.taglib;

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
public class BankAccountHandler extends SimpleTagSupport {

    static Logger logger = LoggerFactory.getLogger(TimeTagHandler.class);

    /**
     * 银行卡号，16位或19位数字
     */
    String account;

    @Override
    public void doTag() throws JspException, IOException {
        if (account == null) {
            logger.warn("Invalid account is null.");
            return;
        }
        JspWriter writer = getJspContext().getOut();
        if (account.length() == 16 || account.length() == 19) {
            writer.write(account, 0, 4);
            writer.write("&nbsp;");
            writer.write(account, 4, 4);
            writer.write("&nbsp;");
            writer.write(account, 8, 4);
            writer.write("&nbsp;");
            writer.write(account, 12, 4);
            if (account.length() == 19) {
                writer.write("&nbsp;");
                writer.write(account, 16, 3);
            }
        } else {
            logger.warn("Bank account number {} is invalid !", account);
            writer.write(account);
        }
    }

    public void setAccount(String account) {
        this.account = account.trim();
    }
}
