/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
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
public class UmpTender extends BaseObject {

    private String loanId;
    
    private String umpTenderId;
    
    private String umpTenderAccountId;
    
    private String umpCheckDate;
}
