/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户收益记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserIncomeRecord extends FundObject {

    /**
     * 用户ID
     */
    private String userId;
    
    /**
     * 净值当天用户所有基金收益合
     */
    private BigDecimal totalIncome;
    
    /**
     * 净值日期
     */
    private Date navDate;
    
}
