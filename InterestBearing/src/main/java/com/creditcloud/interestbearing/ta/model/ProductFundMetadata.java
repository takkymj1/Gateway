/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.model;

import java.io.Serializable;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author guohuazhang
 */
@Data
public class ProductFundMetadata implements Serializable {

    private String fund_id = "";
    private String fund_name = "";
    private String broker = "";
    private int round_digits;
    private String fund_type = "";

    /**
     * 通过检查基金公司名称和基金代码判断是否是同一只基金
     *
     * @param anotherProduct
     * @return
     */
    public boolean isOfSameProduct(ProductFundMetadata anotherProduct) {
        if (anotherProduct == null) {
            return false;
        }

        boolean same = isOfSameProduct(anotherProduct.broker, anotherProduct.fund_id);
        return same;
    }

    public boolean isOfSameProduct(String brokerName, String fundId) {

        boolean sameBroker = StringUtils.defaultString(broker).equalsIgnoreCase(brokerName);
        boolean sameFundId = StringUtils.defaultString(fund_id).equalsIgnoreCase(fundId);
        return sameBroker && sameFundId;
    }

    @Override
    public String toString() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        builder.setAppendStatics(false);
        builder.setAppendTransients(false);

        return builder.build();
    }
}
