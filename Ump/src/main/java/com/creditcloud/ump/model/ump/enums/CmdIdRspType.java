/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

/**
 * UMP接口操作返回类型
 * 
 * @author kdliu
 */
public enum CmdIdRspType {
    /**
     * 个人用户注册
     */
    MER_REGISTER_PERSON_RSP,
    /**
     * 绑定银行卡
     */
    MER_BIND_CARD_RSP,
    /**
     * 绑定银行卡结果通知
     */
    MER_BIND_CARD_NOTIFY_RSP,
    /**
     * 无密签约
     */
    MER_BIND_AGREEMENT_RSP,
    /**
     * 无密签约结果通知
     */
    MER_BIND_AGREEMENT_NOTIFY_RSP,
    /**
     * 授权解约
     */
    MER_UNBIND_AGREEMENT_RSP,
    /**
     * 授权解约结果
     */
    MER_UNBIND_AGREEMNT_NOTIFY_RSP,
    /**
     * 发标
     */
    MER_BIND_PROJECT_RSP,
    /**
     * 标的更新
     */
    MER_UPDATE_PROJECT_RSP,
    /**
     * 标的转账
     */
    PROJECT_TRANSFER_RSP,
    /**
     * 标的交易通知
     */
    PROJECT_TRANSFER_NOTIFY_RSP,
    /**
     * 无密标的转入
     */
    PROJECT_TRANSFER_NOPWD_RSP,
    /**
     * 个人客户充值申请
     */
    MER_RECHARGE_PERSON_RSP,
    /**
     * 企业客户充值申请
     */
    MER_RECHARGE_RSP,
    /**
     * 充值结果通知
     */
    RECHARGE_NOTIFY_RSP,
    /**
     * 无密个人客户充值
     */
    MER_RECHARGE_PERSON_NOPWD_RSP,
    /**
     * 个人账户提现
     */
    CUST_WITHDRAWALS_RSP,
    /**
     * 企业客户提现
     */
    MER_WITHDRAWALS_RSP,
    /**
     * 提现通知
     */
    NOTIFY_WITHDRAW_RSP,
    /**
     * 普通免密转账
     */
    TRANSFER_RSP,
    /**
     * 普通验密转账
     */
    TRANSFER_ASYN_RSP,
    /**
     * 普通转账通知
     */
    TRANSFER_NOTIFY_RSP,
    /**
     * 交易查询
     */
    TRANSFER_SEARCH_RSP,
    /**
     * 用户查询
     */
    USER_SEARCH_RSP,
    /**
     * 标的查询
     */
    PROJECT_ACCOUNT_SEARCH_RSP,
    /**
     * 账户流水查询
     */
    TRANSEQ_SEARCH_RSP,
    /**
     * 商户账户查询
     */
    PTP_MER_QUERY_RSP;
}
