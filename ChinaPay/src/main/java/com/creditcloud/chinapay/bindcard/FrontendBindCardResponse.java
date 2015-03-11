/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.bindcard;

import com.creditcloud.chinapay.ChinaPayConstant;
import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前台页面认证绑卡response
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class FrontendBindCardResponse extends BaseObject {

    private static final long serialVersionUID = 20150311L;

    @FormParam("appSysId")
    private String appSysId;

    @FormParam("signMethod")
    private String signMethod;

    @FormParam("usrSysId")
    private String usrSysId;

    @FormParam("email")
    private String email;

    @FormParam("mobile")
    private String mobile;

    @FormParam("pgRetUrl")
    @NotNull
    private String pgRetUrl;

    @FormParam("bgRetUrl")
    private String bgRetUrl;

    @FormParam("ordDate")
    @NotNull
    private String ordDate;

    @FormParam("ordSeqId")
    @NotNull
    private String ordSeqId;

    @FormParam("cardNo")
    private String cardNo;

    @FormParam("certType")
    private String certType;

    @FormParam("certNo")
    private String certNo;

    @FormParam("usrName")
    private String usrName;

    @FormParam("cardCvn2")
    private String cardCvn2;

    @FormParam("cardExpire")
    private String cardExpire;

    @FormParam("cardPhone")
    private String cardPhone;

    @FormParam("signature")
    @NotNull
    private String signature;

    @FormParam("respcode")
    @NotNull
    private String respcode;

    @FormParam("respmsg")
    private String respmsg;

    /**
     * 是否成功返回
     *
     * @return
     */
    public boolean success() {
        return ChinaPayConstant.SUCCESS_CODE.equals(respcode);
    }
}
