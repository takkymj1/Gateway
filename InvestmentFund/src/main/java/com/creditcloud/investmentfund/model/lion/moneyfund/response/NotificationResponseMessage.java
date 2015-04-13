/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.moneyfund.response;

import com.creditcloud.investmentfund.api.utils.StringUtils;
import com.creditcloud.investmentfund.constant.FundInterfaceConstants;
import com.creditcloud.model.BaseObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * 诺安货币基金通用结果通知接口响应报文<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NotificationResponseMessage extends BaseObject {

    private String tradeacco;//	诺安交易账户	char(32)	R	
    private String applicationNo;//	申请单编号	char (32)	R	原申请单编号
    private String status;//	通知结果处理状态	char(1)	R	0．成功，1.失败，告知诺安通知结果是否被正确处理，如果返回失败或者网络异常，诺安最多通知10次，电商平台需支持多次通知的等幂处理。
    private String errorCode;//	错误代码	char (4)	R	成功返回0000，失败返回其他
    private String errorMessage;//错误描述	char (256)	O	
    private String sign;//	签名	char(500)	R	

    public Map<String, String> toMap() {
        Map<String, String> parameters = new HashMap<>();

        parameters.put("tradeacco", StringUtils.nonNull(tradeacco));
        parameters.put("applicationNo", StringUtils.nonNull(applicationNo));
        parameters.put("status", StringUtils.nonNull(status));
        parameters.put("errorCode", StringUtils.nonNull(errorCode));
        parameters.put("errorMessage", StringUtils.nonNull(errorMessage));
        parameters.put("sign", StringUtils.nonNull(sign));

        return parameters;
    }

    /**
     * 自动设置 status,errorCode为 0，0000
     */
    public void markAsSuccess() {
        final String ERROR_CODE_SUCCESS = "0000";
        setErrorCode(ERROR_CODE_SUCCESS);

        final String STATUS_SUCCESS = "0";
        setStatus(STATUS_SUCCESS);
    }

    /**
     * 转换成可以直接传输的XML报文格式
     *
     * @return
     * @throws JsonProcessingException
     * @throws org.dom4j.DocumentException
     */
    public String toXMLMessage() throws JsonProcessingException, DocumentException {
        final String rootXMLNodeName = "Message";
        ObjectMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this);
        Document doc = DocumentHelper.parseText(xml);
        Element root = doc.getRootElement();
        root.setName(rootXMLNodeName);
        doc.setXMLEncoding(FundInterfaceConstants.LION_MONEY_FUND_HTTP_ENCODING);
        xml = doc.asXML();
        return xml;
    }
}
