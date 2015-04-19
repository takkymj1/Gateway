/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.coupon.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.UUID;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 奖券的分配和使用信息
 *
 * 代表某一张具体的奖券的分配信息，属于何人、处于何种状态等.
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class CouponPlacement extends BaseObject {
    
    private static final long serialVersionUID = 20150117L;

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
     * 加息券及增值券一般为 Realm.Invest, Invest.id
     */
    private RealmEntity subject;

    /**
     * 奖券分配给持有人的时间
     */
    private Date timePlaced;

    /**
     * 兑换成现金的时间
     */
    private Date timeRedeemed;
    
    /**
     * 最终实际兑换成现金的金额
     */
    @Min(0)
    private BigDecimal actualAmount;
    
    /**
     * 保存附加信息：如相关联的借款标ID
     */
    private String priv;
    
    public CouponPlacement(String id,
                           CouponPackage couponPackage,
                           CouponStatus status,
                           RealmEntity owner,
                           RealmEntity subject,
                           Date timePlaced,
                           Date timeRedeemed,
                           BigDecimal actualAmount) {
        this.id = id;
        this.couponPackage = couponPackage;
        this.owner = owner;
        this.status = status;
        this.subject = subject;
        this.timePlaced = timePlaced;
        this.timeRedeemed = timeRedeemed;
        this.actualAmount = actualAmount;
    }
}
