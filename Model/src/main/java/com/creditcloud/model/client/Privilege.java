/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.client;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sobranie
 */
@XmlRootElement(name = "Privilege")
@XmlAccessorType(XmlAccessType.FIELD)
public class Privilege extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    protected String code;

    @NotNull
    protected String name;

    @XmlElement(required = false)
    protected String description;

    public Privilege() {
    }

    public Privilege(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
