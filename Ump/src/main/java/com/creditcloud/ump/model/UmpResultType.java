/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * service调用返回结果. 若调用联动出现错误, 需要根据联动返回的错误运行时创建, 故不能为enum.
 * <br/>
 * <li>3位错误代码为系统端错误</li>
 * <li>6位错误代码为联动端错误</li>
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class UmpResultType extends BaseObject {

    public static final UmpResultType SUCCESS = new UmpResultType(UmpConstant.SUCCESS_CODE, UmpConstant.SUCCESS_MSG);

    public static final UmpResultType NETWORK_ERROR = new UmpResultType("001", "网络错误");

    public static final UmpResultType ACCOUNT_EXIST = new UmpResultType("002", "三方账户已存在");

    public static final UmpResultType ACCOUNT_NOT_EXIST = new UmpResultType("003", "三方账户不存在");

    public static final UmpResultType NOT_SUPPORT_YET = new UmpResultType("004", "功能尚未开放");

    public static final UmpResultType FREEZE_ACCOUNT_NOT_FOUND = new UmpResultType("005", "冻结账户未找到");

    public static final UmpResultType FREEZE_USER_NOT_FOUND = new UmpResultType("006", "冻结用户未找到");

    public static final UmpResultType FREEZE_USER_NO_PAYMENT = new UmpResultType("007", "冻结用户未开户");

    public static final UmpResultType ID_CODE_EXIST = new UmpResultType("008", "身份证号已注册");

    public static final UmpResultType AMOUNT_ERROR = new UmpResultType("009", "交易金额错误");

    public static final UmpResultType NOT_SIGN_INVEST_NO_PWD = new UmpResultType("010", "未签订无密投资协议");

    /**
     * added from 2015-01-20
     */
    public static final UmpResultType TENDER_NOT_FOUND = new UmpResultType("011", "标的账户不存在");

    public static final UmpResultType FAIL = new UmpResultType("999", "交易失败");
    
    public static final UmpResultType UMP_AGREEMENT_NOT_EXISTS = new UmpResultType("900", "Ump协议不存在");
    
    public static final UmpResultType UPDATE_UMP_AGREEMENT_FAILURE = new UmpResultType("901", "暂存更新失败");
    
    public static final UmpResultType UPDATE_USER_CARD_FAILURE = new UmpResultType("902", "用户更新银行卡失败");

    public static final UmpResultType FUND_ACCOUNT_NOT_EXISTS = new UmpResultType("903", "从未绑定银行卡");
    
    @NotNull
    private String retCode;

    private String retMsg;

}
