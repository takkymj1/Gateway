/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.utils.StringUtils;
import com.creditcloud.model.BaseObject;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 诺安货币基金通用结果通知接口请求报文<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author GuohuaZhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NotificationRequestMessage extends BaseObject {

    private String version;//	版本号	char(7)	R	目前版本号：2.0
    private String instId;//	机构标识	char(10)	R	报文发送方的机构标识。
    private String certId;//	数字证书标识	char(16)	R	基金公司端证书标识码，对报文进行签名的数字证书标识.
    private String tradeacco;//诺安交易账户	char(32)	R	
    private String applicationNo;//申请单编号	char (32)	R	原申请单编号
    private String naApplicationNo;//诺安交易申请流水号	char(24)	C	基金公司业务流水号，同一销售机构不能重复；交易失败时为空；
    private String transName;//业务类型	Char(10)	R	
    private String status;//交易处理状态	char(1)	R	0．成功，1.失败
    private String applicationAmount;//	申请金额	Number(16)	O	两位小数
    private String applicationVol;//	申请赎回份额	Number(16)	O	两位小数
    private String isQuickRedeem;//	是否是快速赎回	char(1)	R	1-	是，0-否
    private String transactionDate;//交易所属日期	char(8)	C	基金的交易日期 格式为：YYYYMMDD 非撤销交易不可为空。 国庆前一天晚上发生的交易，其交易所属日期是国庆后第一个交易日
    private String confirmWorkDay;//	确认工作日	char(10)	C	预计确认工作日yyyyMMdd
    private String transactionTime;//交易发生时间	Number(14)	O	格式为：YyyyMMdd HH:mm:ss
    private String errorCode;//错误代码	char (4)	R	此处非交易返回码，根据具体业务返回。
    private String errorMessage;//错误描述	char (256)	R	
    private String sign;//签名	char(500)	R	
    private String extension;//	消息扩展		O	

    public Map<String, String> toMap() {
        Map<String, String> parameters = new HashMap<>();

        parameters.put("version", StringUtils.nonNull(version));
        parameters.put("instId", StringUtils.nonNull(instId));
        parameters.put("certId", StringUtils.nonNull(certId));
        parameters.put("tradeacco", StringUtils.nonNull(tradeacco));
        parameters.put("applicationNo", StringUtils.nonNull(applicationNo));
        parameters.put("naApplicationNo", StringUtils.nonNull(naApplicationNo));
        parameters.put("transName", StringUtils.nonNull(transName));
        parameters.put("status", StringUtils.nonNull(status));
        parameters.put("applicationAmount", StringUtils.nonNull(applicationAmount));
        parameters.put("applicationVol", StringUtils.nonNull(applicationVol));
        parameters.put("isQuickRedeem", StringUtils.nonNull(isQuickRedeem));
        parameters.put("transactionDate", StringUtils.nonNull(transactionDate));
        parameters.put("confirmWorkDay", StringUtils.nonNull(confirmWorkDay));
        parameters.put("transactionTime", StringUtils.nonNull(transactionTime));
        parameters.put("errorCode", StringUtils.nonNull(errorCode));
        parameters.put("errorMessage", StringUtils.nonNull(errorMessage));
        parameters.put("sign", StringUtils.nonNull(sign));
        parameters.put("extension", StringUtils.nonNull(extension));

        return parameters;
    }
}
