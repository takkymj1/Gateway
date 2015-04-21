/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.TransferRequest;
import com.creditcloud.fund.model.enums.FundRecordStatus;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface TransferRequestService {
    
    public TransferRequest addNew(TransferRequest request);
    
    public TransferRequest find(String id);

    /**
     * 根据状态列出所有TransferRequest
     *
     * @param status
     * @return
     */
    public List<TransferRequest> listByStatus(FundRecordStatus... status);

    /**
     * 审核转账申请
     *
     * @param auditEmployee
     * @param requestId
     * @param orderId
     * @param status
     */
    public void auditRequest(String auditEmployee, String requestId, String orderId, FundRecordStatus status);

    /**
     * 只能删除待审核状态的申请,成功和驳回状态的需要保留对账用
     *
     * @param requestId
     */
    public void deleteRequest(String requestId);

    BigDecimal sumTransferByUser(String userId);
}
