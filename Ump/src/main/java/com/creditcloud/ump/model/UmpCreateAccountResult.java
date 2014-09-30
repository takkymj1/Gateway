/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
@XmlRootElement
public class UmpCreateAccountResult extends UmpResult {
        
    private final UmpAccount umpAccount;

    public UmpCreateAccountResult(UmpResultType umpResultType, UmpAccount umpAccount) {
        super(umpResultType);
        this.umpAccount = umpAccount;
    }
    
    public UmpCreateAccountResult(UmpResultType umpResultType) {
        super(umpResultType);
        umpAccount = null;
    }
}