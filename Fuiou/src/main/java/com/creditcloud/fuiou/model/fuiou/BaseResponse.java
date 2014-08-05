/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model.fuiou;

import com.creditcloud.fuiou.model.FuiouConstant;
import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement(name = "baseResponse")  
@XmlType(propOrder = { "ret", "memo" })
public class BaseResponse extends BaseObject{
       
    @NotNull
    @Size(max = 6)
    private String ret;
    
    @NotNull
    @Size(max = 1024)
    private String memo;
    
    public BaseResponse(String ret,
                        String memo) {
        this.ret = ret;
        this.memo = memo;
    }
    
    public boolean isSuccess() {
        return ret.equals(FuiouConstant.SUCCESS_CODE);
    }
}
