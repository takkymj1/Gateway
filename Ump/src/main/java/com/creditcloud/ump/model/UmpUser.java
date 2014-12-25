/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class UmpUser extends BaseObject {

    private String umpUserId;

    private String umpAccountId;

    private String userName;

    private String identityType;

    private String identityCode;

    private String mobileId;

    private String email;

    /**
     * 1-正常 2-挂失 3-冻结 4-锁定 9-销户
     */
    private String accountState;

    private BigDecimal balance;

    private String cardId;

    private String gateId;

    private String userBindAgreementList;

}
