package com.creditcloud.fund.api;

import com.creditcloud.fund.model.CouponRecord;
import com.creditcloud.fund.model.enums.CouponStatus;
import com.creditcloud.fund.model.enums.CouponType;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import java.util.List;
import javax.ejb.Remote;

/**
 * Created with IntelliJ IDEA. User: meichao Date: 2015/3/23 Time: 16:01 To
 * change this template use File | Settings | File Templates.
 */
@Remote
public interface FengCouponRecordService {

    CouponRecord saveCoupon(CouponRecord coupon);
    
    /**
     * 券（红包）列表
     *
     * @param userId 用户ID
     * @param info 分页
     * @param statusList CouponStatus
     * @return
     */
    PagedResult<CouponRecord> listByStatus(String userId, PageInfo info, List<CouponStatus> statusList);

    /**
     * 根据用户ID，券类型查找券列表
     *
     * @param userId
     * @param couponType
     * @return
     */
    List<CouponRecord> getCouponRecordByCouponType(String userId, CouponType couponType);

    /**
     * 绑定标的ID及更新状态
     *
     * @param id
     * @param status
     * @param oldStatus
     * @param entity
     * @return
     */
    boolean updateCouponStatusByEntity(String id, CouponStatus status, CouponStatus oldStatus, RealmEntity entity);

    /**
     * 更新状态
     *
     * @param id
     * @param status
     * @param oldStatus
     * @return
     */
    boolean updateCouponStatus(String id, CouponStatus status, CouponStatus oldStatus);

    /**
     * 查询用户参加活动获取的红包数量
     *
     * @param userId
     * @param eventId
     * @return
     */
    public int countCouponRecordByEventId(String userId, String eventId);

    /**
     * 查询用户参加活动获取的红包
     *
     * @param userId
     * @param eventId
     * @return
     */
    public List<CouponRecord> getCouponRecordByEventId(String userId, String eventId);
   
}
