/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author rooseek
 */
@Data
@XmlRootElement
public class UmpAssignResult extends UmpResult {

    private static final long serialVersionUID = 20150120L;

    private UmpPaymentResult assignOrder;

    private UmpPaymentResult refundOrder;

    private UmpPaymentResult feeOrder;

    public UmpAssignResult(UmpResultType resultType,
                           UmpPaymentResult assignOrder,
                           UmpPaymentResult refundOrder,
                           UmpPaymentResult feeOrder) {
        super(resultType);
        this.assignOrder = assignOrder;
        this.refundOrder = refundOrder;
        this.feeOrder = feeOrder;
    }
}
