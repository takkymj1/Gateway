/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.asset;

import com.creditcloud.interestbearing.ta.message.ResponseMessage;
import com.creditcloud.interestbearing.ta.utils.CustomLocalDateTimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDateTime;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportPlatformSubscribeResponseMessage extends ResponseMessage {

    private String product_type;
    private String product_id;
    private String ori_id;
    private BigDecimal hold_num_inc;
    private BigDecimal hold_amount_inc;
    private BigDecimal hold_num_dec;
    private BigDecimal hold_amount_dec;
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    private LocalDateTime act_time;
}
