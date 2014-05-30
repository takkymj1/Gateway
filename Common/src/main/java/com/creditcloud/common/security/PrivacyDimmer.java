/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security;

import com.creditcloud.common.entities.embedded.BankAccount;
import com.creditcloud.model.user.User;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
public class PrivacyDimmer {

    public static <T> T dim(T obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            user.setName(maskName(user.getName()));
            user.setMobile(mask(user.getMobile(), 3, 4));
            user.setIdNumber(mask(user.getIdNumber(), 8, 9));
            user.setEmail(maskEmail(user.getEmail()));
            return (T) user;
        }
        if (obj instanceof BankAccount) {
            BankAccount account = (BankAccount) obj;
            account.setAccount(mask(account.getAccount(), 4, 8));
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
        if (StringUtils.isEmpty(content)) {
            return "";
        }
        assert content.length() >= offset + length;
        char[] chars = content.toCharArray();
        for (int i = offset; i < offset + length; i++) {
            chars[i] = '*';
        }
        return new String(chars);
    }

    private static String maskEmail(String email) {
        int offset = 0;
        int length = email.indexOf('@');
        if (length > 2) {
            offset = 2;
            length -= offset;
        }
        return mask(email, offset, length);
    }

    private static String maskName(String name) {
        return mask(name, name.length() - 1, 1);
    }

    public static String maskLoginName(String loginName) {
        if (loginName.length() < 2) {
            return "*";
        }
        return mask(loginName, 1, loginName.length() > 2 ? loginName.length() - 2 : 1);
    }
}
