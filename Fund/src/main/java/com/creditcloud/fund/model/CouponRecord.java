package com.creditcloud.fund.model;

import com.creditcloud.fund.model.enums.CouponStatus;
import com.creditcloud.fund.model.enums.CouponType;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Channel;
import com.creditcloud.model.enums.Source;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/3/23
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */
@Data
@NoArgsConstructor
public class CouponRecord extends BaseObject{

    private String id;

    private String eventId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 券类型
     */
    private CouponType couponType;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 使用次数
     */
    private int useLimit;

    /**
     * 使用说明
     */
    private String useDescription;

    /**
     * 开始日期
     */
    private Date startTime;

    /**
     * 结束日期
     */
    private Date endTime;

    private Channel channel;

    private Source source;

    /**
     * 券状态
     */
    private CouponStatus status;

    /**
     * 已使用--->使用时间
     */
    private Date useTime;

    public CouponRecord(String id,
                        String eventId,
                        String userId,
                        CouponType couponType,
                        BigDecimal amount,
                        int useLimit,
                        String useDescription,
                        Date startTime,
                        Date endTime,
                        Channel channel,
                        Source source,
                        CouponStatus status,
                        Date useTime) {
        this.id = id;
        this.eventId = eventId;
        this.userId = userId;
        this.couponType = couponType;
        this.amount = amount;
        this.useLimit = useLimit;
        this.useDescription = useDescription;
        this.startTime = startTime;
        this.endTime = endTime;
        this.channel = channel;
        this.source = source;
        this.status = status;
        this.useTime = useTime;
    }
}
