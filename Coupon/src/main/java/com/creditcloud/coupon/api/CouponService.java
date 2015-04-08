/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.coupon.api;

import com.creditcloud.coupon.model.CouponPackage;
import com.creditcloud.coupon.model.CouponPlacement;
import com.creditcloud.coupon.model.CouponType;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 * 奖券相关服务接口
 *
 * @author sobranie
 */
@Remote
public interface CouponService extends CouponQueryService {

    /**
     * 发行或修改一批优惠券.
     *
     * 保存coupon package到数据库
     *
     * @param clientCode
     * @param couponPackage
     * @return 是否成功发行并登记
     */
    public boolean saveCouponPackage(String clientCode, CouponPackage couponPackage);

    /**
     * 更新优惠券
     *
     * @param clientCode
     * @param couponPlacement
     * @return
     */
    public boolean updateCouponPlacement(String clientCode, CouponPlacement couponPlacement);

    /**
     * 分配某个package中的一个具体奖券给owner.
     *
     * 比如分配某张现金券給特定个人在未来使用
     *
     * @param clientCode
     * @param packageId
     * @param owner
     * @return 分配对象，null表示没有成功
     */
    public CouponPlacement placeCoupon(String clientCode, String packageId, RealmEntity owner);
    
    /**
     * 根据Code, Type以及parValue，寻找合适的package，并将其中一张奖券分配给owner.
     * 
     * 条件是Code和type都相符合，package没有过期并且有可分配的奖券数量
     * 
     * @param clientCode
     * @param code
     * @param type
     * @param owner
     * @return null 表示没有合适的奖券包或者分配失败
     */
    public CouponPlacement placeCoupon(String clientCode, String code, CouponType type, RealmEntity owner);

    /**
     * 根据Invest的基本信息，计算使用某张奖券时将为用户带来的额外收益.
     * 
     * 会考虑使用奖券的状态、使用条件（下线投资额）等
     * 
     * @param clientCode
     * @param amount        投资金额
     * @param duration      投资期限
     * @param rate          投资收益率
     * @param method        还款方式
     * @param placementId   使用奖券的id
     * @return 
     */
    public BigDecimal calculateActualAmount(String clientCode,
                                            BigDecimal amount,
                                            Duration duration,
                                            int rate,
                                            RepaymentMethod method,
                                            String placementId);

    /**
     * 兑现现金券.
     *
     * 对应的CouponPlacement状态改为USED <br/>
     * <b>只有现金券才有效，其他类型不能兑现</b>
     *
     * @param clientCode
     * @param placementId CouponPlacement.id
     * @return 是否成功提交兑现申请
     */
    public boolean redeem(String clientCode, String placementId);

    /**
     * 使用加息券或增值券增加某笔投资的收益.
     *
     * 对应的CouponPlacement状态改为USED <br/>
     * <p/>
     * 只有加息券或增值券才适用该方法 <br/>
     * <b>如果某一笔投资已经使用了任意券则不能成功</b>
     *
     * @param clientCode
     * @param placementId
     * @param investId
     * @return 是否成功使用
     */
    public boolean redeem(String clientCode, String placementId, String investId);

    /**
     * 审核人员接受并通过该张加息券兑现请求 placed->used, 更新前状态不是placed，则返回false
     *
     * @param clientCode
     * @param placementId
     * @return
     */
    public boolean approveRedeem(String clientCode, String placementId);

    /**
     * 驳回某张奖券的redeem请求 placed->cancellled, 更新前状态不是placed，则返回false //TODO
     * 确认是否是如此变化
     *
     * @param clientCode
     * @param placementId
     * @return
     */
    public boolean rejectRedeem(String clientCode, String placementId);
    
    /**
     * 当标的流标等情况下，取消奖券使用，重置为replaced状态
     * 
     * @param clientCode
     * @param placementId
     * @return 
     */
    public boolean cancelRedeem(String clientCode, String placementId);
    
    /**
     * 取消奖券分配，用于奖券发放错误等情况
     * 
     * @param clientCode
     * @param placementId
     * @return 
     */
    public boolean cancelCouponPlace(String clientCode, String placementId);
    
    /**
     * 由前端周期性调用.
     * 
     * 检查CouponPackage状态，如果过期则设置所有CouponPlacement的状态，INITIATED和PLACED -》EXPIRED
     * 
     * @param clientCode
     * @return 被作废的奖券张数
     */
    public int expireCouponBySchedule(String clientCode);

}
