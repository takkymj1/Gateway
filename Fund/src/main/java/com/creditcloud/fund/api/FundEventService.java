package com.creditcloud.fund.api;

import com.creditcloud.fund.model.EventPrize;
import com.creditcloud.fund.model.FundEvent;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * Created with IntelliJ IDEA. User: meichao Date: 2015/3/26 Time: 15:23 Desc:
 * To change this template use File | Settings | File Templates.
 */
@Remote
public interface FundEventService {

    /**
     * 活动当前状态
     *
     * @return 若活动有效，返回"ok" 否则，返回提示信息
     */
    String eventActiveStatus(String eventId);

    String eventActiveStatus(FundEvent event);

    /**
     * 根据id获取FundEvent
     *
     * @param id
     * @return
     */
    FundEvent getFundEvent(String id);

    PagedResult<EventPrize> listPrizeByEventNo(String eventNo);

    EventPrize findPrizeByEventNoAndPrizeNo(String eventNo, String prizeNo);

    EventPrize getDefaultPrize(String eventNo);

    boolean reducePrizeInventory(String id);
}
