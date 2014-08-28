/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
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
public class UmpTransaction extends BaseObject {
    
    private String orderId;
    
    private String checkDate;
    
    private String merDate;
    
    private String transactionId;
    
    private String busiType;
    
    private String amount;
    
    private String fee;
    
    private String cashDirection;
    
    private String tranState;
    
    private String smsNum;
    
    
}
