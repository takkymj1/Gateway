/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;

/**
 * 被保险人信息列表
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class InsuredListDTO extends BaseObject {

    /**
     * 被保险人信息列表
     */
    private InsuredDTO[] insuredDTOList;

    public InsuredDTO[] getInsuredDTOList() {
        return insuredDTOList;
    }

    public void setInsuredDTOList(InsuredDTO[] insuredDTOList) {
        this.insuredDTOList = insuredDTOList;
    }
    
}
