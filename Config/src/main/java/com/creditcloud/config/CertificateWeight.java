/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.credit.CertificateType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CertificateWeight extends BaseObject {

    private static final long serialVersionUID = 20140915L;

    /**
     * 认证类别
     */
    @Getter
    @XmlElement(required = true)
    private CertificateType type;

    /**
     * 认证类别权重
     */
    @Getter
    @XmlElement(required = true)
    private int weight;

}
