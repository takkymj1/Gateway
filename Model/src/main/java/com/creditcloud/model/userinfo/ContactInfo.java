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
public class ContactInfo extends BaseObject {

    private Contact emergency;

    private Contact colleague;

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
