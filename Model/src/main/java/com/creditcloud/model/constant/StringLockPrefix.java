/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

/**
 * 利用String.intern控制并发时使用的prefix
 *
 * @author rooseek
 */
public interface StringLockPrefix {

    /**
     * 用户账户与三方支付对账
     */
    String User_Calibrate_Lock = "user.calibrate.lock";

    /**
     * 订单处理互斥
     */
    String Order_Mutex_Lock = "order.mutex.lock";

    /**
     * pnr账号创建
     */
    String Pnr_Create_Lock = "pnr.create.lock";

    /**
     * ump账户创建
     */
    String Ump_Create_Lock = "ump.create.lock";

    /**
     * yeep账户创建
     */
    String Yeep_Create_Lock = "yeep.create.lock";

    /**
     * lychee账户创建
     */
    String Lychee_Create_Lock = "lychee.create.lock";

    /**
     * 债权转让
     */
    String Credit_Assign_Lock = "credit.assign.lock";
    
    /**
     * 标的还款
     */
    String Loan_Repay_Lock = "loan.repay.lock";

    /**
     * 新人红包
     */
    String coupon_newUser_lock = "coupon.newUser.lock";
    
    /**
     * 微信抽奖
     */
    String event_lottery_lock = "event.lottery.lock";
}
