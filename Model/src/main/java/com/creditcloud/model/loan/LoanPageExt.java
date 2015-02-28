/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.loan;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author zhanggm
 */
@Data
@NoArgsConstructor
public class LoanPageExt extends Loan{
    
    private String loanRequestSerial;
    private String userId;
    private String LoginName;
    private String purposeKey;
    private String methodKey;
    
}
