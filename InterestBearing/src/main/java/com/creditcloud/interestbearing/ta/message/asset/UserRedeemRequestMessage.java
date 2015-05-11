/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.asset;

import static com.creditcloud.interestbearing.ta.message.Message.toJSON;
import com.creditcloud.interestbearing.ta.message.RequestMessage;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
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
    
    @Override
    public String toRequestJSON() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("amount", amount.toString());
        return toJSON(parameters);
    }
}
