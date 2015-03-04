/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

/**
 * 每日基金产品(基金行情信息)查询接口
 * 
 * 此接口用于查询基金行情信息，
 * 
 * 如基金代码、基金名称、基金状态、基金净值、累计净值、近来基金涨幅等信息查询。
 * 该基金行情信息每天只会变化一次，电商每天定时查询一次或几次保存起来，供电商界面展示
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class QueryFundProductRequest extends BaseRequest {

    /**
     * 基金代码
     * 
     * 如果不传，表示查询所有基金
     */
    private String fundcode;
    
    
}
