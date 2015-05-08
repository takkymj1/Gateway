/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.product;

import com.creditcloud.interestbearing.ta.message.ResponseMessage;
import com.creditcloud.interestbearing.ta.model.ProductFundNavsMetadata;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductQueryNavsOfOneFundResponseMessage extends ResponseMessage {

    private List<ProductFundNavsMetadata> content;
    private Integer totalPages;
    private Integer totalElements;
    private Boolean last;
    private Integer size;
    private Integer number;
    private Boolean first;
    private String sort;
    private Integer numberOfElements;
}
