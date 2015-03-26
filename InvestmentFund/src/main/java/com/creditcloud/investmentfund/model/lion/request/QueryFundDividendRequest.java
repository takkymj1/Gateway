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
 * 查询客户在一段时间范围内用户的基金的收益分红信息
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class QueryFundDividendRequest extends BaseRequest {

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
     * 基金代码
     */
    private String fundcode;
    
    public QueryFundDividendRequest(String merid, String certificateno,
            String fundcode, 
            String begindate,
            String enddate) {
        super(Attribute.gethisincome, merid);
        this.certificateno = certificateno;
        this.certificatetype = "0";
        this.fundcode = fundcode;
        this.begindate = begindate;
        this.enddate = enddate;
    }
}
