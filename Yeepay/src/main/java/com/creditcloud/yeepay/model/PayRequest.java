/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeepay.model;

import com.creditcloud.yeepay.Constant;
import com.yeepay.PaymentForOnlineService;
import lombok.Data;
import lombok.NonNull;

/**
 * 向易宝支付发出的付款请求对象
 *
 * @author sobranie
 */
@Data
public class PayRequest {

    private String p0_Cmd = "Buy";

    private String p1_MerId = Constant.p1_MerId;

    /**
     * 订单号 OrdId
     */
    @NonNull
    private String p2_Order;

    /**
     * 支付金额
     */
    @NonNull
    private String p3_Amt;

    private String p4_Cur = "CNY";

    private String p5_Pid = Constant.p5_Pid;

    private String p6_Pcat = "";

    private String p7_Pdesc = "";

    private String p8_Url = Constant.p8_Url;

    /**
     * 不需要送货
     */
    private String p9_SAF = "0";

    private String pa_MP = "";

    /**
     * 不指定通道
     */
    private String pd_FrpId = "";

    /**
     * 需要应答机制
     */
    private String pr_NeedResponse = "1";
    
    private String hmac;

    public String hmac() {
        return PaymentForOnlineService.getReqMd5HmacForOnlinePayment(p0_Cmd,
                                                                     p1_MerId, p2_Order, p3_Amt, p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc,
                                                                     p8_Url, p9_SAF, pa_MP, pd_FrpId, pr_NeedResponse, Constant.keyValue);
    }

}
