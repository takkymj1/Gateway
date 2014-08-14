/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
public class UmpAccount {
    
    private String accountId;
    
    private String accountName;
    
    private String userId;
    
    private String regDate;
    
    private Date timeCreate;

    public UmpAccount(String accountId, String accountName, String userId, String regDate, Date timeCreate) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.userId = userId;
        this.regDate = regDate;
        this.timeCreate = timeCreate;
    }
}
