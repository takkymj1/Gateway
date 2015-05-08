/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.product;

import com.creditcloud.interestbearing.ta.message.RequestMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductRegisterNewFundRequestMessage extends RequestMessage {

    private String fund_id;
    private String name;
    private String broker;
    private int round_digits;
    private String fund_type;
    private int priority;
    private double quota;
}
