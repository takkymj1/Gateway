package com.creditcloud.chinapay.model.response;

import com.creditcloud.chinapay.ChinaPayConstant;
import com.creditcloud.chinapay.enums.SinglePayStatCode;
import java.util.List;
import java.util.Properties;

import com.creditcloud.chinapay.model.POJO;
import com.creditcloud.chinapay.utils.StringUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SinglePayPostResult extends POJO {

    protected String responseCode = "";// 4位 是 请求应答码，具体请见附录6.1.1

    protected String merId = "";// 15位 否 同请求报文参数中的商户号

    protected String merDate = "";// 8位 否 同请求报文参数中的商户日期

    protected String merSeqId = "";// 16位 否 同请求报文参数中的商户流水号

    protected String cpDate = "";// 8位 否 ChinaPay接收到交易的日期

    protected String cpSeqId = "";// 6位 否 ChinaPay系统内部流水

    protected String transAmt = "";// 12位 否 同请求报文参数中的金额

    protected String stat = "";// 1位 否 交易状态码，具体请参看附录6.1.2

    protected String cardNo = "";// 32位 否 同请求报文参数中的收款账号

    protected String chkValue = "";// 256位 是
    // 对返回字串的签名。返回应答报文中最后一个“&”符号以前的都是作为签名的明文。明文需进行BASE64编码，具体见下方。

    public static SinglePayPostResult parse(String responseText) {
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

        SinglePayPostResult result = new SinglePayPostResult();

        result.responseCode = prop.getProperty("responseCode", "");
        result.merId = prop.getProperty("merId", "");
        result.merDate = prop.getProperty("merDate", "");
        result.merSeqId = prop.getProperty("merSeqId", "");
        result.cpDate = prop.getProperty("cpDate", "");
        result.cpSeqId = prop.getProperty("cpSeqId", "");
        result.transAmt = prop.getProperty("transAmt", "");
        result.stat = prop.getProperty("stat", "");
        result.cardNo = prop.getProperty("cardNo", "");

        return result;
    }

    /**
     * 返回应答成功
     *
     * @return
     */
    public boolean success() {
        return ChinaPayConstant.SINGLE_PAY_TRANS_SUCCESS_CODE.equals(responseCode);
    }

    //s	成功	交易成功	状态码为小写字母s
    //2	处理中	交易已接受	
    //3	处理中	财务已确认	
    //4	处理中	财务处理中	
    //5	处理中	已发往银行	ChinaPay已将代付交易发往银行。后续若银行返回结果，该状态会相应更新。
    //6	失败	银行已退单	银行退单，交易失败。
    //7	处理中	重汇已提交	
    //8	处理中	重汇已发送	ChinaPay已将代付交易发往银行。后续若银行返回结果，该状态会相应更新。
    //9	失败	重汇已退单	银行对重汇的代付交易退单，交易失败。
    /**
     * 交易成功
     *
     * @return
     */
    public boolean transSuccess() {
        return success() && SinglePayStatCode.SUCCESS.isSameAs(getStat());
    }

    /**
     * 交易失败
     *
     * @return
     */
    public boolean transFail() {
        boolean processOK = success();
        if (!processOK) {
            return true;
        }

        // respCode=0000,但是 stat 不为s的情况也许存在真正的失败
        if (SinglePayStatCode.FAIL_6.isSameAs(getStat())) {
            //6	失败	银行已退单	银行退单，交易失败。
            return true;
        } else if (SinglePayStatCode.FAIL_9.isSameAs(getStat())) {
            //9	失败	重汇已退单	银行对重汇的代付交易退单，交易失败。
            return true;
        } else {
            return false;
        }
    }

    /**
     * 业务处于不确定状态，需要再次查询获取最终结果
     * @return 
     */
    public boolean transPending() {
        boolean isTransSuccess = transSuccess();
        boolean isTransFail = transFail();
        boolean isPending = !(isTransSuccess || isTransFail);
        return isPending;
    }
}
