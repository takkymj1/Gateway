package com.creditcloud.chinapay.model.response;

import com.creditcloud.chinapay.ChinaPayConstant;
import com.creditcloud.chinapay.enums.SingleCutStatCode;
import com.creditcloud.chinapay.enums.SinglePayStatCode;
import java.util.List;
import java.util.Properties;

import com.creditcloud.chinapay.model.POJO;
import com.creditcloud.chinapay.utils.StringUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SingleCutPostResult extends POJO {

    protected String responseCode = "";// 应答信息 数字 定长，2位 是 请求应答码，具体请见附录6.1

    protected String merId = "";// 商户号 数字 定长，15位 否 同请求报文参数中的商户号

    protected String transDate = "";// 商户日期 数字 定长，8位 否 同请求报文参数中的商户日期

    protected String orderNo = "";// 订单号 数字 定长，16位 否 同请求报文参数中的订单号

    protected String transAmt = "";// 金额 数字 定长，12位 否 同请求报文参数中的金额

    protected String curyId = "";// 币种 数字 定长，3位 否 同请求报文参数中的币种

    protected String transType = "";// 交易类型 数字 定长，4位 否 同请求报文参数中的交易类型

    protected String priv1 = "";// 私有域 字符 变长，60位 否 同请求报文参数中的私有域

    protected String transStat = "";// 代扣状态 数字 定长，4位 是 代扣状态，具体请见附录6.1

    protected String gateId = "";// 网关号 数字 定长，4位 否 同请求报文参数中的网关号

    protected String cardType = "";// 卡折标志 数字 定长，1位 否 同请求报文参数中的卡折标志

    protected String cardNo = "";// 卡号/折号 字符 变长，25位 否 同请求报文参数中的卡号/折号

    protected String userNme = "";// 持卡人姓名 字符 变长，20位 否 同请求报文参数中的持卡人姓名

    protected String certType = "";// 证件类型 字符 定长，2位 否 同请求报文参数中的证件类型

    protected String certId = "";// 证件号 字符 变长，25位 否 同请求报文参数中的证件号码。

    protected String message = "";// 描述 字符 变长，256位 否 交易应答返回描述

    protected String chkValue = "";// 签名值 字符 定长，256位 是
    // 对返回字串的签名。返回报文中后256位字符串以前的都是作为签名的明文，明文需进行BASE64编码，具体见下方。

    public static SingleCutPostResult parse(String responseText) {
        final String PAIR_DELIMITER = "&";
        final String NAME_VALUE_DELIMITER = "=";
        final boolean trimToken = true;
        List<String> namedValues = StringUtils.parseTokens(responseText, PAIR_DELIMITER, trimToken);
        Properties prop = new Properties();
        for (String namedValue : namedValues) {
            List<String> nameAndValue = StringUtils.parseTokens(namedValue, NAME_VALUE_DELIMITER, trimToken);
            String name = nameAndValue.get(0);
            String value = nameAndValue.size() >= 2 ? nameAndValue.get(1) : "";
            prop.put(name, value);
        }

        SingleCutPostResult result = new SingleCutPostResult();
        result.responseCode = prop.getProperty("responseCode", "");
        result.merId = prop.getProperty("merId", "");
        result.transDate = prop.getProperty("transDate", "");
        result.orderNo = prop.getProperty("orderNo", "");
        result.transAmt = prop.getProperty("transAmt", "");
        result.curyId = prop.getProperty("curyId", "");
        result.transType = prop.getProperty("transType", "");
        result.priv1 = StringUtils.fromUnicode(prop.getProperty("priv1", ""));
        result.transStat = prop.getProperty("transStat", "");
        result.gateId = prop.getProperty("gateId", "");
        result.cardType = prop.getProperty("cardType", "");
        result.cardNo = prop.getProperty("cardNo", "");
        result.userNme = StringUtils.fromUnicode(prop.getProperty("userNme", ""));
        result.certType = prop.getProperty("certType", "");
        result.certId = prop.getProperty("certId", "");
        result.message = StringUtils.fromUnicode(prop.getProperty("message", ""));
        return result;
    }

    /**
     * 返回成功
     *
     * @return
     */
    public boolean success() {
        return ChinaPayConstant.SINGLE_CUT_SUCCESS.equals(responseCode);
    }

    /**
     * 交易成功
     *
     * @return
     */
    public boolean transSuccess() {
        return ChinaPayConstant.SINGLE_CUT_SUCCESS.equals(responseCode) && SingleCutStatCode.SUCCESS.isSameAs(transStat);
    }

    /**
     * 业务处于不确定状态，需要再次查询获取最终结果
     *
     * @return
     */
    public boolean transPending() {
        boolean processOK = success();
        if (processOK) {
            // 处理成功，不是在途，直接返回false
            return false;
        }
        // 处理没成功，可能是在途，也有可能失败，参考 stat
        // respCode<>00 ,下面判断是在途的状态字的话返回true
        if (SingleCutStatCode.PENDING_INITIALIZED.isSameAs(transStat)) {
            return true;
        } else if (SingleCutStatCode.PENDING_TIMEOUT.isSameAs(transStat)) {
            return true;
        } else if (SingleCutStatCode.PENDING_UNKNOWN.isSameAs(transStat)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 交易失败
     *
     * @return
     */
    public boolean transFail() {
        boolean isTransSuccess = transSuccess();
        boolean isTransPending = transPending();
        boolean isFail = !(isTransSuccess || isTransPending);
        return isFail;
    }
}
