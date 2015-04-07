/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.response;

/**
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
public class DailyTransRecordsDownloadResponseMessage extends CommonResponseMessage {

    private String MerchantId;//	8位	商家ID
    private String AllPageNo;//	10位	总页数
    private String CurPageNo;//	10位	当前页码
    private String AllCount;//	18位	总笔数
    private String TotalAmt;//	18位	总金额（单位：圆）
    private String Content;//		对账单内容，详细内容见备注说明
    private String RetCode;//	4位	查询结果
    private String RetMsg;//	200位	返回信息

}
