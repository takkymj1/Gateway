/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.stockfinance.StockPayRecord;
import javax.ejb.Remote;

/**
 * 配资付款明细
 * 
 * @author zhaobs
 */
@Remote
public interface StockPayRecordService {
    
    public StockPayRecord find(String requestId);

    public StockPayRecord addNew(StockPayRecord stockPayRecord);

    public StockPayRecord update(StockPayRecord stockPayRecord);
    
}
