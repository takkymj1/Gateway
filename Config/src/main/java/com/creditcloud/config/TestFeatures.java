/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 测试相关feature<p>
 * 只能在测试环境中使用!
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TestFeatures extends BaseObject {

    private static final long serialVersionUID = 20150409L;

    /**
     * 统一略过所有短信验证码
     */
    @XmlElement(required = false)
    @Getter
    private boolean skipSmsCaptcha = false;

}
