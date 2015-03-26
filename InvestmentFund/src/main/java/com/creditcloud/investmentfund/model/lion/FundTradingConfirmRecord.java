/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion;

import com.creditcloud.model.BaseObject;

/**
 * 基金交易确认记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class FundTradingConfirmRecord extends BaseObject {

    /**
     * 申请日期(YYYYMMDD)
     */
    private String transactiondate;
    
    /**
     * 基金代码
     */
    private String fundcode;
    
    /**
     * 基金名称
     */
    private String fundname;
    
    /**
     * 业务类型 同入参
     */
    private String businesscode;
    
    /**
     * 确认金额
     */
    private String confirmedamount;
    
    /**
     * 确认份额
     */
    private String confirmedvol;
    
    /**
     * 确认日期(YYYYMMDD)
     */
    private String transactioncfmdate;
    
    /**
     * 确认结果
     * 1：成功
     * 2：失败
     */
    private String returncode;
    
    /**
     * 失败原因
     */
    private String returnmsg;
    
}
