/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security;

import com.creditcloud.model.constant.GlobalConstant;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sobranie
 */
public final class SecurityUtils {

    static Logger logger = LoggerFactory.getLogger(SecurityUtils.class);

    private static final DateFormat df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.SHORT);

    private static final Base64 b64 = new Base64();

    /**
     * 没有字母i和o，防止混淆
     */
    private static final String randomChars = "abcdefghjklmnpqrstuvwxyz";
    
    /**
     * 从CreditCloud Home读取salt文件内容，没有则返回默认值.
     * 
     * 读取后与Default Salt进行blend操作进一步混淆
     * 
     * @return 
     */
    public static String readSaltFile() {
        String salt = "CreditCloudRock!";
        File file = new File(GlobalConstant.CREDITCLOUD_HOME + "/salt.donotchange");
        if (file.exists() && file.canRead()) {
            try(Scanner scanner = new Scanner(file)) {
                if (scanner.hasNext()) {
                    String content = scanner.nextLine().trim();
                    salt = new String(blend(salt.getBytes(), content.getBytes()));
                }
            } catch (Exception ex) {
                logger.error("Error reading salt file !", ex);
            }
        }
        return salt;
    }

    /**
     * Salt is Base64(now + identity)
     *
     * Identity can be null, will generate a random alphanumeric instead.
     *
     * @param identity can be null
     * @return
     */
    public static String getSalt(String identity) {
        //去掉首尾空格，防止保存错误
        identity = identity.trim();
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
        boolean result = passphrase.equalsIgnoreCase(getPassphrase(salt, userPassword));
        if (!result) {
            logger.debug("Passphrase not matching, expecting {} but having {}", passphrase, getPassphrase(salt, userPassword));
        }
        return result;
    }

    /**
     * 生成随机的初始化密码
     *
     * @param level
     * @return
     */
    public static String randomPassword(SecurityLevel level) {
        switch (level) {
            case EXTREME:
                return RandomStringUtils.random(12, randomChars);
            case STRONG:
                return RandomStringUtils.random(8, randomChars);
            case GOOD:
                return RandomStringUtils.random(6, randomChars);
            case MEDIUM:
                return RandomStringUtils.randomNumeric(8);
            case WEAK:
                return RandomStringUtils.randomNumeric(6);
            case KIDDING:
                return RandomStringUtils.randomNumeric(3);
            default:
                return RandomStringUtils.random(12, randomChars);
        }
        
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
