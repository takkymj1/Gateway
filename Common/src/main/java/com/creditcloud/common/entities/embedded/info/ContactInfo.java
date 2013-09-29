/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded.info;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.validation.group.LoanRequestCheck;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
@Embeddable
public class ContactInfo extends BaseEntity {

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "name", column =
                                          @Column(name = "EC_NAME")),
        @AttributeOverride(name = "relation", column =
                                              @Column(name = "EC_RELATION")),
        @AttributeOverride(name = "mobile", column =
                                            @Column(name = "EC_MOBILE"))
    })
    @NotNull(message = "紧急联系人信息不能为空",
             groups = LoanRequestCheck.class)
    @Valid
    private Contact emergency;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "name", column =
                                          @Column(name = "CC_NAME")),
        @AttributeOverride(name = "relation", column =
                                              @Column(name = "CC_RELATION")),
        @AttributeOverride(name = "mobile", column =
                                            @Column(name = "CC_MOBILE"))
    })
    @NotNull(message = "工作联系人信息不能为空",
             groups = LoanRequestCheck.class)
    @Valid
    private Contact colleague;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "name", column =
                                          @Column(name = "OC_NAME")),
        @AttributeOverride(name = "relation", column =
                                              @Column(name = "OC_RELATION")),
        @AttributeOverride(name = "mobile", column =
                                            @Column(name = "OC_MOBILE"))
    })
    @Valid
    private Contact other;

    public ContactInfo() {
    }

    /**
     *
     * @param emergency 紧急联系人,必须是直系亲属
     * @param colleague 工作联系人
     * @param other 其他联系人,可以为空
     */
    public ContactInfo(Contact emergency, Contact colleague, Contact other) {
        this.emergency = emergency;
        this.colleague = colleague;
        this.other = other;
    }

    public Contact getEmergency() {
        return emergency;
    }

    public Contact getColleague() {
        return colleague;
    }

    public Contact getOther() {
        return other;
    }

    public void setEmergency(Contact emergency) {
        this.emergency = emergency;
    }

    public void setColleague(Contact colleague) {
        this.colleague = colleague;
    }

    public void setOther(Contact other) {
        this.other = other;
    }
}
