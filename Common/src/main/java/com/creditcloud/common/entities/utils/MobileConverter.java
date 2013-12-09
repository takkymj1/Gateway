/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.utils;

import org.eclipse.persistence.sessions.Session;

/**
 * 将手机号码进行密文保存.
 *
 * @author sobranie
 */
public class MobileConverter extends AbstractEncryptConverter {

    @Override
    public Object convertDataValueToObjectValue(Object dataValue, Session session) {
        String dbValue = (String) dataValue;
        if (dbValue.matches("\\d{11}")) {
            return dbValue;
        } else {
            return BTE.decrypt(dbValue);
        }
    }

}
