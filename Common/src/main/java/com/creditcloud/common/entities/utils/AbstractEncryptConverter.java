/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.utils;

import com.creditcloud.common.security.SecurityUtils;
import com.creditcloud.common.security.TextCipher;
import com.creditcloud.common.security.impl.DESTextCipher;
import java.security.GeneralSecurityException;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.sessions.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 需要将数据库中内容换为加密内容的Converter的基类
 * 
 * @author sobranie
 */
public abstract class AbstractEncryptConverter implements Converter {
    
    Logger logger = LoggerFactory.getLogger(AbstractEncryptConverter.class);

    private final TextCipher cipher = new DESTextCipher();

    @Override
    public Object convertObjectValueToDataValue(Object objectValue, Session session) {
        if (objectValue != null && convertObjectValue(objectValue)) {
            try {
                return cipher.encrypt((String) objectValue);
            } catch (GeneralSecurityException ex) {
                logger.error("Can't encrypt objectValue.[objectValue={}][fieldName={}]", (String) objectValue, fieldName(), ex);
            }
        }
        return objectValue;
    }
    
    @Override
    public Object convertDataValueToObjectValue(Object dataValue, Session session) {
        if (dataValue != null && convertDataValue(dataValue)) {
            try {
                return cipher.decrypt((String) dataValue);
            } catch (GeneralSecurityException ex) {
                logger.error("Can't decrypt dataValue.[dataValue={}][fieldName={}]", (String) dataValue, fieldName(), ex);
            }
        }
        return null;
    }

    @Override
    public boolean isMutable() {
        return true;
    }

    @Override
    public void initialize(DatabaseMapping mapping, Session session) {
        String salt = SecurityUtils.readSaltFile();
        cipher.init(salt);
        logger.debug("TC init.[salt={}]", salt);
    }
    
    /**
     * 返回实例对应的field(列名)，便于发现问题
     * 
     * @return 
     */
    protected abstract String fieldName();
    
    /**
     * 判断是否需要转化对象值
     * 
     * @param objectValue
     * @return 
     */
    protected abstract boolean convertObjectValue(Object objectValue);
    
    /**
     * 判断是否需要转化数据库值
     * 
     * @param dataValue
     * @return 
     */
    protected abstract boolean convertDataValue(Object dataValue);
}
