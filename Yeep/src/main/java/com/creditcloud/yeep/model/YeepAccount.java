/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class YeepAccount extends BaseObject {

    private static final long serialVersionUID = 20141123L;

    private String userId;

    private String accountId;

    private Date timeCreate;

    public YeepAccount(String userId,
                       String accountId,
                       Date timeCreate) {
        this.userId = userId;
        this.accountId = accountId;
        this.timeCreate = timeCreate;
    }

}
