/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.fund.model.enums.CouponType;
import com.creditcloud.fund.model.enums.ExpireMode;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 活动奖品
 *
 * @author zaishu.ye@fengjr.com
 */
@Data

@NoArgsConstructor
public class EventPrize extends BaseObject {

    private static final long serialVersionUID = 20140415L;
    private String id;
    private String eventNo;
    private String prizeNo;
    private String prizeName;
    private CouponType prizeType;//奖品类型
    private String useDescription;
    private BigDecimal amount;//金额
    private Integer inventory;//剩余库存
    private ExpireMode expireMode;//过期方式
    private String expireValue;//过期值
    private String limitType;
    private BigDecimal amountLimit;
    private BigDecimal rateLimit;
    private int useLimit;
    private boolean asDefault;
    private boolean valid;

    public EventPrize(String id,
                      String eventNo,
                      String prizeNo,
                      String prizeName,
                      CouponType prizeType,
                      String useDescription,
                      BigDecimal amount,
                      Integer inventory,
                      ExpireMode expireMode,
                      String expireValue,
                      String limitType,
                      BigDecimal amountLimit,
                      BigDecimal rateLimit,
                      int useLimit,
                      boolean asDefault,
                      boolean valid) {
        this.id = id;
        this.eventNo = eventNo;
        this.prizeNo = prizeNo;
        this.prizeName = prizeName;
        this.prizeType = prizeType;
        this.useDescription = useDescription;
        this.amount = amount;
        this.inventory = inventory;
        this.expireMode = expireMode;
        this.expireValue = expireValue;
        this.limitType = limitType;
        this.amountLimit = amountLimit;
        this.rateLimit = rateLimit;
        this.useLimit = useLimit;
        this.asDefault = asDefault;
        this.valid = valid;
    }
}
