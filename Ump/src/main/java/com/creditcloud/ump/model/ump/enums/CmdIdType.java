/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.enums;

/**
 * UMP接口操作类型
 *
 * @author kdliu
 */
public enum CmdIdType {

    /**
     * 个人用户注册
     */
    MER_REGISTER_PERSON,
    /**
     * 绑定银行卡
     */
    MER_BIND_CARD,
    /**
     * 无密绑定银行卡
     */
    MER_BIND_CARD_NOPWD,
    /**
     * 绑定银行卡结果通知
     */
    MER_BIND_CARD_NOTIFY,
    /**
     * 绑定银行卡结果通知-联动新接口替换 MER_BIND_CARD_NOTIFY
     */
    MER_BIND_CARD_APPLY_NOTIFY,
    /**
     * 无密签约
     */
    MER_BIND_AGREEMENT,
    /**
     * 无密签约结果通知
     */
    MER_BIND_AGREEMENT_NOTIFY,
    /**
     * 授权解约
     */
    MER_UNBIND_AGREEMENT,
    /**
     * 授权解约结果
     */
    MER_UNBIND_AGREEMNT_NOTIFY,
    /**
     * 下发交易密码
     */
    MER_SEND_SMS_PWD,
    /**
     * 发标
     */
    MER_BIND_PROJECT,
    /**
     * 标的更新
     */
    MER_UPDATE_PROJECT,
    /**
     * 标的转账
     */
    PROJECT_TRANSFER,
    /**
     * 标的交易通知
     */
    PROJECT_TRANFER_NOTIFY,
    /**
     * 无密标的转入
     */
    PROJECT_TRANSFER_NOPWD,
    /**
     * 个人客户充值申请
     */
    MER_RECHARGE_PERSON,
    /**
     * 企业客户充值申请
     */
    MER_RECHARGE,
    /**
     * 充值结果通知
     */
    RECHARGE_NOTIFY,
    /**
     * 无密个人客户充值
     */
    MER_RECHARGE_PERSON_NOPWD,
    /**
     * 个人账户提现
     */
    CUST_WITHDRAWALS,
    /**
     * 个人账户无密提现
     */
    CUST_WITHDRAWALS_NOPWD,
    /**
     * 企业客户提现
     */
    MER_WITHDRAWALS,
    /**
     * 提现通知
     */
    WITHDRAW_NOTIFY,
    /**
     * 提现通知-联动新接口替换 WITHDRAW_NOTIFY
     */
    WITHDRAW_APPLY_NOTIFY,
    /**
     * 普通免密转账
     */
    TRANSFER,
    /**
     * 普通验密转账
     */
    TRANSFER_ASYN,
    /**
     * 普通转账通知
     */
    TRANSFER_NOTIFY,
    /**
     * 交易查询
     */
    TRANSFER_SEARCH,
    /**
     * 用户查询
     */
    USER_SEARCH,
    /**
     * 标的查询
     */
    PROJECT_ACCOUNT_SEARCH,
    /**
     * 账户流水查询
     */
    TRANSEQ_SEARCH,
    /**
     * 商户账户查询
     */
    PTP_MER_QUERY,
    /**
     * 对账文件下载
     */
    DOWNLOAD_SETTLE_FILE_P,
   /**
    * 更换银行卡
    */
   MER_REPLACE_CARD;
}
