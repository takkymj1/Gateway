/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.order.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.TransStat;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.order.OrderConstant;
import com.creditcloud.order.enums.OrderCategory;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class TransOrder extends BaseObject {

    private static final long serialVersionUID = 20141203L;

    @NotNull
    private String orderId;

    @NotNull
    private Date orderDate;

    private OrderCategory category;

    private RealmEntity entity;

    private TransStat stat;

    @Size(max = OrderConstant.MAX_ORDER_DES_LEN)
    private String description;

    public TransOrder(String orderId,
                      Date orderDate,
                      OrderCategory category,
                      RealmEntity entity,
                      TransStat stat) {
        this(orderId, orderDate, category, entity, stat, null);
    }

    public TransOrder(String orderId,
                      Date orderDate,
                      OrderCategory category,
                      RealmEntity entity,
                      TransStat stat,
                      String description) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.category = category;
        this.entity = entity;
        this.stat = stat;
        this.description = description;
    }
}
