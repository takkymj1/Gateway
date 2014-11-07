/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author suetming
 */
@Data
@AllArgsConstructor
public class Feedback extends BaseObject {
 
    private static final long serialVersionUID = 20141107L;
    
    String userId;
    
    String loginName;
    
    String contact;
    
    String feedback;
    
    long created;
}
