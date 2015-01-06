/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.ClientFundRecord;
import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.model.criteria.CriteriaInfo;
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
     * 根据ClientFundRecord中的entity来列出所有FundRecord
     * @param clientCode
     * @param pageInfo
     * @param entity
     * @return 
     */
    PagedResult<ClientFundRecord> listByEntity(String clientCode,PageInfo pageInfo,com.creditcloud.model.misc.RealmEntity entity);
    
    /**
     * 根据OrderId来列出所有ClientFundRecord
     * @param clientCode
     * @param pageInfo
     * @param orderId
     * @return 
     */
    PagedResult<ClientFundRecord> listByOrderId(String clientCode,PageInfo pageInfo, String orderId); 
    /**
     * 列出商户资金记录
     *
     * @param clientCode
     * @param accountList
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
     * @return
     */
    ClientFundRecord addRecord(String clientCode, ClientFundRecord record);

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
     * 根据orderId和account获取充值请求记录
     *
     * @param clientCode
     * @param account
     * @param orderId
     * @return
     */
    ClientFundRecord getDepositRequestByOrderIdAndAccount(String clientCode, String account, String orderId);
    
    /**
     * 列出商户所有未处理的取现请求
     *
     * @param clientCode
     * @param status     如果为空则默认列出AUDITING状态
     * @return
     */
    List<ClientFundRecord> listWithdrawRequest(String clientCode, FundRecordStatus... status);

    /**
     * 根据orderId获取取现请求记录
     *
     * @param clientCode
     * @param orderId
     * @return
     */
    ClientFundRecord getWithdrawRequestByOrderId(String clientCode, String orderId);
    
    /**
     * 根据orderId和account获取取现请求记录
     *
     * @param clientCode
     * @param account
     * @param orderId
     * @return
     */
    ClientFundRecord getWithdrawRequestByOrderIdAndAccount(String clientCode, String account, String orderId);

    /**
     * 根据orderId和account获取绑卡手续费记录
     *
     * @param clientCode
     * @param account
     * @param orderId
     * @return
     */
    ClientFundRecord getBindCardFeeRequestByOrderIdAndAccount(String clientCode, String account, String orderId);    
    
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
    
    /**
     * 
     * @param criteriaInfo
     * @return 
     */
    PagedResult<ClientFundRecord> findAll(CriteriaInfo criteriaInfo);
}
