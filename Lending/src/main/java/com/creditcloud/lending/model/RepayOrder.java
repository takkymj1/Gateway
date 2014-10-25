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
 * 还款订单(包括垫付)
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class RepayOrder extends BaseObject {

    private static final long serialVersionUID = 20141024L;

    private String id;

    private String loanRepayId;

    private String investRepayId;

    private String orderId;

    private LocalDate orderDate;

    private TransStat stat;

    public RepayOrder(String id,
                      String loanRepayId,
                      String investRepayId,
                      String orderId,
                      LocalDate orderDate,
                      TransStat stat) {
        this.id = id;
        this.loanRepayId = loanRepayId;
        this.investRepayId = investRepayId;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.stat = stat;
    }
}
