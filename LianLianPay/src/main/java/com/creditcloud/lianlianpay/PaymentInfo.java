/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay;

import java.io.Serializable;

/**
* 支付信息bean
* @author tinglany
*
*/
public class PaymentInfo implements Serializable{
    private static final long serialVersionUID = 1L;
    // 商户提交参数
    private String            version;              // 接口版本号
    private String            oid_partner;          // 商户编号
    private String            sign_type;            // 签名方式
    private String            sign;                 // 签名
    private String            busi_partner;         // 商户业务类型
    private String            no_order;             // 商户唯一订单号
    private String            dt_order;             // 商户订单时间
    private String            name_goods;           // 商品名称
    private String            info_order;           // 订单描述
    private String            money_order;          // 交易金额 单位为RMB-元
    private String            notify_url;           // 服务器异步通知地址
    private String            url_return;           // 支付结束回显url
    private String            app_request;          // 请求应用标识 1：Android 2：ios 3：WAP
    private String            valid_order;          // 订单有效时间 分钟为单位，默认为10080分钟（7天）
    private String            user_id;
    private String            risk_item;
    private String            card_no;              // 银行卡号
    private String            no_agree;             // 签约协议号
    private String            acct_name;            // 姓名
    private String            id_no;                // 身份证号码

    // 用户提交参数
    private String            pay_type;             // 支付方式 2：快捷支付（借记卡） 3：快捷支付（信用卡）
    private String            bank_code;            // 银行编号
    private String            cardno;
    private String            bind_mob;
    private String            validate;
    private String            cvv2;
    private String            idno;
    private String            agreeno;
    private String            custname;             // 姓名
    private String            isrecord;             // 是否记录该卡
    private String            bank_name;            // 银行名称
    // 用户和商户信息
    private String            oid_paybill;          // 连连钱包支付单号
    private String            name_trader;          // 商户名称
    private String            rsa_public;           // 商户RSA公钥
    private String            rsa_private;          // 银通验证商户私钥
    private String            key_md5;              // MD5KEY值
    private String            flag_bankshow;        // 是否显示历史卡
    public String             user_login;           // 用户登陆名
    public String             oid_userno;           // 系统生成用户号
    public String             result_pay;           // 支付结果
    public String             settle_date;          // 清算日期
    private String            trade_state;          // 支付状态
    private String            ret_code;             // 交易返回码
    private String            ret_msg;              // 交易返回消息
    private String            lasttime_sendmsg;     // 最后发手机校验码时间
    private String            lastmobile_sendmsg;   // 最后发手机号码时间
    private String            smscode_locked;
    private String            ip_request;           // 用户请求ip
    private String            pay_key;
    private String            correlationID;        // 日志跟踪号
    private String            support_bank_map;     // 支持的银行列表
    private String            historycard;          // 是否有历史卡 yes/no
    private String            pay_mode;             // 支付类型 协议/银行卡

    // 分账商户名称
    private String            shareing_data;

    // 商户支持支付方式和银行卡信息
    private String            support_mode_list;    // 支持的支付方式list JSON串
    private String            support_ebank_map;    // 网银 支付方式银行列表map JSON串
    private String            support_bankcard_map; // 银行卡支付 支付方式银行列表map JSON串
    private String            support_bankcard_json; // 银行卡支付 支付方式银行列表map JSON串
    private String            sms_template;         // 商户支付短信定制模板

    private String            type_card;            // 银行卡类型 2:借记卡 3:信用卡
    private String            errorCode;
    private String            errorMessage;
    private String            flag_modify;          // 修改标记
    private String            flag_sms_verify;      //

    private String            local_network;
    private String            local_disk;
    private String            local_nic;

    private String            hidden_realname;      // 前端显示隐藏姓名
    private String            hidden_idcard;        // 前端显示隐藏身份证号
    private String            hidden_mobile;        // 前端显示隐藏的手机号码
    private String            signElementsFlag;     // 前端动态获取签约要素信息
    private String            pre_card_mode;

    private String            bg_color;              // 商户色值

    public String getFlag_sms_verify()
    {
        return flag_sms_verify;
    }

    public void setFlag_sms_verify(String flag_sms_verify)
    {
        this.flag_sms_verify = flag_sms_verify;
    }

    public String getLasttime_sendmsg()
    {
        return lasttime_sendmsg;
    }

    public void setLasttime_sendmsg(String lasttime_sendmsg)
    {
        this.lasttime_sendmsg = lasttime_sendmsg;
    }

    public String getTrade_state()
    {
        return trade_state;
    }

    public void setTrade_state(String trade_state)
    {
        this.trade_state = trade_state;
    }

    public String getRet_code()
    {
        return ret_code;
    }

    public void setRet_code(String ret_code)
    {
        this.ret_code = ret_code;
    }

    public String getRet_msg()
    {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg)
    {
        this.ret_msg = ret_msg;
    }

    public String getName_trader()
    {
        return name_trader;
    }

    public void setName_trader(String name_trader)
    {
        this.name_trader = name_trader;
    }

    public String getRsa_public()
    {
        return rsa_public;
    }

