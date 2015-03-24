/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author chai
 */
public enum PolicyStatus implements BaseEnum{
    
    NONE("0", "无记录"),
    NEED_PROPOSAL("1", "待核保"),
    PROPOSAL_SUCCESSED("2", "核保通过"),
    PROPOSAL_FAILED("3", "核保失败"),
    POLICY_CREATING("4", "出单中"),
    POLICY_SUCCESSED("5", "出单成功"),
    POLICY_FAILED("6", "出单失败");
    
    /**
     * 代码
     */
    private final String key;
    
    /**
     * 名称
     */
    private final String name;

    private PolicyStatus(String key, String name){
        this.key = key;
        this.name = name;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }
}