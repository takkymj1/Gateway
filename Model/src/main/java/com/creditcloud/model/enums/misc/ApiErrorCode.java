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
    USER_DEPOSIT_FAILED("用户充值失败"),
    USER_WITHDRAW_EXCEED_LIMIT("用户提现超出限额"),
    USER_NOT_BIND_BANK_CARD("用户未绑定银行卡"),
    USER_BANK_ACCOUNT_NOT_FOUND("用户银行卡未找到"),
    
    UMP_TENDER_NOT_FOUND("未找到联动优势标的账户"),
    UMP_CREATE_ACCOUNT_FAILED("联动优势账号创建失败"),
    UMP_ACCOUNT_NOT_FOUND("未开通联动优势账户"),
    
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
    INVALID_CAPTCHA("无效的验证码"),
    INVALID_MOBILE("无效的手机号"),
    INVALID_MOBILE_CAPTCHA("无效的手机验证码"),    
    INVALID_UMP_TENDER_AMOUNT("无效的投标金额联动优势"),
    
    AGREEMENT_NOT_SIGNED("未签署相关协议"),
    
    MOBILE_AND_NAME_NOT_MATCH("手机号与真实姓名不匹配"),
    MOBILE_CAPTCHA_ALREADY_SENT("手机验证码已经发送"),
    MOBILE_CAPTCHA_EXPIRED("手机验证码已经过期"),
    MOBILE_ALREADY_EXISTED("手机号已经存在"),
    
    LOGINNAME_ALREADY_EXISTED("登录名已经存在"),
    
    IDNUMBER_ALREADY_EXISTED("身份证号已经存在"),
    IDNUMBER_AND_NAME_NOT_MATCH("身份证号与真实姓名不匹配"),
    
    MSG_RECEIVER_EMPTY("消息接受方为空"),
    MSG_TITLE_EMPTY("消息标题为空"),
    MSG_CONTENT_EMPTY("消息内容为空"),
    MSG_SEND_FAILED("消息发送失败"),
    
    TAG_NOT_FOUND("标签未找到"),
    
    BANK_NOT_FOUND("银行卡未找到"),
    
    ORDERID_CREATED_FAILED("订单创建失败"),
    
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
