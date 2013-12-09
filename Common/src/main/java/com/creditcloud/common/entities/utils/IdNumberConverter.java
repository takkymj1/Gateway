/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.utils;

import org.eclipse.persistence.sessions.Session;

/**
 * 将IdNumber列的数据进行明文、密文转化
 * 
 * @author sobranie
 */
public class IdNumberConverter extends AbstractEncryptConverter {

    /**
     * 原有内容为明文时不转化
     * 
     * @param dataValue
     * @param session
     * @return 
     */
    @Override
    public Object convertDataValueToObjectValue(Object dataValue, Session session) {
        String dbValue = (String) dataValue;
        if (dbValue.matches("\\d{18}|\\d{17}X|\\d{17}x")) {
            return dbValue;
        } else {
            return BTE.decrypt(dbValue);
        }
    }
}
