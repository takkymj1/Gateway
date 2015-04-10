package com.creditcloud.fund.api;

import javax.ejb.Remote;

/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/3/26
 * Time: 15:23
 * Desc:
 * To change this template use File | Settings | File Templates.
 */
@Remote
public interface FundEventService {

    /**
     * 是否在活动日期类
     * @param eventId
     * @return
     */
    boolean whetherInActiveDate(String eventId);
}
