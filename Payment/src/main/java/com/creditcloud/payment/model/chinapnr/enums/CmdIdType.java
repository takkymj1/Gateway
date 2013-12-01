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
    QueryReturnDzFee;
}
