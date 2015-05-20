/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion;

import com.creditcloud.model.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 分红记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class FundDividendRecord extends BaseObject {

    /**
     * 交易账号
     */
    private String transactionaccountid;
    
    /**
     * 分红发放日 (YYYYMMDD)
     */
    private String transactioncfmdate;
    
    /**
     * 基金代码
     */
    private String fundcode;
    
    /**
     * 基金名称
     */
    private String fundname;
    
    /**
     * 分红金额
     */
    private String confirmedamount;
    
    /**
     * 分红份额
     */
    private String confirmedvol;
    
    /**
     * 分红方式
     * 0：红利再投
     * 1：现金分红
     */
    private String defdividendmethod;
    
    /**
     * 每10分份额收益
     */
//    private String tendivide;
    
    /**
     * 参加分红份额
     */
//    private String totalshare;
    
    /**
     * 分红份额单位净值
     */
    private String nav;
    
}
