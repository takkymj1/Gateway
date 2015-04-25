/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.unionpay.model.message;

import com.creditcloud.unionpay.api.UnionPayConstants;

/**
 *
 * @author guohuazhang
 */
public class RequestMessage {

    protected final String version = UnionPayConstants.VERSION;// 版本号 M 固定填写
    protected final String encoding = UnionPayConstants.HTTP_CONTENT_ENCODING;//编码方式M 默认取值： UTF-8
    protected String certId;//证书 ID M 通过 MPI 插件获取
    protected String signature;//签名 M 填写对报文摘要的签名
    protected String signMethod = UnionPayConstants.SIGN_METHOD_RSA;//签名方法 M 取值： 01（表示采用 RSA）
    protected String txnType;//交易类型 M 
    protected String txnSubType;//交易子类 M 
    protected String bizType;//产品类型 M 
    protected String channelType;//渠道类型  M
    protected String backUrl;//后台通知地址 C 后台返回商户结果时使用，如上送，则发送商户后台交易结果通知
    protected String accessType;//接入类型 M 0：普通商户直连接入 2：平台类商户接入
    protected String merId;//商户代码  M
    protected String subMerId;//二级商户代码 C 商户类型为平台类商户接入时必须上送
    protected String subMerName;//二级商户名称 C 商户类型为平台类商户接入时必须上送
    protected String subMerAbbr;//二级商户简称 C 商户类型为平台类商户接入时必须上送
    protected String orderId;//商户订单号 M
    protected String txnTime;//订单发送时间  M
    protected String accType;//帐号类型 O
    protected String accNo;//帐号 O 对于前台类交易，返回卡号后 4位， 后台类交易，原样返回
    protected String customerInfo;//银行卡验证信息及身份信息 O
    protected String reqReserved;//请求方保留域 O 商户自定义保留域，交易应答时会原样返回
    protected String reserved;//保留域 O
    protected String riskRateInfo;//风险信息域 O 格式如下： {子域名 1=值&子域名2=值&子域名 3=值}有风险级别要求的商户必填 风险级别 {riskLevel=XX}
    protected String encryptCertId;//加密证书 ID C 当使用银联公钥加密密码等信息时，需上送加密证书的 CertID
    protected String bindId;//绑定关系标识号 C 需做建立绑定关系交易时填写
}
