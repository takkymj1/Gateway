/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.enums.misc;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum ApiErrorCode implements BaseEnum {
    
    USER_NOT_SIGN_NO_PWD_AGREEMENT("用户未签订无密投资协议"),
    USER_AMOUNT_INSUFFICIENT("可用金额不足"),
    USER_AMOUNT_INSUFFICIENT_AND_INVEST_RETURN("可用余额不足,投资已返还"),
    USER_AMOUNT_INSUFFICIENT_AND_PREPARE_CONTACT("可用金额不足,请联系客服"),
    
    UMP_TENDER_NOT_FOUND("联动优势投标未发现"),
    
    LOAN_STATUS_FINISHED_OR_CANCEL("标的已经结束或关闭"),
    LOAN_STATUS_FINISHED_AND_INVEST_RETURN("投资失败,已满标,投资已返还"),
    LOAN_STATUS_FINISHED_AND_PREPARE_CONTACT("已满标,请联系客服"),
    
    LOAN_INSUFFICIENT_AND_INVEST_RETURN("可用余额不足,投资已返还"),
    LOAN_INSUFFICIENT_AND_PREPARE_CONTACT("可用金额不足,请联系客服"),
    
    LOAN_BALANCE_ERROR("标的可投金额错误"),

    CROWD_FUNDING_NOT_FOUND("众筹项目未找到"),
    CROWD_FUNDING_STATUS_NOT_OPENED_OR_FINISHED("众筹项目尚未开始或已结束"),
    CROWD_FUNDING_STATUS_FINISHED("众筹已满"),
    ORDER_HAS_PROCESSED("订单已经被处理"),
    
    AMOUNT_ERROR("投标金额错误"),

    INVALID_PARAMS("无效的参数"),
    
    TAG_NOT_FOUND("标签未找到"),
    
    UNKNOWN("未知错误"),
    UNKNOWN_AND_INVEST_RETURN("未知错误,投资已返还"),
    UNKNOWN_AND_PREPARE_CONTACT("未知错误,请联系客服");
    
    private final String key;
    
    ApiErrorCode(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
