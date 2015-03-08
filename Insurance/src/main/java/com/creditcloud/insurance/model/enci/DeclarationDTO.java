/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;

/**
 * 告知信息
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class DeclarationDTO extends BaseObject {

    /**
     * 告知编号
     */
    @NotNull
    private String code;
    
    /**
     * 告知结果
     */
    @NotNull
    private String result;
    
    /**
     * 结果参数
     */
    private String[] params;
    
    /**
     * 备注
     */
    private String remark;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    
}
