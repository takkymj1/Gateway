/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.TransStat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class CreditAssignOrder extends BaseObject {

    private static final long serialVersionUID = 20150108L;

    private String id;

    private String creditAssignId;

    private String investId;

    private String orderId;

    private LocalDate orderDate;

    private TransStat stat;

    public CreditAssignOrder(String id,
                             String creditAssignId,
                             String investId,
                             String orderId,
                             LocalDate orderDate,
                             TransStat stat) {
        this.id = id;
        this.creditAssignId = creditAssignId;
        this.investId = investId;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.stat = stat;
    }
}
