/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 交易确认查询
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class QueryTradeConfirmRecordRequest extends BaseRequest {

    /**
     * 开始日期(YYYYMMDD)
     */
    private String begindate;
    
    /**
     * 结束日期(YYYYMMDD)
     */
    private String enddate;
    
    /**
     * 证件号码
     */
    private String certificateno;
    
    /**
     * 证件类型（0为身份证，暂时只支持身份证）
     */
    private String certificatetype;
    
    /**
     * 业务名称
     */
    private String businesscode;
    
    /**
     * 确认结果
     * 1：成功
     * 2：失败
     */
    private String returncode;
    
    /**
     * 基金代码
     * 空值表示 全部
     */
    private String fundcode;
    
    public QueryTradeConfirmRecordRequest(String merid,
            String certificateno, 
            String fundcode,
            String businesscode,
            String returncode,
            String begindate,
            String enddate) {
        super(Attribute.gethiscontrades, merid);
        this.certificateno = certificateno;
        this.certificatetype = "0";
        this.fundcode = fundcode;
        this.returncode = returncode;
        this.businesscode = businesscode;
        this.begindate = begindate;
        this.enddate = enddate;
    }
}
