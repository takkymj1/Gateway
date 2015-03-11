/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import lombok.Data;

/**
 * 基金交易申请查询
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
public class QueryTradeRecordRequest extends BaseRequest {

    /**
     * 证件号码
     */
    private String certificateno;
    
    /**
     * 证件类型（0为身份证，暂时只支持身份证）
     */
    private String certificatetype;
    
    /**
     * 开始日期(YYYYMMDD)
     */
    private String begindate;
    
    /**
     * 结束日期(YYYYMMDD)
     */
    private String enddate;
    
    /**
     * 业务名称
     * 空值表示 全部 
     * 20,认购   
     * 22, 申购   
     * 24, 赎回   
     * 98, 快速赎回      
     * 36, 基金转换   
     * 26, 转托管    
     * 27, 转托管转入    
     * 28, 转托管转出   
     * 29, 设置分红方式   
     * 39, 定期定额申购   
     * 59, 定投协议开通  
     * 60, 定投协议撤销   
     * 69, 定赎、定转协议开通
     * 70, 定赎、定转协议撤销
     */
    private String businesscode;
    
    /**
     * 处理状态
     * 空值表示 全部
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
     * 基金代码
     * 空值表示 全部
     */
    private String fundcode;
    
    /**
     * 申请单编号
     */
    private String appsheetserialno;
    
    public QueryTradeRecordRequest(String merid, 
            String certificateno, 
            String businesscode, 
            String status, 
            String fundcode,
            String appsheetserialno,
            String begindate, String enddate) {
        super(Attribute.gethisapps, merid);
        this.certificateno = certificateno;
        this.certificatetype = "0";
        this.businesscode = businesscode;
        this.status = status;
        this.fundcode = fundcode;
        this.appsheetserialno = appsheetserialno;
        
        this.begindate = begindate;
        this.enddate = enddate;
    }
}
