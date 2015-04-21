/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.request;

import com.creditcloud.lianlianpay.base.BaseRequest;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class PayResultRequest extends BaseRequest {

    private String no_order;

    private String dt_order;

    public PayResultRequest() {
    }

    public PayResultRequest(String no_order,
                            String dt_order,
                            String oid_partner,
                            String sign_type,
                            String sign) {
        super(oid_partner, sign_type, sign);
        this.no_order = no_order;
        this.dt_order = dt_order;
    }

}
