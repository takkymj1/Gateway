/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idm.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author tinglany
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class UserAttr extends BaseObject {
    private String uid;
    
    private String userpassword;
    
    private String cn;
    
    private String mobile;
    
    private String securemobile;
    
    private String mail;
    
    private String userType;
    
    private String idcardtype;
    
    private String idcardnumber;
    
    private String bankid;
    
    private String bankname;
    
    private String bankaccountmobile;
    
    private String bankaccountcha;
    
    private String fundaccount;
    
    private String fundcustomerid;
    
    private String fundtradingpass;
    
}