    public void setRsa_public(String rsa_public)
    {
        this.rsa_public = rsa_public;
    }

    public String getRsa_private()
    {
        return rsa_private;
    }

    public void setRsa_private(String rsa_private)
    {
        this.rsa_private = rsa_private;
    }

    public String getKey_md5()
    {
        return key_md5;
    }

    public void setKey_md5(String key_md5)
    {
        this.key_md5 = key_md5;
    }

    public String getUser_login()
    {
        return user_login;
    }

    public void setUser_login(String user_login)
    {
        this.user_login = user_login;
    }

    public String getOid_userno()
    {
        return oid_userno;
    }

    public void setOid_userno(String oid_userno)
    {
        this.oid_userno = oid_userno;
    }

    public String getCardno()
    {
        return cardno;
    }

    public void setCardno(String cardno)
    {
        this.cardno = cardno;
    }

    public String getBind_mob()
    {
        return bind_mob;
    }

    public void setBind_mob(String bind_mob)
    {
        this.bind_mob = bind_mob;
    }

    public String getValidate()
    {
        return validate;
    }

    public void setValidate(String validate)
    {
        this.validate = validate;
    }

    public String getCvv2()
    {
        return cvv2;
    }

    public void setCvv2(String cvv2)
    {
        this.cvv2 = cvv2;
    }

    public String getIdno()
    {
        return idno;
    }

    public void setIdno(String idno)
    {
        this.idno = idno;
    }

    public String getOid_paybill()
    {
        return oid_paybill;
    }

    public void setOid_paybill(String oid_paybill)
    {
        this.oid_paybill = oid_paybill;
    }

    public String getOid_partner()
    {
        return oid_partner;
    }

    public void setOid_partner(String oid_partner)
    {
        this.oid_partner = oid_partner;
    }

    public String getSign_type()
    {
        return sign_type;
    }

