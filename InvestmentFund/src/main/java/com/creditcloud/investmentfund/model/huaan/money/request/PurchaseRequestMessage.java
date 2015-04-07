/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.request;

/**
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
public class PurchaseRequestMessage extends CommonRequestMessage {

    private String MerchantId;//	8位	商家ID	是
    private String MerchantDate;//	8位	商户日期	是
    private String TotalAmt;//18位	申购金额（单位：圆）	是
    private String TradeAppendInfo;//	20位	交易附加信息	否
    private String AssignBuyer;//	12位	客户协议号	是
    private String AssbuyerName;//	120位	客户姓名	是
    private String AssbuyerIdTp;//	1位	客户证件类型(0为身份证)	是
    private String AssbuyerIdNo;//	32位	客户证件号码	是
    private String Fee = "0";//	18位	手续费(此处填0)	否
    private String CommonReturn;//	200位	公共回传字段	否
    private String RetURL;//	100位	返回地址	是
    private String Memo;//	120位	定单描述	否

}
