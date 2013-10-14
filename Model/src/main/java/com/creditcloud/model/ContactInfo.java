/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class ContactInfo extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @XmlElement(name = "emergency")
    private Contact emergency;

    @XmlElement(name = "colleague")
    private Contact colleague;

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
    public int hashCode() {
        return new HashCodeBuilder().append(emergency).append(colleague).append(other).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContactInfo other = (ContactInfo) obj;
        if (!Objects.equals(this.emergency, other.emergency)) {
            return false;
        }
        if (!Objects.equals(this.colleague, other.colleague)) {
            return false;
        }
        if (!Objects.equals(this.other, other.other)) {
            return false;
        }
        return true;
    }
}
