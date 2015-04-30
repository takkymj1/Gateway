/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.unionpay.api;

import com.creditcloud.unionpay.model.CustomerAccountInfo;

/**
 * 银联
 *
 * @author GuohuaZhang
 */
public interface UnionPayService {

    boolean backendValidateCustomerAccountInfo(CustomerAccountInfo account);
}
