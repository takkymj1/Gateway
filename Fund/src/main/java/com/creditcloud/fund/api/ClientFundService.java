/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.ClientFundRecord;
import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
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
     *
     * @param clientCode
     * @param recordId
     * @return
     */
    ClientFundRecord getRecordById(String clientCode, String recordId);

    /**
     * add new ClientFundRecord
     *
     * @param clientCode
     * @param record
     */
    void addRecord(String clientCode, ClientFundRecord record);

    /**
     * 更新
     *
     * @param clientCode
     * @param record
     */
    void updateRecord(String clientCode, ClientFundRecord record);

    /**
     * 根据orderId获取充值请求记录
     *
     * @param clientCode
     * @param orderId
     * @return
     */
    ClientFundRecord getDepositRequestByOrderId(String clientCode, String orderId);

    /**
     * 列出商户所有未处理的取现请求
     *
     * @param clientCode
     * @return
     */
    List<ClientFundRecord> listWithdrawRequest(String clientCode);

    /**
     * 根据orderId获取取现请求记录
     *
     * @param clientCode
     * @param orderId
     * @return
     */
    ClientFundRecord getWithdrawRequestByOrderId(String clientCode, String orderId);

    /**
     * 获取商户的取现记录
     *
     * @param clientCode
     * @param withdrawId
     * @param operation
     * @param status
     * @return
     */
    ClientFundRecord getWithdrawByOperationAndStatus(String clientCode, String withdrawId, FundRecordOperation operation, FundRecordStatus status);
}
