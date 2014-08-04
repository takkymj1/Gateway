/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author kdliu
 */
public enum CertType implements BaseEnum{
    ID("身份证", "0"),
    PASSPORT("护照", "1"),
    CAPTAIN("军官证", "2"),
    SOLDIOR("士兵证", "3"),
    HUKOU("户口本", "5"),
    OTHER("其他", "7");
    // TODO ADD ALL
    
    protected String certType;
    protected String certId;

    CertType(String certType, String certId) {
        this.certType = certType;
        this.certId = certId;
    }

    @Override
    public String getKey() {
        return certType;
    }
    
    public String getCertId() {
        return certId;
    }
    
    public static CertType getEnum(String certType) {
        for(CertType aCert : CertType.values()) {
            if(aCert.getKey().equals(certType))
                return aCert;
        }
        
        return null;
    }
    
}

