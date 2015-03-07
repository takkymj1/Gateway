/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;

/**
 * 其他信息
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class OtherInfoDTO extends BaseObject {

    /**
     * 是否邮寄保单 CD4
     */
    private String isPostPolicy;
    
    /**
     * isPostInvoice CD4
     */
    private String isPostInvoice;
    
    /**
     * 邮寄地址
     */
    private String postAddress;
    
    /**
     * 邮寄邮编
     */
    private String postZip;

    public String getIsPostPolicy() {
        return isPostPolicy;
    }

    public void setIsPostPolicy(String isPostPolicy) {
        this.isPostPolicy = isPostPolicy;
    }

    public String getIsPostInvoice() {
        return isPostInvoice;
    }

    public void setIsPostInvoice(String isPostInvoice) {
        this.isPostInvoice = isPostInvoice;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getPostZip() {
        return postZip;
    }

    public void setPostZip(String postZip) {
        this.postZip = postZip;
    }

    
}
