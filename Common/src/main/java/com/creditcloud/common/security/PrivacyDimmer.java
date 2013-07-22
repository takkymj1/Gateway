/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security;

import com.creditcloud.model.User;

/**
 *
 * @author sobranie
 */
public class PrivacyDimmer {

    public static<T> T dim(T obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            user.setMobile(mask(user.getMobile(), 3, 4));
            user.setIdNumber(mask(user.getIdNumber(), 8, 9));
            return (T) user;
        }
        return obj;
    }

    /**
     * 139****0504
     * 
     * @param mobile
     * @return 
     */
    private static String mask(String content, int offset, int length) {
        assert content.length() >= offset + length;
        char[] chars = content.toCharArray();
        for (int i = offset; i < offset + length; i++) {
            chars[i] = '*';
        }
        return new String(chars);
    }
}
