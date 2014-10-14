/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
@XmlRootElement
public class UmpFreezeResult extends UmpResult {
        
    private String orderId;
    
    private String merDate;
    
    private String tradeNo;
    
    private String merCheckDate;

    public UmpFreezeResult(UmpResultType umpResultType,
                           String orderId,
                           String merDate,
                           String tradeNo,
                           String merCheckDate) {
        super(umpResultType);
        this.orderId = orderId;
        this.merDate = merDate;
        this.tradeNo = tradeNo;
        this.merCheckDate = merCheckDate;
    }
    
    public UmpFreezeResult(String orderId,
                           String merDate,
                           String tradeNo,
                           String merCheckDate) {
        this(UmpResultType.SUCCESS, orderId, merDate, tradeNo, merCheckDate);
    }
    
    public UmpFreezeResult(UmpResultType umpResultType) {
        super(umpResultType);
    }
}