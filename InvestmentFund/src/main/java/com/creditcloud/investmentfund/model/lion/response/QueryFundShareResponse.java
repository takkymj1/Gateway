/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import com.creditcloud.investmentfund.model.lion.FundInvest;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户持有份额查询
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class QueryFundShareResponse extends BaseResponse {

    private List<FundInvest> resultlist;
    
}
