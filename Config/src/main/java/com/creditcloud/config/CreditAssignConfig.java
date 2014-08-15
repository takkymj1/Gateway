/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.NoArgsConstructor;

/**
 * 债权转让相关配置
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditAssignConfig extends BaseObject {

    private static final long serialVersionUID = 20140814L;

}
