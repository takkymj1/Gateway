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
    USER_WITHDRAW_FAILED("用户提现失败"),
    USER_NOT_BIND_BANK_CARD("用户未绑定银行卡"),
    USER_BANK_ACCOUNT_NOT_FOUND("用户银行卡未找到"),
    
    UMP_TRANSFER_ENT2SYS_FAILED("企业向商户转账失败"),
    UMP_TENDER_NOT_FOUND("未找到联动优势标的账户"),
    UMP_CREATE_ACCOUNT_FAILED("联动优势账号创建失败"),
    UMP_ACCOUNT_NOT_FOUND("未开通联动优势账户"),
    UMP_AGREEMENT_NOT_BIND("未绑定联动优势账户相关协议"),
    UMP_AGREEMENT_INSTANT_NOT_BIND("未绑定联动优势无密快捷协议"),
    UMP_AGREEMENT_DEBIT_NOT_BIND("未绑定联动优势借记卡快捷协议"),
    UMP_RET_MSG("请求联动优势返回错误信息"),
    UMP_SENDPASSWORD_FAILED("联动优势重置密码操作失败"),
    
    CHINAPNR_AUTOTENDER_OPEN_FAILED("开通汇付自动投标失败"),
    CHINAPNR_AUTOTENDER_CLOSE_FAILED("关闭汇付自动投标失败"),
    
    PAYMENT_ACCOUNT_NOT_FOUND("未开通第三方托管账户"),
    
    FUND_RECORD_RECHARGE_BY_ORDERID_NOT_FOUND("根据订单编号未找到相关资金记录"),
    
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
    INVALID_AMOUNT("无效的金额"),
    INVALID_SESSION("用户未登录或登录失效"),
    
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
    
    UNKNOWN("未知错误"),
    UNKNOWN_AND_INVEST_RETURN("未知错误,投资已返还"),
    UNKNOWN_AND_PREPARE_CONTACT("未知错误,请联系客服"),
    USER_NOT_FOUND("用户名不存在"),
    PASSWORD_RESET_FAILURE("更改密码失败"),
    PASSWORD_ERROR("登录密码错误"),
   
    CREDITASSIGN_ERROR("债权转让错误");
    
    private final String key;
    
    ApiErrorCode(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
