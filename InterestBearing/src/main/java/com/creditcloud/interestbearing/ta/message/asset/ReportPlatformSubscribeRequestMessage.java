/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.asset;

import static com.creditcloud.interestbearing.ta.message.Message.toJSON;
import com.creditcloud.interestbearing.ta.message.RequestMessage;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDateTime;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportPlatformSubscribeRequestMessage extends RequestMessage {

    private String product_type = "fund";// 增持或减持的产品类型，如：基金fund
    private String ori_id;// 产品原有代码，如：基金代码
    private BigDecimal hold_num_inc = BigDecimal.ZERO;// 增持份数
    private BigDecimal hold_amount_inc = BigDecimal.ZERO;// 增持价值总金额
    private BigDecimal hold_num_dec = BigDecimal.ZERO;// 减持份数
    private BigDecimal hold_amount_dec = BigDecimal.ZERO;// 减持价值总金额
    private String act_time;// 增持或减持成功时间

    public void setAct_time(LocalDateTime actTime) {
        act_time = actTime == null ? "" : actTime.toString();
    }
}
