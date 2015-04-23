/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.coupon.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.UUID;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.model.enums.user.UserEventType;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 一个批次的奖券，属于同一个类型.
 *
 * 奖券的发行按照批次来
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponPackage extends BaseObject {

    private static final long serialVersionUID = 20150117L;

    @FormParam("id")
    @UUID
    @NotNull
    private String id;

    /**
     * 奖券类型
     */
    @FormParam("type")
    @NotNull
    private CouponType type;

    /**
     * 后台显示用名称
     */
    @FormParam("name")
    @NotNull
    private String name;

    /**
     * 该批奖券在前台显示的名字
     */
    @FormParam("displayName")
    @NotNull
    private String displayName;
    
    /**
     * 用于区分不同奖券组的编码，比如多种不同类型的奖券都属于“新手奖励”组.
     * 
     * 一般用字母缩写
     */
    @FormParam("code")
    private String code;
    
    /**
     * 触发奖券分配的用户事件类型.
     * 
     * 为空则不能根据事件触发，一般用于自动发券，如投资即送券等
     */
//    @FormParam("userEventType")
//    private UserEventType userEventType;

    /**
     * 详情介绍
     */
    @FormParam("description")
    private String description;

    /**
     * 发行总数，不是总值，而是奖券的总张数
     */
    @FormParam("totalCount")
    @Min(1)
    private int totalCount;

    /**
     * 票面价值.
     *
     * 对于现金券，表示其兑换现金的额度.<br/>
     *
     * 对于增值券，表示其可以虚拟的本金量.<br/>
     *
     * 对于加息券，表示其提高利息的基点数（万分之一，参考rate）.<br/>
     *
     * 对于返现券，表示满足投资要求后平台直接返现的金额.
     */
    @FormParam("parValue")
    @Min(0)
    private int parValue;

    /**
     * 发行人.
     *
     * 一般是平台直接发行，也可以支持企业甚至个人直接发行.
     *
     * 奖券的兑换由发行人账户兑现
     *
     */
    @NotNull
    private RealmEntity issuer;

    /**
     * 发行时间
     */
    @NotNull
    private Date timeIssued;

    /**
     * 生效时间.
     *
     * 生效时间后才可以进行兑换等操作
     *
     * null表示即时生效
     */
    @FormParam(value = "timeStart")
    private Date timeStart;

    /**
     * 过期时间，该批次的所有奖券都有同样的过期时间.
     *
     * null表示永不过期
     */
    @FormParam(value = "timeExpire")
    private Date timeExpire;

    /**
     * 最小投资门槛，当奖券与投资挂钩时要求的最小有效投资额.
     *
     * 如果用户绑定的Invest金额不足时无法使用该奖券
     */
    @FormParam("minimumInvest")
    @Min(0)
    private int minimumInvest;

    /**
     * 最短投资时间，月数，含.
     * 
     * 用户绑定的Invest对应的duration不足该月数时无法使用该奖券
     * 即redeem需要满足 duration.getTotalMonths >= minimumDuration
     * 0表示没有限制
     */
    @FormParam("minimumDuration")
    @Min(0)
    private int minimumDuration;
    
    /**
     * 最长投资时间，月数，含.
     * 
     * 用户绑定的Invest对应的duration超过该月数时无法使用该奖券
     * 即redeem需要满足 duration.getTotalMonths <= minimumDuration
     * 0表示没有限制
     */
    @FormParam("maximumDuration")
    @Min(0)
    private int maximumDuration;
    
    /**
     * 根据minimumDuration以及maximumDuration生成的友好的期限表示字符串
     * 
     * @return 
     */
    public String getDurationRule() {
        if (maximumDuration == 0) {
            if (minimumDuration == 0) {
                return "无限制";
            } else {
                return "最短" + minimumDuration + "个月";
            }
        } else {
            if (minimumDuration == 0) {
                return "最长" + maximumDuration + "个月";
            } else {
                return minimumDuration + "到" + maximumDuration + "个月";
            }
        }
    }
}
