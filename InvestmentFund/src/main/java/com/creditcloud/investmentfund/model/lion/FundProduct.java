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
 * 基金产品
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class FundProduct extends BaseObject {
    
    /**
     * 基金名称
     */
    private String fundname;
    
    /**
     * 基金代码
     */
    private String fundcode;
    
    /**
     * 风险等级
     */
    private String risklevel;
    
    /**
     * 净值日期
     */
    private String navdate;
    
    /**
     * 最新净值
     */
    private String nav;
    
    /**
     * 累计净值
     */
    private String totalnav;
    
    /**
     * 近一个月涨幅
     */
    private String onemonthrate;
    
    /**
     * 近三个月涨幅
     */
    private String threemonthrate;
    
    /**
     * 今年以来涨幅
     */
    private String oneyearrate;
    
    /**
     * 基金状态
     * 0, 交易             
     * 1, 发行
     * 2, 发行成功         
     * 3, 发行失败
     * 4, 基金停止交易     
     * 5, 停止申购
     * 6, 停止赎回         
     * 7, 权益登记
     * 8, 红利发放         
     * 9, 基金封闭
     * a, 基金终止
     */
    private String status;
    
    /**
     * 基金类型
     * 0,股票型基金;
     * 1,债券型基金;
     * 2,货币型基金;
     * 3,混合型基金;
     * 4,专户基金;
     * 5,指数型基金;
     * 6,QDII基金;
     */
    private String fundtype;
    
    /**
     * 收费方式
     * A:前收费
     * B:后收费
     */
    private String sharetype;
    
    /**
     * 基金登记TA代码
     */
    private String tano;
    
    /**
     * 首次认购最低金额
     */
    private String first_per_min_20;
    
    /**
     * 首次申购最低金额
     */
    private String first_per_min_22;
    
    /**
     * 定投最低金额
     */
    private String per_min_39;
    
    /**
     * 最低赎回份额
     */
    private String per_min_24;
    
    /**
     * 最低基金转换份额
     */
    private String per_min_36;
    
    
}
