/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.utils;

import com.creditcloud.common.security.SecurityUtils;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.sessions.Session;
import org.jasypt.util.text.BasicTextEncryptor;

/**
 * 需要将数据库中内容换为加密内容的Converter的基类
 * 
 * @author sobranie
 */
public abstract class AbstractEncryptConverter implements Converter {

    protected static final BasicTextEncryptor BTE;

    static {
        BTE = new BasicTextEncryptor();
        BTE.setPassword("CreditCloudRock!".concat(SecurityUtils.readSaltFile()));
    }

    @Override
    public Object convertObjectValueToDataValue(Object objectValue, Session session) {
        return BTE.encrypt((String) objectValue);
    }

    @Override
    public boolean isMutable() {
        return true;
    }

    @Override
    public void initialize(DatabaseMapping mapping, Session session) {
    }
}
