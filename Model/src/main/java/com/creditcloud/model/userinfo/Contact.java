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
public class Contact extends BaseObject implements Jsonizable<Contact> {

    @FormParam("name")
    @XmlElement(name = "name")
    private String name;

    @FormParam("relation")
    @XmlElement(name = "relation")
    private String relation;

    @FormParam("mobile")
    @XmlElement(name = "mobile")
    private String mobile;

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

    public Contact() {
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

    @Override
    public Contact fromJsonString(String jsonString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toJsonString() {
        return Json.createObjectBuilder()
                .add("name", name)
                .add("relation", relation)
                .add("mobile", mobile)
                .build().toString();
    }
}
