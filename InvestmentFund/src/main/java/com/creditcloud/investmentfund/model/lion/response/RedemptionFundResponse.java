/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金赎回响应
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class RedemptionFundResponse extends BaseResponse {

    /**
     * 申请单编号
     */
    private String appsheetserialno;
    
    /**
     * 申请日期 YYYYDDMM
     */
    private String transactiondate;
    
}
