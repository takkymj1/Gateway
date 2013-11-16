/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.client;

import com.creditcloud.model.enums.BaseEnum;
import com.creditcloud.model.enums.Realm;

/**
 * 员工活动类型<p>
 * TODO 目前用不上,贷款类活动都包含在下类中
 *
 * @see com.creditcloud.model.enums.loan.RequestActivityType
 * @author rooseek
 */
public enum ActivityType implements BaseEnum {

    TODO("待定..", Realm.EMPLOYEE);

    private final String key;

    /**
     * 活动关联的实体域
     */
    private final Realm realm;

    private ActivityType(String key, Realm realm) {
        this.key = key;
        this.realm = realm;
    }

    @Override
    public String getKey() {
        return key;
    }

    public Realm getRealm() {
        return realm;
    }
}