/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 产品周期
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WealthProductSchedule extends BaseObject {
    
    private static final long serialVersionUID = 20150428L;
    
    /**
     * 认购开始时间
     */
    private Date timeSubscribeStart;
    
    /**
     * 认购结束时间 (预约结束时间)
     * 
     * @return
     */
    private Date timeSubscribeEnd;

    /**
     * 成立时间
     * 
     * @return
     */
    private Date timeEstablish;
    
    /**
     * 兑付时间
     * 
     * @return
     */
    private Date timePayment;
    
    /**
     * 结束时间
     * 
     * @return
     */
    private Date timeCleared;
}
