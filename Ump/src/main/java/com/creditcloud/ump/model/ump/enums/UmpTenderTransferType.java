/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

/**
 *
 * @author kdliu
 */
public enum UmpTenderTransferType {
    /**
     * 投标
     */
    INVEST("01"),
    /**
     * 债权购买
     */
    CREDIT_ASSIGN("02"),
    /**
     * 还款
     */
    REPAY("03"),
    /**
     * 偿付
     */
    DISBURSE("04"),
    /**
     * 贴现
     */
    DISCOUNT("05"),
    /**
     * 流标后返款
     */
    FAILED_REFUND("51"),
    /**
     * 平台收费
     */
    PLATFORM_CHARGE("52"),
    /**
     * 放款
     */
    LOAN("53"),
    /**
     * 还款后返款
     */
    REPAY_REFUND("54"),
    /**
     * 偿付后返款
     */
    DISBURSE_REFUND("55"),
    /**
     * 债权转让的返款
     */
    CREDIT_REFUND("56"),
    /**
     * 撤资后的返款
     */
    DINVEST_REFUND("57");
   
    private String code;
    
    UmpTenderTransferType(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
