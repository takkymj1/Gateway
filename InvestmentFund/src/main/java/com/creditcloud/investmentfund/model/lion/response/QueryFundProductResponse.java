/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import com.creditcloud.investmentfund.model.lion.FundProduct;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金产品查询返回结果
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class QueryFundProductResponse extends BaseResponse {

    /**
     * 结果集
     */
    private List<FundProduct> resultlist;
    
}
