/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.product;

import com.creditcloud.interestbearing.ta.message.ResponseMessage;
import com.creditcloud.interestbearing.ta.model.ProductFundMetadata;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author guohuazhang
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductQueryOneFundResponseMessage extends ResponseMessage {
           private ProductFundMetadata product;
}
