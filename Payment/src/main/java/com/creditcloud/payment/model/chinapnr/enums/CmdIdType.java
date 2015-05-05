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
    Reconciliation(CmdIdGroup.Reconciliation),
    TrfReconciliation(CmdIdGroup.Reconciliation),
    CashReconciliation(CmdIdGroup.Reconciliation),
    QueryAcctDetails,
    SaveReconciliation(CmdIdGroup.Reconciliation),
    QueryReturnDzFee,
    /**
     * 2014.1.17新加汇付接口
     */
    CorpRegister,
    UsrTransfer,
    CreditAssign,
    AutoCreditAssign,
    CorpRegisterQuery,
    CreditAssignReconciliation(CmdIdGroup.Reconciliation),
    QueryCardInfo,
    /**
     * 2014.2.20新加
     */
    DelCard,
    /**
     * 2014.3.10生利宝相关
     */
    FssTrans,
    FssPurchaseReconciliation(CmdIdGroup.Reconciliation),
    FssRedeemReconciliation(CmdIdGroup.Reconciliation),
    QueryFss, //生利宝产品信息查询
    QueryFssAccts,  //生利宝账户信息查询
    
    /**
     * 2014.12.31更新
     */
    AddBidInfo,
    QueryUsrInfo,
    QueryTransDetail,
    /**
     * 2015.01.23 批量还款
     */
    BatchRepayment;
    
    private final CmdIdGroup group;

    private CmdIdType() {
        //default group
        this.group = CmdIdGroup.Trade;
    }

    private CmdIdType(final CmdIdGroup group) {
        this.group = group;
    }
    
    public CmdIdGroup getGroup(){
        return group;
    }
}
