/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 定义实体相关的域
 *
 * @author rooseek
 */
public enum Realm implements BaseEnum {

    USER("用戶"),
    EMPLOYEE("员工"),
    CLIENT("客戶"),
    /**
     * 下面用在Comment中与用于区分不同实体的评论
     */
    PROOF("证明"),
    CERTIFICATE("认证"),
    LOAN("贷款"),
    LOAN_REQUEST("贷款申请");

    private final String key;

    private Realm(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
