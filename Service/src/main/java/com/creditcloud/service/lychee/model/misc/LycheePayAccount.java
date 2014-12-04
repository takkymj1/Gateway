/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.lychee.model.misc;

import com.creditcloud.model.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */

@Data
@NoArgsConstructor
public class LycheePayAccount extends BaseObject{
    
    private static final long serialVersionUID = 20141201L;

    private String userId;

    private String accountId;

    private String capitalAccountId;

    public LycheePayAccount(String userId, 
                            String accountId, 
                            String capitalAccountId) {
        this.userId = userId;
        this.accountId = accountId;
        this.capitalAccountId = capitalAccountId;
    }
}
