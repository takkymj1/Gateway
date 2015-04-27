package com.creditcloud.fund.model;

import com.creditcloud.fund.model.enums.CouponStatus;
import com.creditcloud.fund.model.enums.CouponType;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Channel;
import com.creditcloud.model.enums.Source;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA. User: meichao Date: 2015/3/23 Time: 19:03 To
 * change this template use File | Settings | File Templates.
 */
@Data
@NoArgsConstructor
public class CouponRecord extends BaseObject {
    private String id;
    private String userId;//用户ID
    private String eventId;//获取奖券的活动ID
    private String couponId;
    private CouponType couponType;//券类型
    private String couponTypeDisplay;//奖券类型前端显示名称
    private String couponName;
    private BigDecimal amount;//金额
    private String limitType;//奖券使用限制方式
    private BigDecimal amountLimit;
    private BigDecimal rateLimit;
    private int useLimit;//使用次数
    private String useDescription;//使用说明
    private Date startTime;//生效日
    private Date endTime;//到期日
    private Channel channel;
    private Source source;
    private CouponStatus status;//券状态
    private Date timeCreated;
    private Date timeLastUpdated;
    private Date useTime;//已使用--->使用时间
    private FundEvent event;
    private int exchangePriority;//兑换优先级
    private BigDecimal exchangedAmount;//已兑换金额

    public CouponRecord(String id,
                        String userId,
                        String eventId,
                        String couponId,
                        String couponName,
                        CouponType couponType,
                        String couponTypeDisplay,
                        BigDecimal amount,
                        String limitType,
                        BigDecimal amountLimit,
                        BigDecimal rateLimit,
                        int useLimit,
                        String useDescription,
                        Date startTime,
                        Date endTime,
                        Channel channel,
                        Source source,
                        CouponStatus status,
                        Date timeCreated,
                        Date timeLastUpdated,
                        int exchangePriority,
                        BigDecimal exchangedAmount) {
        this.id = id;
        this.userId = userId;
        this.eventId = eventId;
        this.couponId = couponId;
        this.couponName = couponName;
        this.couponType = couponType;
        this.couponTypeDisplay = couponTypeDisplay;
        this.amount = amount;
        this.limitType = limitType;
        this.amountLimit = amountLimit;
        this.rateLimit = rateLimit;
        this.useLimit = useLimit;
        this.useDescription = useDescription;
        this.startTime = startTime;
        this.endTime = endTime;
        this.channel = channel;
        this.source = source;
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeLastUpdated = timeLastUpdated;
        this.exchangePriority = exchangePriority;
        this.exchangedAmount = exchangedAmount;
    }
}
