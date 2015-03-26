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
 * 查询费率 <br>
 * 
 * 此接口用于客户在申购时查询申购费率 <br>
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class QueryFundFeeRateRequest extends BaseRequest {

    /**
     * 身份证号
     */
    private String certificateno;
    
    /**
     * 证件号类型
     */
    private String certificatetype;
    /**
     * 收费方式
     * 
     * A:前收费
     * B:后收费
     */
    private String sharetype;
    
    /**
     * 支付渠道代码
     */
    private String channelid;
    
    /**
     * 基金登记TA代码
     */
    private String tano;
    
    /**
     * 业务名称
     * 空值表示 全部 
     */
    private String businesscode;
    
    /**
     * 申请份额
     */
    private String applicationvol;
    
    /**
     * 申请金额
     */
    private String applicationamount;
    
    /**
     * 基金代码
     */
    private String fundcode;
    
    public QueryFundFeeRateRequest(String merid, 
            String certificateno,
            String shareType,
            String channelid,
            String tano,
            String businesscode,
            String applicationvol,
            String applicationamount,
            String fundcode) {
        super(Attribute.getfundfeerate, merid);
        this.certificateno = certificateno;
        this.certificatetype = "0";
        this.sharetype = shareType;
        this.channelid = channelid;
        this.tano = tano;
        this.businesscode = businesscode;
        this.applicationvol = applicationvol;
        this.applicationamount = applicationamount;
        this.fundcode = fundcode;
    }
}
