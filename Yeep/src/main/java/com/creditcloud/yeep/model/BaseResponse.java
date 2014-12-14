/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
/**
 * 接口输出
 *
 * @author tinglany
 */

public abstract class BaseResponse extends BaseObject {

    @NotNull
    private String platformNo;

    @NotNull
    private String code;

    @NotNull
    private String description;
    
    private String sign;

    public BaseResponse(String platformNo, 
                        String code, 
                        String description) {
        this.platformNo = platformNo;
        this.code = code;
        this.description = description;
    }

    public BaseResponse() {
    }

    @XmlAttribute (name ="platformNo")   
    public  String getPlatformNo() {
        return platformNo;
    }
    
    @XmlElement (name ="code")   
    public String getCode() {
        return code;
    }
    @XmlElement (name ="description")   
    public String getDescription() {
        return description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPlatformNo(String platformNo) {
        this.platformNo = platformNo;
    }
  
    
    /**
     * 用于做应答内容验证的ChkValue
     * 
     * @return 
     */
    public abstract String chkString();
    
    public boolean success() {
        return PnRConstant.SUCCESS_CODE.equalsIgnoreCase(code);
    }
    
}
