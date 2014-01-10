/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商户子账户配置
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "SubAccount")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubAccount extends BaseObject {

    /*
     * 账户类型
     */
    @XmlElement(required = true)
    private String accountType;

    /**
     * 账户id
     */
    @XmlElement(required = true)
    private String accountId;
    
    /**
     * 账户中文名称
     */
    @XmlElement(required = true)
    private String name;
}
