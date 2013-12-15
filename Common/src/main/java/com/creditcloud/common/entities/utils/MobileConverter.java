/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.utils;

/**
 * 将手机号码进行密文保存.
 *
 * @author sobranie
 */
public class MobileConverter extends AbstractEncryptConverter {

    @Override
    protected boolean convertObjectValue(Object objectValue) {
        return objectValue != null;
    }

    /**
     * 原有为手机号明文则不转化
     * 
     * @param dataValue
     * @return 
     */
    @Override
    protected boolean convertDataValue(Object dataValue) {
        String dbValue = (String) dataValue;
        return !dbValue.matches("\\d{11}");
    }
}
