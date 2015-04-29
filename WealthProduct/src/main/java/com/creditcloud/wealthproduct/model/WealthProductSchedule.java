/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 产品周期
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class WealthProductSchedule extends BaseObject {
    
    private static final long serialVersionUID = 20150428L;
    
    /**
     * 预约成立时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date appointEstablishedime;
    
    /**
     * 预约开始时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date appointStartTime;

    /**
     * 预约结束时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date appointEndTime;

    /**
     * 认购开始时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date subscribeStartTime;
    
    /**
     * 认购结束时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date subscribeEndTime;

    /**
     * 计息日
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date valueStartTime;
}
