/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;

/**
 * 告知信息列表
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class DeclarationListDTO extends BaseObject {

    /**
     * 告知版本
     */
    private String declarationVersion;
    
    /**
     * 告知列表
     */
    private DeclarationDTO[] declarationDTOList;

    public String getDeclarationVersion() {
        return declarationVersion;
    }

    public void setDeclarationVersion(String declarationVersion) {
        this.declarationVersion = declarationVersion;
    }

    public DeclarationDTO[] getDeclarationDTOList() {
        return declarationDTOList;
    }

    public void setDeclarationDTOList(DeclarationDTO[] declarationDTOList) {
        this.declarationDTOList = declarationDTOList;
    }

}
