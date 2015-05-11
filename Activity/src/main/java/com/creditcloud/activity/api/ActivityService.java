/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.activity.api;

import com.creditcloud.activity.Activity;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface ActivityService {

    /**
     *
     * @param clientCode
     * @param activity
     */
    void addActivity(String clientCode, Activity activity);

    /**
     *
     * @param clientCode
     * @param activityId
     * @return
     */
    Activity getById(String clientCode, String activityId);

    /**
     * 按照活动关联对象列出活动
     *
     * @param clientCode
     * @param target
     * @param pageInfo
     * @return
     */
    PagedResult<Activity> listByTarget(String clientCode, RealmEntity target, PageInfo pageInfo);

    /**
     * 按活动发起者列出活动
     *
     * @param clientCode
     * @param performer
     * @param pageInfo
     * @return
     */
    PagedResult<Activity> listByPerformer(String clientCode, RealmEntity performer, PageInfo pageInfo);
    
    /**
     * 按活动发起者列出活动，限定日期时间范围
     *
     * @param clientCode
     * @param performer
     * @param timeBegin 开始时间（包含）
     * @param timeEnd 结束时间（不包含
     * @return
     */
    List<Activity> listByPerformer(String clientCode, RealmEntity performer, Date timeBegin, Date timeEnd);
}
