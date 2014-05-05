/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 企业开户实时返回结果
 *
 * @author rooseek
 */
public enum CorpRegisterCode implements BaseEnum {

    CODE_216("216", "企业用户注册信息不存在"),
    CODE_217("217", "企业用户注册审核拒绝"),
    CODE_218("218", "企业用户注册审核中"),
    CODE_219("219", "企业用户注册已提交待审核");

    private final String key;

    private final String description;

    private CorpRegisterCode(String key, String description) {
        this.key = key;
        this.description = description;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

}
