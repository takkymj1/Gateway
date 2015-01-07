/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.api;

import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import com.creditcloud.payment.model.chinapnr.reconciliation.CashReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.CashReconciliationResult2;
import com.creditcloud.payment.model.chinapnr.reconciliation.CreditAssignReconciliationRequest;
import com.creditcloud.payment.model.chinapnr.reconciliation.CreditAssignReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.FssPurchaseReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.FssRedeemReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.SaveReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.TenderReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.TransferReconciliationResult;
import javax.ejb.Remote;
import org.joda.time.LocalDate;

/**
 * 三方支付对账及订单查询</p>
 * 部分或全部订单将存在本地加快查询和对账</p>
 *
 * @author rooseek
 */
@Remote
public interface PaymentQueryService {

    /**
     * p2p平台取现对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public CashReconciliationResult cashReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

    /**
     * p2p平台取现对账,对应2.0接口
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public CashReconciliationResult2 cashReconciliation2(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

    /**
     * p2p平台充值对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public SaveReconciliationResult saveReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

    /**
     * 商户转账接口产生的交易记录
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public TransferReconciliationResult transferReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

    /**
     * 投标对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @param type
     * @return
     */
    public TenderReconciliationResult tenderReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize, QueryTransType type);

    /**
     * 债权转让查询
     *
     * @param clientCode
     * @param request
     * @return
     */
    public CreditAssignReconciliationResult creditAssignReconciliation(String clientCode, CreditAssignReconciliationRequest request);

    /**
     * 生利宝转入对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public FssPurchaseReconciliationResult fssPurchaseReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

    /**
     * 生利宝转出对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public FssRedeemReconciliationResult fssRedeemReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);
}
