/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

/**
 *
 * @author yuanh
 */
public enum CmdIdType {

    /**
     * 用户开户
     */
    UserRegister,
    /**
     * 用户后台开户
     */
    BgRegister,
    /**
     * 用户绑卡
     */
    UserBindCard,
    /**
     * 后台绑卡
     */
    BgBindCard,
    /**
     * 用户登陆
     */
    UserLogin,
    AcctModify,
    NetSave,
    PosWhSave,
    /**
     * 用户资金冻结
     */
    UsrFreezeBg,
    UsrUnFreeze,
    InitiativeTender,
    AutoTender,
    TenderCancle,
    AutoTenderPlan,
    AutoTenderPlanClose,
    Loans,
    Repayment,
    Transfer,
    CashAudit,
    Cash,
    MerCash,
    UsrAcctPay,
    QueryBalance,
    /**
     * 后台查询余额
     */
    QueryBalanceBg,
    QueryAccts,
    QueryTransStat,
    QueryTenderPlan,
    Reconciliation,
    TrfReconciliation,
    CashReconciliation,
    QueryAcctDetails,
    SaveReconciliation,
    QueryReturnDzFee,
    /**
     * 2014.1.17新加汇付3.0接口
     */
    CorpRegister,
    UsrTransfer,
    CreditAssign,
    CorpRegisterQuery,
    CreditAssignReconciliation,
    QueryCardInfo,
    /**
     * 2014.2.20新加
     */
    DelCard,
    /**
     * 2014.3.10生利宝相关
     */
    FssTrans,
    FssPurchaseReconciliation,
    FssRedeemReconciliation,
    QueryFss,   //生利宝产品信息查询
    QueryFssAccts;  //生利宝账户信息查询
}
