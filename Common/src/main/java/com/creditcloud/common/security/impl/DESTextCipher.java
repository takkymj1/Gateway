/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security.impl;

import com.creditcloud.common.security.TextCipher;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sobranie
 */
public class DESTextCipher implements TextCipher {

    Logger logger = LoggerFactory.getLogger(DESTextCipher.class); 

    /**
     * 加密
     */
    private Cipher encryptCipher;

    /**
     * 解密
     */
    private Cipher decryptCipher;

    /**
     * KeyFactory
     */
    private SecretKeyFactory keyFactory;

    public DESTextCipher() {
        try {
            encryptCipher = Cipher.getInstance("DES");
            decryptCipher = Cipher.getInstance("DES");
            keyFactory = SecretKeyFactory.getInstance("DES");
        } catch (GeneralSecurityException ex) {
            logger.error("I don't think this will happen...", ex);
        }
    }

    @Override
    public void init(String salt) {
        try {
            SecretKey sk = keyFactory.generateSecret(new DESKeySpec(salt.getBytes()));
            encryptCipher.init(Cipher.ENCRYPT_MODE, sk);
            decryptCipher.init(Cipher.DECRYPT_MODE, sk);
        } catch (InvalidKeyException | InvalidKeySpecException ex) {
            logger.error("Can't init Cipher.[salt={}]", salt, ex);
        }
    }

    @Override
    public String encrypt(String value) throws GeneralSecurityException {
        return new String(Base64.encodeBase64(encryptCipher.doFinal(value.getBytes())));
    }

    @Override
    public String decrypt(String value) throws GeneralSecurityException {
        return new String(decryptCipher.doFinal(Base64.decodeBase64(value.getBytes())));
    }

}
