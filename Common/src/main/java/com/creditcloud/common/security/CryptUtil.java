/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security;

/**
 * 简单的换位加密解密算法
 *
 * @author yangxiongwei
 */
public class CryptUtil {

    private static final String[] source = new String[]{"0", "1", "2", "3",
                                                        "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g",
                                                        "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                                                        "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G",
                                                        "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                                                        "U", "V", "W", "X", "Y", "Z", " ", "~", "!", "@", "#", "$", "%", "^", "&",
                                                        "*", "(", ")", "-", "_", "+", "=", "{", "}", "[", "]", "\\", "|", ",", ".", "?",
                                                        "\"", "'", ":", ";", "/"};

    private static final String[] data = new String[]{"Q", "1", "p", "V",
                                                      "J", "L", "a", "B", "m", "A", "6", "Z", "U", "j", "P", "M", "F",
                                                      "x", "z", "N", "1", "k", "8", "R", "s", "2", "t", "T", "o", "q",
                                                      "W", "Y", "X", "h", "C", "i", "9", "7", "y", "K", "n", "g", "S",
                                                      "I", "O", "4", "D", "5", "f", "d", "G", "e", "0", "E", "H", "r",
                                                      "c", "3", "u", "w", "v", "b", ";", " ", "\\", "?", "-", "^", "(", "}",
                                                      "]", "+", "_", ":", "\"", ".", ",", "{", ")", "[", "@", "!", "&", "^", "%", "'",
                                                      "~", "=", "*", "/", "|", "$"};

    /**
     * 加密方法
     *
     * @param sr
     *
     * @return 加密后的字符串
     */
    public static String encrypt(String sr) {
        StringBuilder sb = new StringBuilder(sr.length());
        char[] c = sr.toCharArray();
        for (int i = 0; i < c.length; i++) {
            String s = c[i] + "";
            for (int j = 0; j < source.length; j++) {
                if (source[j].equals(s)) {
                    sb.append(data[j]);
                    break;
                }
            }

        }
        return sb.toString();
    }

    /**
     * 解密的方法
     *
     * @param sr
     *
     * @return 解密后的字符串
     */
    public static String decrypt(String sr) {
        StringBuilder sb = new StringBuilder(sr.length());
        char[] c = sr.toCharArray();
        for (int i = 0; i < c.length; i++) {
            String s = c[i] + "";
            for (int j = 0; j < data.length; j++) {
                if (data[j].equals(s)) {
                    sb.append(source[j]);
                    break;
                }
            }

        }
        return sb.toString();
    }

}
