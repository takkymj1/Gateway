/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.Jsonizable;
import javax.json.Json;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class ContactInfo extends BaseObject implements Jsonizable<ContactInfo> {

    @FormParam("emergency")
    @XmlElement(name = "emergency")
    private Contact emergency;

    @FormParam("colleague")
    @XmlElement(name = "colleague")
    private Contact colleague;

    @FormParam("other")
    @XmlElement(name = "other")
    private Contact other;

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

    public ContactInfo() {
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

    @Override
    public String toJsonString() {
        return Json.createObjectBuilder()
                .add("emergency", emergency.toJsonString())
                .add("colleague", colleague.toJsonString())
                .add("other", other.toJsonString())
                .build().toString();

    }

    @Override
    public ContactInfo fromJsonString(String jsonString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
