/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion;

import com.creditcloud.model.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class FundInvest extends BaseObject {

    /**
     * 基金代码
     */
    private String fundcode;
    
    /**
     * 基金名称
     */
    private String fundname;
    
    /**
     * 基金类型
     * 0,股票型基金;
     * 1,债券型基金;
     * 2,货币型基金;
     * 3,混合型基金;
     * 4,专户基金;
     * 5,指数型基金;
     * 6,QDII基金;
     */
    private String fundtype;
    
    /**
     * 基金状态
     * 0, 交易             
     * 1, 发行
     * 2, 发行成功         
     * 3, 发行失败
     * 4, 基金停止交易     
     * 5, 停止申购
     * 6, 停止赎回         
     * 7, 权益登记
     * 8, 红利发放         
     * 9, 基金封闭
     * a, 基金终止
     */
    private String fundstatus;
    
    /**
     * 拥有该基金份额(元)
     */
    private String share;
    
    /**
     * 拥有该基金可用份额(元)
     */
    private String availableshare;
    
    /**
     * 该基金冻结份额
     */
    private String frozenshare;
    
    /**
     * 基金账号
     */
    private String taaccountid;
    
    /**
     * 交易账号
     */
    private String transactionaccountid;
    
    /**
     * 网点号
     */
    private String channelid;
    
    /**
     * 银行名称
     */
    private String channelname;
    
    /**
     * 银行卡号
     */
    private String depositacct;
    
    /**
     * 基金分支代码
     */
    private String branchcode;
    
    /**
     * 分红方式
     * 0：红利再投
     * 1：现金分红
     */
    private String defdividendmethod;
    
    
}
