/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idm.model;

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
public class IDMResult {
    
    private String result;
    
    private String errorMessage;
    
    private boolean isSuccess;  
}
