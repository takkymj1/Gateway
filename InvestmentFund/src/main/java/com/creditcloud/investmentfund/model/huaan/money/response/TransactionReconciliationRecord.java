/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.response;

import com.creditcloud.investmentfund.api.utils.StringUtils;
import java.util.List;
import lombok.Data;

/**
 *
 * @author guohuazhang
 */
@Data
public class TransactionReconciliationRecord {

    //平台ID|商户ID|定单日期|定单号|华安交易日|交易类型|交易金额|交易返回码|撤单状态|清算标记
    private String platformId;//	8位	平台ID
    private String MerchantId;// 商家ID
    private String MerchantDate;//8位	商户日期
    private String seqno;//	24位	云中信通讯流水号，与请求表单对应
    private String taDate;//8位	商户日期
    private String txcode;//	4位	交易类型
    private String TotalAmt;//		交易金额
    private String RetCode;// 4位	交易返回码
    private String cancellationStatus;//撤单状态(3=未撤单，9=撤单, 6=废单)
    private String clearanceFlag;//清算标记

    public static TransactionReconciliationRecord parse(String recordText) {
        final String SPLITTER = "\\|";
        final boolean trimToken = true;
        final int EXPECTED_FIELD_COUNT = 10;
        List<String> tokens = StringUtils.parseTokens(recordText, SPLITTER, trimToken);
        final int actualFieldCount = tokens.size();
        if (actualFieldCount != EXPECTED_FIELD_COUNT) {
            throw new RuntimeException("华安货币基金对账记录[" + recordText + "]格式不正确，应该有" + EXPECTED_FIELD_COUNT + "个字段，实际有" + actualFieldCount + "个字段");
        }
        TransactionReconciliationRecord record = new TransactionReconciliationRecord();
        record.platformId = tokens.get(0);
        record.MerchantId = tokens.get(1);
        record.MerchantDate = tokens.get(2);
        record.seqno = tokens.get(3);
        record.taDate = tokens.get(4);
        record.txcode = tokens.get(5);
        record.TotalAmt = tokens.get(6);
        record.RetCode = tokens.get(7);
        record.cancellationStatus = tokens.get(8);
        record.clearanceFlag = tokens.get(9);
        return record;
    }
}
