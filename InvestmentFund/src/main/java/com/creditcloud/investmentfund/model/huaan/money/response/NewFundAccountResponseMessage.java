/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.response;

import com.creditcloud.investmentfund.model.huaan.money.CommonResponseMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * 定义参考 : 华安云中信通讯接口说明_机构.doc <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NewFundAccountResponseMessage extends CommonResponseMessage {

    private String responseHTML;

    @Override
    public void resolveXMLPaylod() {

    }

}
