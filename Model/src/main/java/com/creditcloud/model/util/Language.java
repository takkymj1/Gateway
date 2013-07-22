/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rooseek
 */
public class Language {

    private static Pattern singleChinese = Pattern.compile("[\u4E00-\u9fbb]");

    private static Pattern multiChinese = Pattern.compile("[\u4E00-\u9fbb]+");
    
    private static Pattern ASCII = Pattern.compile("[\u0000-\u007f]+");

    /**
     * check whether string contain Chinese character
     *
     * @param str
     * @return true if str contain Chinese character
     */
    public static boolean containChinese(String str) {
        Matcher matcher = singleChinese.matcher(str);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    /**
     * check whether string is only consisted of Chinese character
     *
     * @param str
     * @return true if str is only consisted of Chinese character
     */
    public static boolean isChinese(String str) {
        Matcher matcher = multiChinese.matcher(str);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * check whether string contain any non ascii character
     *
     * @param str
     * @return true if str contain non ascii character
     */
    public static boolean containNonASCII(String str) {
        return !isASCII(str);
    }

    /**
     * check whether string is only consisted of ascii character
     * 
     * @param str
     * @return 
     */
    public static boolean isASCII(String str) {
        Matcher matcher = ASCII.matcher(str);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
