/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security;

import java.text.DateFormat;
import java.util.Date;
import org.apache.commons.codec.binary.Base64;
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
     * Salt is Base64(now + identity)
     * 
     * Identity can be null, will generate a random alphanumeric instead.
     * 
     * @param identity can be null
     * @return 
     */
    public static String getSalt(String identity) {
        String now = df.format(new Date());
        return Base64.encodeBase64String(now.concat(identity == null 
                                                    ? RandomStringUtils.randomAlphanumeric(20) 
                                                    : identity).getBytes());
    }
    
    /**
     * Stored passphrase
     * 
     * @param salt
     * @param userPassword
     * @return 
     */
    public static String getPassphrase(String salt, String userPassword) {
        return DigestUtils.sha1Hex(salt.concat(userPassword));
    }
    
    public static boolean matchPassphrase(final String passphrase, final String salt, final String userPassword) {
        return passphrase.equalsIgnoreCase(getPassphrase(salt, userPassword));
    }
}
