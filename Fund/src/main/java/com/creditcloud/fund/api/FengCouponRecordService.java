package com.creditcloud.fund.api;

import com.creditcloud.fund.model.CouponRecord;
import com.creditcloud.fund.model.enums.CouponStatus;
import com.creditcloud.fund.model.enums.CouponType;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.Channel;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;

import javax.ejb.Remote;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/3/23
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
@Remote
public interface FengCouponRecordService {



    /**
     * 添加红包
     * @param userId 用户ID
     * @param activeId 活动Id
     * @param signTime 注册日期
     * @param source 来源
     * @param channel 来源
     * @return
     */
    public boolean addNew(String userId,
                                   String activeId,
                                   Date signTime,
                                   Source source,
                                   Channel channel);

    /**
     * 券（红包）列表
     * @param userId 用户ID
     * @param info 分页
     * @param statusList CouponStatus
     * @return
     */
    PagedResult<CouponRecord> listByStatus(String userId,PageInfo info,List<CouponStatus> statusList);

    /**
     * 根据用户ID，券类型查找券列表
     * @param userId
     * @param couponType
     * @return
     */
    List<CouponRecord> getCouponRecordByCouponType(String userId,CouponType couponType);


    /**
     * 绑定标的ID及更新状态
     * @param id
     * @param status
     * @param oldStatus
     * @param entity
     * @return
     */
    boolean updateCouponStatusByEntity(String id,CouponStatus status,CouponStatus oldStatus, RealmEntity entity);


    /**
     * 更新状态
     * @param id
     * @param status
     * @param oldStatus
     * @return
     */
    boolean updateCouponStatus(String id,CouponStatus status,CouponStatus oldStatus);

    /**
     * 预热期间 新添红包
     * @param userId
     * @param activeId
     * @param signTime
     * @param source
     * @param channel
     * @return
     */
    boolean insertPreNew(String userId, String activeId, Date signTime,Source source,Channel channel);
}
