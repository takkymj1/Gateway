/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.model.PnRConstant;
/**
 * 接口输出
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public abstract class BaseResponse extends BaseObject {

    @NotNull
    private String platformNo;

    @NotNull
    private String code;

    private String description;

    public BaseResponse(String platformNo, 
                        String code, 
                        String description) {
        this.platformNo = platformNo;
        this.code = code;
        this.description = description;
    }
    
    public boolean success() {
        return PnRConstant.SUCCESS_CODE.equalsIgnoreCase(code);
    }    
    /**
     * 用于做应答内容验证的ChkValue
     * 
     * @return 
     
    public abstract String chkString();
    
    public boolean success() {
        return PnRConstant.SUCCESS_CODE.equalsIgnoreCase(code);
    }
    */
}
