package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金申购
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class TradeBuyFundRequest extends BaseRequest{

    /**
     * 证件号码
     */
    private String certificateno;
    
    /**
     * 证件类型（0为身份证，暂时只支持身份证）
     */
    private String certificatetype;
    
    /**
     * 银行卡号
     */
    private String depositacct;
    
    /**
     * 银行卡户名
     */
    private String depositacctname;
    
    /**
     * 交易账号
     */
    private String transactionaccountid;
    
    /**
     * 网点号
     */
    private String channelid;
    
    /**
     * 基金代码
     */
    private String fundcode;
    
    /**
     * 买入金额
     */
    private String buymoney;
    
    public TradeBuyFundRequest(
            String merid,
            String idNumber, 
            String bankAccount, 
            String bankAccountName,
            String transactionaccountid,
            String channelid,
            String fundcode,
            String buymoney) {
        super(Attribute.buy, merid);
        this.certificateno = idNumber;
        this.certificatetype = "0";
        this.depositacct = bankAccount;
        this.depositacctname = bankAccountName;
        this.transactionaccountid = transactionaccountid;
        this.channelid = channelid;
        this.fundcode = fundcode;
        this.buymoney = buymoney;
    }
}
