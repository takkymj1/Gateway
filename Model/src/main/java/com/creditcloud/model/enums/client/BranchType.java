/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.client;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum BranchType implements BaseEnum {

    HEADQUARTER("总部"),
    DEPARTMENTOFFICE("部门办公室"),
    BRANCHOFFICE("分公司"),
    BUSINESSOFFICE("营业部"),
    FRANCHISEE("加盟商");

    private final String key;

    private BranchType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
