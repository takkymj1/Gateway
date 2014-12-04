/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.order.api;

import com.creditcloud.model.enums.TransStat;
import com.creditcloud.order.model.TransOrder;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface OrderService {

    /**
     * create a new order
     *
     * @return
     */
    TransOrder order();
    
    TransOrder order(String orderId);
    
    TransOrder order(String orderId, Date orderDate);
    
    TransOrder order(TransOrder order);

    TransOrder getByOrderId(String orderId);

    boolean markStat(String orderId, TransStat stat);

    boolean markStat(String orderId, TransStat newStat, List<TransStat> currentStats);
}
