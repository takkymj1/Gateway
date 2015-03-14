/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idm.api;

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
public class Result extends BaseObject {
    private String Status;
    
    private String Key;
    
    private String Code;
    
    private String Message;
    
}
