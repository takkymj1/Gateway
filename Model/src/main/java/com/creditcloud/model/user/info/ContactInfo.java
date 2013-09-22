/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.info;

import com.creditcloud.model.BaseObject;
import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class ContactInfo extends BaseObject {

    private static final long serialVersionUID = 20130918L;

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

    public static ContactInfo fromJsonString(String jsonString) {
        if (jsonString == null) {
            return null;
        }
        JsonObject jo = Json.createReader(new StringReader(jsonString)).readObject();
        ContactInfo result = new ContactInfo();
        result.setEmergency(Contact.fromJsonString(jo.getJsonObject("emergency").toString()));
        result.setColleague(Contact.fromJsonString(jo.getJsonObject("colleague").toString()));
        result.setOther(Contact.fromJsonString(jo.getJsonObject("other") == null ? null : jo.getJsonObject("other").toString()));
        return result;
    }
}
