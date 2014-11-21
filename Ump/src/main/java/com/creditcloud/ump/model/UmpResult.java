/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * 
 * @author kdliu
 */
@Data
@XmlRootElement
public class UmpResult extends BaseObject {

    private final UmpResultType resultType;
    
    public UmpResult(UmpResultType resultType) {
        this.resultType = resultType;
    }
    
    public boolean success() {
        return UmpConstant.SUCCESS_CODE.equalsIgnoreCase(resultType.getRetCode());
    }
    
    public String getRetCode() {
        return resultType.getRetCode();
    }
    
    public String getRetMsg() {
        return resultType.getRetMsg();
    }
}