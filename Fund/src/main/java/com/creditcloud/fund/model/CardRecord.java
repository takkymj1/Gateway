/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.fund.CardRecordStatus;
import com.creditcloud.model.enums.misc.Bank;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author caojiadong
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class CardRecord extends BaseObject {
    
    private static final long serialVersionUID = 20131117L;

    private String id;
    
    private String userId;
    
    private String name;
    
    private Bank replaceBank;
    
    private String replaceAccount;
    
    private Bank bank;
    
    private String account;
    
    private String orderId;
    
    private CardRecordStatus status;
    
    private Date timeCreated;

    private Date timeLastUpdated;
    
    public CardRecord(String id,
                      String userId,
                      String name,
                      Bank replaceBank,
                      String replaceAccount,
                      Bank bank,
                      String account,
                      String orderId,
                      CardRecordStatus status) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.replaceBank = replaceBank;
        this.replaceAccount = replaceAccount;
        this.bank = bank;
        this.account = account;
        this.orderId = orderId;
        this.status = status;
    }
}
