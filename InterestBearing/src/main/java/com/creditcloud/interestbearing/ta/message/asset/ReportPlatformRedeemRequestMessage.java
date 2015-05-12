/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.asset;

import com.creditcloud.interestbearing.ta.message.RequestMessage;
import com.creditcloud.interestbearing.ta.utils.CustomLocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
public class ReportPlatformRedeemRequestMessage extends RequestMessage {

    private String product_type;// 增持或减持的产品类型，如：基金fund
    private String ori_id;// 产品原有代码，如：基金代码
    private BigDecimal hold_num_inc;// 增持份数
    private BigDecimal hold_amount_inc;// 增持价值总金额
    private BigDecimal hold_num_dec;// 减持份数
    private BigDecimal hold_amount_dec;// 减持价值总金额
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    private LocalDateTime act_time;// 增持或减持成功时间
}
