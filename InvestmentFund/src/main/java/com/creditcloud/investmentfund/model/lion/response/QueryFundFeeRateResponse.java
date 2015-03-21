/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询费率返回结果
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class QueryFundFeeRateResponse extends BaseResponse {

    /**
     * 折扣
     */
    private String discount;
    
    /**
     * 费率
     */
    private String benchmarkrates;
}
