/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import nl.captcha.Captcha;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sobranie
 */
public class WebUtils {
    
    static Logger logger = LoggerFactory.getLogger(WebUtils.class);

    private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                                                    + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                                                    + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                                                    + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static final Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);

    /**
     * 检验输入的captcha是否与Session中的一致
     *
     * @param request
     * @param captcha
     * @return
     */
    public static boolean checkCaptcha(HttpServletRequest request, String captcha) {
        Captcha c = (Captcha) request.getSession().getAttribute(Captcha.NAME);
        if (c != null && c.isCorrect(captcha)) {
            request.getSession().removeAttribute(Captcha.NAME);
            return true;
        }
        return false;
    }

    /**
     * 获取IP地址
     *
     * @param request
     * @return
     */
    public static String getIP(HttpServletRequest request) {
        String IP = request.getRemoteAddr();
        if (pattern.matcher(IP).matches()) {
            return IP;
        } else {
            logger.warn("IP is not valid.[IP={}]", IP);
            return "";
        }
    }
}
