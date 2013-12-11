/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.ClientFundRecord;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface ClientFundService {

    /**
     * 列出商户资金记录
     *
     * @param clientCode
     * @param account
     * @param from
     * @param to
     * @param pageInfo
     * @param type
     * @return
     */
    PagedResult<ClientFundRecord> listRecord(String clientCode,
                                             List<String> accountList,
                                             Date from,
                                             Date to,
                                             PageInfo pageInfo,
                                             FundRecordType... type);

    /**
     * add new ClientFundRecord
     *
     * @param clientCode
     * @param record
     */
    void addRecord(String clientCode, ClientFundRecord record);
    
    
    void updateRecord(String clientCode, ClientFundRecord record);
    
    
    ClientFundRecord getDepositRequestByOrderId(String clientCode, String orderId);
}
