package com.creditcloud.fund.api;

import javax.ejb.Remote;
import java.util.Date;

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
     * @return
     */
    public boolean addCouponRecord(String userId,String activeId,Date signTime);

}
