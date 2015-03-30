/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 基金申购响应结果
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true)
public class TradeBuyFundResponse extends BaseResponse {

    /**
     * 申请单编号
     */
    private String appsheetserialno;
    
    /**
     * 交易日期 YYYYDDMM
     */
    private String transactiondate;
    
    /**
     * 银行返回代码
     */
    private String bankretcode;
    
    /**
     * 银行返回信息
     */
    private String bankretmsg;
    
}
