/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion;

import com.creditcloud.model.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金交易申请记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class FundTradingRequestRecord extends BaseObject {

    /**
     * 申请单编号
     */
    private String appsheetserialno;
    
    /**
     * 交易申请日期(YYYYMMDD)
     */
    private String transactiondate;
    
    /**
     * 业务代码(同上)
     */
    private String businesscode;
    
    /**
     * 业务名称
     */
    private String businessname;
    
    /**
     * 基金代码
     */
    private String fundcode;
    
    /**
     * 基金名称
     */
    private String fundname;
    
    /**
     * 申请金额(元)
     */
    private String applicationamount;
    
    /**
     * 申请份额
     */
    private String applicationvol;
    
    /**
     * 处理状态
     * 
     * 00：待复核
     * 01：待勾兑
     * 02：待确认
     * 04：撤销
     * 05：撤销
     * 06：待确认
     * 07：待确认
     * 08：已确认
     */
    private String status;
    
    /**
     * 支付状态
     * 00,未支付
     * 01,处理中
     * 02,支付成功
     * 03,支付失败
     */
    private String paystatus;
    
    /**
     * 银行卡号
     */
    private String depositacct;
    
    /**
     * 支付渠道代码
     */
    private String channelid;
    
    /**
     * 操作日期
     */
    private String operdate;
    
    /**
     * 操作时间
     */
    private String opertime;
}
