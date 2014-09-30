/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class UmpTransferResult extends BaseObject {
    
    private String orderId;
    
    private String merDate;
    
    private String tradeNo;
    
    private String merCheckDate;

    private String retCode;

    private String retMsg;
    
    public UmpTransferResult(String orderId, 
                             String merDate, 
                             String tradeNo, 
                             String merCheckDate, 
                             String retCode, 
                             String retMsg) {
        this.orderId = orderId;
        this.merDate = merDate;
        this.tradeNo = tradeNo;
        this.merCheckDate = merCheckDate;
        this.retCode = retCode;
        this.retMsg = retMsg;
    }
    
    public boolean success() {
        return UmpConstant.SUCCESS_CODE.equals(retCode);
    }
}
