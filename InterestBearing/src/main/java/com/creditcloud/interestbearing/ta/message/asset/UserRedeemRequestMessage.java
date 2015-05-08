/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.asset;

import com.creditcloud.interestbearing.ta.message.RequestMessage;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserRedeemRequestMessage extends RequestMessage {

    private String tenantId;
    private String userId;
    /**
     * 金额，两位小数
     */
    private BigDecimal amount;
}
