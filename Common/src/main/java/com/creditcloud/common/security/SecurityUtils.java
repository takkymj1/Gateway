/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security;

import java.text.DateFormat;
import java.util.Date;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author sobranie
 */
public final class SecurityUtils {

    private static final DateFormat df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.SHORT);

    private static final Base64 b64 = new Base64();

    /**
     * 没有字母i和o，防止混淆
     */
    private static final String randomChars = "abcdefghjklmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ0123456789";

    /**
     * Salt is Base64(now + identity)
     *
     * Identity can be null, will generate a random alphanumeric instead.
     *
     * @param identity can be null
     * @return
     */
    public static String getSalt(String identity) {
        String now = df.format(new Date());
        String identityString = identity == null
                                ? RandomStringUtils.randomAlphanumeric(20)
                                : identity;
        return Base64.encodeBase64String(blend(now.getBytes(), identityString.getBytes()));
    }

    /**
     * Stored passphrase
     *
     * @param salt
     * @param userPassword
     * @return
     */
    public static String getPassphrase(String salt, String userPassword) {
        return DigestUtils.sha1Hex(blend(salt.getBytes(), userPassword.getBytes()));
    }

    public static boolean matchPassphrase(final String passphrase, final String salt, final String userPassword) {
        return passphrase.equalsIgnoreCase(getPassphrase(salt, userPassword));
    }

    /**
     * 生成随机的初始化密码
     *
     * @return
     */
    public static String randomPassword() {
        return RandomStringUtils.random(6, randomChars);
    }

    private static byte[] blend(byte[] a, byte[] b) {
        byte[] result = new byte[a.length + b.length];
        int ai = 0;
        int bi = 0;
        for (int i = 0; i < result.length; i++) {
            if (ai == a.length || bi < ai && bi < b.length) {
                result[i] = b[bi++];
                continue;
            }
            if (bi == b.length || ai <= bi) {
                result[i] = a[ai++];
                continue;
            }
        }
        return result;
    }
}
