/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.coupon.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.UUID;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 奖券的分配和使用信息
 *
 * 代表某一张具体的奖券德分配信息，属于何人、处于何种状态等.
 *
 * @author sobranie
 */
@Data
public abstract class CouponPlacement extends BaseObject {

    @UUID
    @NotNull
    private String id;

    /**
     * 所属的package
     */
    @NotNull
    private CouponPackage couponPackage;

    /**
     * 状态
     */
    @NotNull
    private CouponStatus status;

    /**
     * 持有人，一般为某特定User
     */
    private RealmEntity owner;
    
    /**
     * 关联主体.
     * 
     * 加息券一般为 Realm.Invest, Invest.id
     */
    private RealmEntity subject;

    /**
     * 现金券分配给持有人的时间
     */
    private Date timePlaced;

    /**
     * 兑换成现金的时间
     */
    private Date timeRedeemed;

}
