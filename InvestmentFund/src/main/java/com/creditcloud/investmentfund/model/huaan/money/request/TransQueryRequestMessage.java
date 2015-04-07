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
public class TransQueryRequestMessage extends CommonRequestMessage {

    private String MerchantId;//	8位	商家ID	是
    private String MerchantDate;//	8位	商户日期	是
    private String OrgMerchantDate;//	8位	原定单商户日期	是
    private String OrgOrderNO;//	24位	原定单号	是
    private String OrgTxCode;//	4位	原交易类型	是
    private String CommonReturn;//	200位	公共回传字段	否
    private String RetURL;//	100位	返回地址	是
    private String Memo;//	120位	定单描述	否

}
