package com.creditcloud.chinapay.model.request;

import com.creditcloud.chinapay.utils.StringUtils;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 银联单笔代付交易接口请求报文 <br>
 * 定义参考 : ChinaPay收付捷平台_单笔代付接口文档V1.3.doc <br>
 *
 * @author GuohuaZhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SinglePayPostParameters extends SinglePayParameters {

    private static final long serialVersionUID = 20150311L;

    @NotNull
    private String cardNo = "";//收款账号	数字	变长，32位	必填	银行卡号或者存折号 

    @NotNull
    private String usrName = "";//收款人姓名	字符	变长，100位	必填	收款人在银行开户时留存的开户姓名

    @NotNull
    private String openBank = "";//开户银行	字符	变长，50位	必填	开户银行名称 银行支持情况及银行名称填写内容请参看《收付捷商户操作使用手册（代付商户）》

    @NotNull
    private String prov = "";//prov	省份	字符	变长，20位	必填	收款人开户行所在省， 请参看《收付捷商户操作使用手册（代付商户）》

    @NotNull
    private String city = "";//city	城市	字符	变长，40位	必填	收款人开户行所在地区，请参看《收付捷商户操作使用手册（代付商户）》

    @NotNull
    private String transAmt = "";//金额	数字	变长，12位	必填	整数，货币种类为人民币，以分为单位

    @NotNull
    private String purpose = "";//用途	字符	变长，25位	必填	存款用途。

    private String subBank = "";//支行	字符	变长，80位	选填	开户支行名称。

    private String flag = "00";//付款标志	字符	定长，2位	选填	对公对私标记。“00”对私，“01”对公。该字段可以不填，如不填则默认为对私。

    /**
     * 获取将要支付的金额，以分为单位，整数
     * @return 
     */
    public long getLongTransAmount() {
        long cents = StringUtils.toLong(transAmt, 0L);
        return cents;
    }

    @Override
    public String getTextToSign() {
        return new StringBuffer(merId).append(merDate).append(merSeqId).append(cardNo).append(usrName).append(openBank)
                .append(StringUtils.nonNull(prov)).append(StringUtils.nonNull(city)).append(transAmt).append(StringUtils.nonNull(purpose)).append(subBank).append(flag)
                .append(version).toString();
    }
}
