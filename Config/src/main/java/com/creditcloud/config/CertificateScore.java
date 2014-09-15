/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.credit.CreditRank;
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
public class CertificateScore extends BaseObject {

    private static final long serialVersionUID = 20140915L;

    /**
     * 最小得分
     */
    @Getter
    @XmlElement(required = true)
    private int minScore;

    /**
     * 最大得分
     */
    @Getter
    @XmlElement(required = true)
    private int maxScore;

    /**
     * 对应评级</p>
     * TODO 换成用户自定义评级标识体系
     */
    @Getter
    @XmlElement(required = true)
    private CreditRank rank;

}
