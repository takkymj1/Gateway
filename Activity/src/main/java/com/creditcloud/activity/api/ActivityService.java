/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.activity.api;

import com.creditcloud.activity.Activity;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
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
     * @return
     */
    PagedResult<Activity> listByTarget(String clientCode, RealmEntity target, PageInfo pageInfo);

    /**
     * 按活动发起者列出活动
     *
     * @param clientCode
     * @param performer
     * @return
     */
    PagedResult<Activity> listByPerformer(String clientCode, RealmEntity performer, PageInfo pageInfo);
}
