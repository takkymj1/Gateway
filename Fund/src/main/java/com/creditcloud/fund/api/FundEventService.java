package com.creditcloud.fund.api;

import java.util.Date;
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
     * 活动是否有效
     * @param eventId
     * @return
     */
    boolean isInActive(String eventId);
    
    boolean isInActive(String eventId, Date date);
}
