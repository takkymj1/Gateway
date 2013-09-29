/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded.info;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import com.creditcloud.model.validation.group.LoanRequestCheck;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
@Embeddable
public class Contact extends BaseEntity {

    @RealName(message = "联系人姓名格式不正确",
              groups = LoanRequestCheck.class)
    private String name;

    @NotNull(message = "联系人关系不能为空",
             groups = LoanRequestCheck.class)
    private String relation;

    @MobileNumber(message = "联系人手机号格式不正确",
                  groups = LoanRequestCheck.class)
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
