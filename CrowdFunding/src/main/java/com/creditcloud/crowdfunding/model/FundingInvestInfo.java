/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.EmailAddress;
import com.creditcloud.model.constraints.RealName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * wrap detailed info for funding invest</p>
 * eg.shipping address, message, invoice
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class FundingInvestInfo extends BaseObject {

    private static final long serialVersionUID = 20141019L;

    /**
     * same with FundingInvest
     */
    private String id;

    private FundingInvest invest;

    @RealName
    private String realName;

    /**
     * 13810002000 or 010-61112222
     */
    private String contact;

    @EmailAddress
    private String email;

    /**
     * 全路径:北京市海淀区西直门外大街金贸中心1627室
     */
    private String shippingAddress;

    private boolean needInvoice;

    /**
     * 备注信息
     */
    private String description;

    public FundingInvestInfo(String id,
                             String realName,
                             String contact,
                             String email,
                             String shippingAddress,
                             boolean needInvoice,
                             String description) {
        this.id = id;
        this.realName = realName;
        this.contact = contact;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.needInvoice = needInvoice;
        this.description = description;
    }
}
