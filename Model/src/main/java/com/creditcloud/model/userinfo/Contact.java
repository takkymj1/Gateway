/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;

/**
 *
 * @author rooseek
 */
public class Contact extends BaseObject {

    private final String name;

    private final String relation;

    private final String mobile;

    /**
     *
     * @param name 联系人姓名
     * @param relation 联系人关系
     * @param mobile 联系人手机
     */
    public Contact(String name,
                   String relation,
                   String mobile) {
        this.name = name;
        this.relation = relation;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public String getMobile() {
        return mobile;
    }
}
