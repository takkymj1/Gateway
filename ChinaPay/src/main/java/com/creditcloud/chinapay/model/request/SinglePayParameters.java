package com.creditcloud.chinapay.model.request;

import com.creditcloud.chinapay.model.POJO;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 银联单笔代付交易接口报文 <br>
 * 定义参考 : ChinaPay收付捷平台_单笔代付接口文档V1.3.doc <br>
 *
 * @author GuohuaZhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class SinglePayParameters extends POJO {

    private static final long serialVersionUID = 20150311L;
    @NotNull
    protected String merId = "";//商户号	数字	定长，15位	必填	在收付捷平台中开通的商户编号
    @NotNull
    protected String merDate = "";//商户日期	数字	定长，8位	必填	标志该笔交易发生的日期,格式为YYYYMMDD，请填写当天的日期。
    @NotNull
    protected String merSeqId = "";//商户流水号	数字	变长，16位	必填	商户号+商户流水号+商户日期唯一标示一笔交易订单

    protected final String version = "20090501";//版本号	字符	变长，8位	必填	固定为“20090501”

    protected final String signFlag = "1";//签名标志	字符	定长，1位	必填	固定为“1” 
    @NotNull
    protected String chkValue = "";//签名值	字符	定长，256位	必填	签名字段

    public void setMerDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateStringYYYYMMDD = sdf.format(date);
        merDate = dateStringYYYYMMDD;
    }

    public abstract String getTextToSign();

    @Override
    public String toJSON() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            return "{}";
        }
    }

    @Override
    public String toString() {
        return toJSON();
    }
}
