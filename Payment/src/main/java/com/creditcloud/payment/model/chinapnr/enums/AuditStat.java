/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

/**
 * 审核状态
 *
 * @author rooseek
 */
public enum AuditStat {

    I, //初始
    T, //提交
    P, //审核中
    R, //审核拒绝
    F, //开户失败
    K; //开户中

}
