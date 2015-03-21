/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.enums;


/**
 * 指令集
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum Attribute {

    /**
     * 基金产品查询
     */
    getfundinfo,
    
    /**
     * 基金开户
     */
    openacct,
    
    /**
     * 客户持有份额查询
     */
    getshare,
    
    /**
     * 基金买入
     */
    buy,
    
    /**
     * 交易申请查询
     */
    gethisapps,
    
    /**
     * 查询历史交易确认信息
     */
    gethiscontrades,
    
    /**
     * 查询历史分红收益信息
     */
    gethisincome,
    
    /**
     * 银行增卡
     */
    addbanksend,
    
    /**
     * 风险承受能力再次评测
     */
    doriskpaper,
    /**
     * 赎回
     */
    sell,
    
    /**
     * 查询费率
     */
    tradecancel;
    
    private Attribute() {}

}
