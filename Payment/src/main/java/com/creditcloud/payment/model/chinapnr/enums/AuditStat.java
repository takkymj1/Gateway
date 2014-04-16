/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 审核状态
 *
 * @author rooseek
 */
public enum AuditStat implements BaseEnum {

    /**
     * 不是汇付定义的,用于表示查询对象不存在
     */
    NOTEXIST("不存在"),
    /**
     * 不是汇付定义，用于表示非企业用户
     */
    NOTCORPORATION("不是企业用户"),
    I("初始"),
    T("提交"),
    P("审核中"),
    R("审核拒绝"),
    F("开户失败"),
    K("开户中"),
    Y("开户成功");

    private final String key;

    private AuditStat(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
    public boolean success() {
        return this.equals(Y);
    }
}
