/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.model;

import com.creditcloud.model.BaseObject;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用于从manager实时控制market</p>
 * 例如有fail over时不重启来微控market相关流程
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class MarketControl extends BaseObject {

    private static final long serialVersionUID = 20141217L;

    /**
     * 跳过还款流程借款人往标的账户转账
     */
    @FormParam("ignoreUmpRepayRefund")
    private boolean ignoreUmpRepayRefund = false;

    /**
     * 跳过垫付流程平台/担保方往标的账户转账
     */
    @FormParam("ignoreUmpDisburseRefund")
    private boolean ignoreUmpDisburseRefund = false;

    public MarketControl(boolean ignoreUmpRepayRefund,
                         boolean ignoreUmpDisburseRefund) {
        this.ignoreUmpDisburseRefund = ignoreUmpDisburseRefund;
        this.ignoreUmpRepayRefund = ignoreUmpRepayRefund;
    }

}
