/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model.fuiou;

import com.creditcloud.fuiou.model.CmdIdType;
import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement(name = "baseRequest")  
@XmlType(propOrder = { "ver" })
public abstract class BaseRequest extends BaseObject {

    @NotNull
    @Size(max = 4)
    private String ver;

    @XmlTransient
    private CmdIdType CmdId;

    public BaseRequest(String version,
                       CmdIdType CmdId) {
        this.ver = version;
        this.CmdId = CmdId;
    }
}

