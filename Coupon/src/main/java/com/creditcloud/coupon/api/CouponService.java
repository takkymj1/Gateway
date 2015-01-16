/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.coupon.api;

import com.creditcloud.coupon.model.CouponPackage;
import com.creditcloud.coupon.model.CouponPlacement;
import com.creditcloud.model.misc.RealmEntity;
import javax.ejb.Remote;

/**
 * 奖券相关服务接口
 *
 * @author sobranie
 */
@Remote
public interface CouponService extends CouponQueryService {

    /**
     * 发行一批优惠券.
     * 
     * 保存coupon package到数据库
     * 
     * @param couponPackage
     * @return 是否成功发行并登记
     */
    public boolean issueCouponPackage(CouponPackage couponPackage);
    
    /**
     * 分配某个package中的一个具体奖券给owner.
     * 
     * 比如分配某张现金券給特定个人在未来使用
     * 
     * @param packageId
     * @param owner
     * @return 分配对象，null表示没有成功
     */
    public CouponPlacement placeCoupon (String packageId, RealmEntity owner);
    
    /**
     * 兑现现金券.
     * 
     * 对应的CouponPlacement状态改为USED
     * 
     * @param placementId CouponPlacement.id
     * @return 是否成功提交兑现申请
     */
    public boolean redeem (String placementId);
    
    /**
     * 使用加息券增加某笔投资的收益.
     * 
     * 对应的CouponPlacement状态改为USED
     * 
     * @param placementId
     * @param investId
     * @return 是否成功使用
     */
    public boolean redeem (String placementId, String investId);
    
    /**
     * 审核人员接受并通过该张加息券兑现请求
     * 
     * @param placementId
     * @return 
     */
    public boolean approveRedeem(String placementId);
    
    /**
     * 驳回某张奖券的redeem请求
     * 
     * @param placementId
     * @return 
     */
    public boolean rejectRedeem(String placementId);
}
