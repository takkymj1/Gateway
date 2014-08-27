/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.ump.model.ump.enums.UmpAgreementType;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
@AllArgsConstructor
public class UmpAgreementResult {
    
    private UmpAgreementType type;
    
    private String retCode;
    
    private String retMsg;
}
