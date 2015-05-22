/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.stockfinance.StockPayRecord;
import java.util.Date;
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
    
    public PagedResult<StockPayRecord> listByDueTime(Date from, Date to, PageInfo pageInfo);
}
