/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户在第三方支付上的账号
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class PaymentAccount extends BaseObject {

    private static final long serialVersionUID = 20131111L;

    /**
     * 用户的唯一ID，与UserService中的一致
     */
    private String userId;

    /**
     * 由三方支付生成的用户唯一ID, UsrCustId
     */
    private String accountId;

    /**
     * 用户在三方支付中的用户名，可以与loginName不同, UsrId
     */
    private String accountName;

    private Date timeCreate;

    public PaymentAccount(String userId,
                          String accountId,
                          String accountName,
                          Date timeCreate) {
        this.userId = userId;
        this.accountId = accountId;
        this.accountName = accountName;
        this.timeCreate = timeCreate;
    }
}
