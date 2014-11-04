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
@ToString
@XmlRootElement
public class UmpFeeResult extends UmpResult {
    
    public static final UmpFeeResult SUCCESS = new UmpFeeResult(UmpResultType.SUCCESS);
    
    private UmpPaymentResult outOrder;
    
    private UmpPaymentResult inOrder;

    public UmpFeeResult(UmpResultType umpResultType,
                        UmpPaymentResult orderId,
                        UmpPaymentResult inOrder) {
        super(umpResultType);
        this.outOrder = orderId;
        this.inOrder = inOrder;
    }
    
    public UmpFeeResult(UmpResultType umpResultType) {
        super(umpResultType);
    }
}