    public void setSign_type(String sign_type)
    {
        this.sign_type = sign_type;
    }

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }

    public String getBusi_partner()
    {
        return busi_partner;
    }

    public void setBusi_partner(String busi_partner)
    {
        this.busi_partner = busi_partner;
    }

    public String getNo_order()
    {
        return no_order;
    }

    public void setNo_order(String no_order)
    {
        this.no_order = no_order;
    }

    public String getDt_order()
    {
        return dt_order;
    }

    public void setDt_order(String dt_order)
    {
        this.dt_order = dt_order;
    }

    public String getName_goods()
    {
        return name_goods;
    }

    public void setName_goods(String name_goods)
    {
        this.name_goods = name_goods;
    }

    public String getInfo_order()
    {
        return info_order;
    }

    public void setInfo_order(String info_order)
    {
        this.info_order = info_order;
    }

    public String getMoney_order()
    {
        return money_order;
    }

    public void setMoney_order(String money_order)
    {
        this.money_order = money_order;
    }

    public String getNotify_url()
    {
        return notify_url;
    }

    public void setNotify_url(String notify_url)
    {
        this.notify_url = notify_url;
    }

    public String getUrl_return()
    {
        return url_return;
    }

    public void setUrl_return(String url_return)
    {
        this.url_return = url_return;
    }

    public String getPay_type()
    {
        return pay_type;
    }

    public void setPay_type(String pay_type)
    {
        this.pay_type = pay_type;
    }

    public String getBank_code()
    {
        return bank_code;
    }

    public void setBank_code(String bank_code)
    {
        this.bank_code = bank_code;
    }

    public String getResult_pay()
    {
        return result_pay;
    }

    public void setResult_pay(String result_pay)
    {
        this.result_pay = result_pay;
    }

    public String getSettle_date()
    {
        return settle_date;
    }

    public void setSettle_date(String settle_date)
    {
        this.settle_date = settle_date;
    }

    public String getApp_request()
    {
        return app_request;
    }

    public void setApp_request(String app_request)
    {
        this.app_request = app_request;
    }

    public String getValid_order()
    {
        return valid_order;
    }

    public void setValid_order(String valid_order)
    {
        this.valid_order = valid_order;
    }

    public String getLastmobile_sendmsg()
    {
        return lastmobile_sendmsg;
    }

    public void setLastmobile_sendmsg(String lastmobile_sendmsg)
    {
        this.lastmobile_sendmsg = lastmobile_sendmsg;
    }

    public String getUser_id()
    {
        return user_id;
    }

    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }

    public String getRisk_item()
    {
        return risk_item;
    }

    public void setRisk_item(String risk_item)
    {
        this.risk_item = risk_item;
    }

    public String getIp_request()
    {
        return ip_request;
    }

    public void setIp_request(String ip_request)
    {
        this.ip_request = ip_request;
    }

    public String getPay_key()
    {
        return pay_key;
    }

    public void setPay_key(String pay_key)
    {
        this.pay_key = pay_key;
    }

    public String getFlag_bankshow()
    {
        return flag_bankshow;
    }

    public void setFlag_bankshow(String flag_bankshow)
    {
        this.flag_bankshow = flag_bankshow;
    }

    public String getAgreeno()
    {
        return agreeno;
    }

    public void setAgreeno(String agreeno)
    {
        this.agreeno = agreeno;
    }

    public String getCorrelationID()
    {
        return correlationID;
    }

    public void setCorrelationID(String correlationID)
    {
        this.correlationID = correlationID;
    }

    public String getSupport_bank_map()
    {
        return support_bank_map;
    }

    public void setSupport_bank_map(String support_bank_map)
    {
        this.support_bank_map = support_bank_map;
    }

    public String getCustname()
    {
        return custname;
    }

    public void setCustname(String custname)
    {
        this.custname = custname;
    }

    public String getIsrecord()
    {
        return isrecord;
    }

    public void setIsrecord(String isrecord)
    {
        this.isrecord = isrecord;
    }

    public String getHistorycard()
    {
        return historycard;
    }

    public void setHistorycard(String historycard)
    {
        this.historycard = historycard;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getPay_mode()
    {
        return pay_mode;
    }

    public void setPay_mode(String pay_mode)
    {
        this.pay_mode = pay_mode;
    }

    public String getShareing_data()
    {
        return shareing_data;
    }

    public void setShareing_data(String shareing_data)
    {
        this.shareing_data = shareing_data;
    }

    public String getCard_no()
    {
        return card_no;
    }

    public void setCard_no(String card_no)
    {
        this.card_no = card_no;
    }

    public String getNo_agree()
    {
        return no_agree;
    }

    public void setNo_agree(String no_agree)
    {
        this.no_agree = no_agree;
    }

    public String getSmscode_locked()
    {
        return smscode_locked;
    }

    public void setSmscode_locked(String smscode_locked)
    {
        this.smscode_locked = smscode_locked;
    }

    public String getSupport_mode_list()
    {
        return support_mode_list;
    }

    public void setSupport_mode_list(String support_mode_list)
    {
        this.support_mode_list = support_mode_list;
    }

    public String getSupport_ebank_map()
    {
        return support_ebank_map;
    }

    public void setSupport_ebank_map(String support_ebank_map)
    {
        this.support_ebank_map = support_ebank_map;
    }

    public String getSupport_bankcard_map()
    {
        return support_bankcard_map;
    }

    public void setSupport_bankcard_map(String support_bankcard_map)
    {
        this.support_bankcard_map = support_bankcard_map;
    }

    public String getSms_template()
    {
        return sms_template;
    }

    public void setSms_template(String sms_template)
    {
        this.sms_template = sms_template;
    }

    public String getBank_name()
    {
        return bank_name;
    }

    public void setBank_name(String bank_name)
    {
        this.bank_name = bank_name;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public String getSupport_bankcard_json()
    {
        return support_bankcard_json;
    }

    public void setSupport_bankcard_json(String support_bankcard_json)
    {
        this.support_bankcard_json = support_bankcard_json;
    }

    public String getFlag_modify()
    {
        return flag_modify;
    }

    public void setFlag_modify(String flag_modify)
    {
        this.flag_modify = flag_modify;
    }

    public String getType_card()
    {
        return type_card;
    }

    public void setType_card(String type_card)
    {
        this.type_card = type_card;
    }

    public String getLocal_network()
    {
        return local_network;
    }

    public void setLocal_network(String local_network)
    {
        this.local_network = local_network;
    }

    public String getLocal_disk()
    {
        return local_disk;
    }

    public void setLocal_disk(String local_disk)
    {
        this.local_disk = local_disk;
    }

    public String getLocal_nic()
    {
        return local_nic;
    }

    public void setLocal_nic(String local_nic)
    {
        this.local_nic = local_nic;
    }

    public String getHidden_mobile()
    {
        return hidden_mobile;
    }

    public void setHidden_mobile(String hidden_mobile)
    {
        this.hidden_mobile = hidden_mobile;
    }

    public String getSignElementsFlag()
    {
        return signElementsFlag;
    }

    public void setSignElementsFlag(String signElementsFlag)
    {
        this.signElementsFlag = signElementsFlag;
    }

    public String getHidden_realname()
    {
        return hidden_realname;
    }

    public void setHidden_realname(String hidden_realname)
    {
        this.hidden_realname = hidden_realname;
    }

    public String getHidden_idcard()
    {
        return hidden_idcard;
    }

    public void setHidden_idcard(String hidden_idcard)
    {
        this.hidden_idcard = hidden_idcard;
    }

    public String getPre_card_mode()
    {
        return pre_card_mode;
    }

    public void setPre_card_mode(String pre_card_mode)
    {
        this.pre_card_mode = pre_card_mode;
    }

    public String getAcct_name()
    {
        return acct_name;
    }

    public void setAcct_name(String acct_name)
    {
        this.acct_name = acct_name;
    }

    public String getId_no()
    {
        return id_no;
    }

    public void setId_no(String id_no)
    {
        this.id_no = id_no;
    }

    public String getBg_color()
    {
        return bg_color;
    }

    public void setBg_color(String bg_color)
    {
        this.bg_color = bg_color;
    }
    
    

}
