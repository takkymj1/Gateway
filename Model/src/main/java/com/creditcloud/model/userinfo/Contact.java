/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Contact extends BaseObject {

    @RealName
    private String name;

    @NotNull
    private String relation;

    @MobileNumber
    private String mobile;

    public Contact() {
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
