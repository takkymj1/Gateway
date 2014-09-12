/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.ump.model.ump.enums.UmpAgreementType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class UmpAgreementResult extends BaseObject{
    
    private UmpAgreementType type;
    
    private String retCode;
    
    private String retMsg;
}
