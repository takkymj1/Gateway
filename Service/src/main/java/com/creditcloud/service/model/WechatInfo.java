package com.creditcloud.service.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.model.enums.WechatRewardStatus;

/**
 *
 * @author panda
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class WechatInfo extends BaseObject {

    private static final long serialVersionUID = 20141023L;
    /**
     * ID
     */
    private String id;
    /**
     * 微信号
     */

    private String wechatId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 中奖金额
     */
    private BigDecimal amount;

    /**
     * 中奖时间
     */
    private Date luckyTime;

    /**
     * 是否中奖,0:未中奖，1:已中奖未兑换，2:已中奖已兑换，3:已中奖已派发
     */
    private WechatRewardStatus operation;
}
