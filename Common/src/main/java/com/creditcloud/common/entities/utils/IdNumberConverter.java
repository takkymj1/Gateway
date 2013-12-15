/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.utils;

/**
 * 将IdNumber列的数据进行明文、密文转化
 * 
 * @author sobranie
 */
public class IdNumberConverter extends AbstractEncryptConverter {

    @Override
    protected boolean convertObjectValue(Object objectValue) {
        return objectValue != null;
    }

    /**
     * 原有内容为明文时不转化
     * 
     * @param dataValue
     * @return 
     */
    @Override
    protected boolean convertDataValue(Object dataValue) {
        String dbValue = (String) dataValue;
        return !dbValue.matches("\\d{18}|\\d{17}X|\\d{17}x");
    }
}
