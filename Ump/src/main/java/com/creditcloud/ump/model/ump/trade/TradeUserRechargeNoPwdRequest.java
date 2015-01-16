/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.trade;

import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;
import lombok.ToString;

/**
 * 个人客户无密充值（商户->平台）
 * 
 * 注：联动优势向商户收取充值费用的6‰
 * 
 * 1.接收处理P2P平台发起的个人客户（投资人、融资人）托管账户请求，
 * 通过无密借记卡快捷充值，并完成入账到个人客户P2P托管账，同步
 * 响应充值结果
 * 2.用户必须已经签约了借记卡快捷和无密快捷服务
 * 3.交易成功后会使用“充值结果通知”接口再次告知商户
 * 4.使用快捷充值时，用户注册手机号务必与银行预留手机号保持一致
 * 
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class TradeUserRechargeNoPwdRequest extends BaseRequest{
    
    /**
     * 服务器异步通知页面路径
     * 
     * 说明:交易完成后，联动优势资金账户托管平台会按照此地址将交易结果以
     * 后台的方式发送到商户网站
     * 
     * 能否为空： 否
     * 
     * @return
     */
    private String notify_url;
    
    /**
     * 商户订单号
     * 
     * 说明：商户订单号支持数字、英文字母，其他字符不建议使用长度4至32位
     * 
     * 能否为空： 否
     * 
     * @return
     */
    private String order_id;
    
    /**
     * 商户订单日期: 商户生成订单的日期，格式YYYYMMDD
     * 
     * 能否为空： 否
     * 
     * @return
     */
    private String mer_date;
    
    /**
     * 支付方式
     * 
     * 取值：DEBITCARD（借记卡快捷）
     * 
     * 能否为空： 否
     * 
     * @return
     */
    private String pay_type;
    
    /**
     * 资金账户托管平台的用户号
     * 
     * 说明：联动开立的用户号
     * 
     * 能否为空：否
     * 
     * @return
     */
    private String user_id;
    
    /**
     * 资金账户托管平台的账户号
     * 
     * 说明：联动开立的账户号，商户可以不传递，如果传递必须和开户时返回的保持一致，
     * 如果未返回则忽略此字段
     * 
     * 能否为空：是
     * 
     * @return
     */
    private String account_id;
    
    /**
     * 充值金额
     * 
     * 单位： 分
     * 
     * 能否为空：否
     * 
     * @return
     */
    private String amount;
    
    public TradeUserRechargeNoPwdRequest(String mer_id,
                                         String notify_url, 
                                         String order_id, 
                                         String mer_date, 
                                         String pay_type, 
                                         String user_id, 
                                         String account_id, 
                                         String amount) {
        super(CmdIdType.MER_RECHARGE_PERSON_NOPWD, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.VERSION_1);
        this.notify_url = notify_url;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.pay_type = pay_type;
        this.user_id = user_id;
        this.account_id = account_id;
        this.amount = amount;
    }
}
