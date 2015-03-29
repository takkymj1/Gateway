/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import lombok.Data;


/**
 * 基金开户
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
public class UserRegisterRequest extends BaseRequest {

    /**
     * 手机号码
     */
    private String mobileno;
    
    /**
     * 证件号码
     */
    private String certificateno;
    
    /**
     * 证件类型
     */
    private String certificatetype;
    
    /**
     * 投资人姓名
     */
    private String depositname;
 
    /**
     * 银行网点名称
     */
    private String channelname;
    
    /**
     * 银行网点号(支付渠道代码)
     */
    private String channelid;
    
    /**
     * 银行卡号
     */
    private String depositacct;
    
    /**
     * 银行账户所在省份
     */
    private String depositprov;
    
    /**
     * 银行账户所在城市
     */
    private String depositcity;
    
    /**
     * 是否需要去银行鉴权
     * 
     * 1：需要
     * 0：不需要
     */
    private String needidentify;
    
    /**
     * 风险测评选项对应分数列表
     */
    private String pointlist;
    
    /**
     * 风险承受能力答案列表
     */
    private String answerlist;
    
    public UserRegisterRequest(
            String merid,
            String name, 
            String idNumber, 
            String mobile, 
            String channelName, 
            String channelid, 
            String bankAccount,
            String depositprov, 
            String depositcity, 
            String pointlist,
            String answerlist) {
        super(Attribute.openacct, merid);
        this.depositname = name;
        this.certificateno = idNumber;
        this.certificatetype = "0";
        this.channelname = channelName;
        this.channelid = channelid;
        this.depositacct = bankAccount;
        this.depositprov = depositprov;
        this.depositcity = depositcity;
        this.pointlist = pointlist;
        this.answerlist = answerlist;
        this.mobileno = mobile;
        this.needidentify = "0";
    }
}
