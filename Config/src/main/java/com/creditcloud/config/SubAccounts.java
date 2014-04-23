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
 * 基本子账户之外的其他子账户
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SubAccounts extends BaseObject{

    private static final long serialVersionUID = 20140424L;

    /**
     * 车贷手续费账户
     */
    @XmlElement
    @Getter
    private SubAccount vehicleFeeAccount;

    /**
     * 车贷保证金账户
     */
    @XmlElement
    @Getter
    private SubAccount vehicleGuaranteeAccount;

}
