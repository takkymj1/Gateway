/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author guohuazhang
 */
@Data
public class ProductFundNavsMetadata implements Serializable{

    private String fund_id;
    private Long pub_date;
    private Double profit10k;
    private Double rate;
    private Double net_value;
    private Double acc_net_value;

    public Date getPubDate() {
        return new Date(pub_date);
    }

    @Override
    public String toString() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        builder.setAppendStatics(false);
        builder.setAppendTransients(false);

        builder.append("pubDate", getPubDate());
        return builder.build();
    }
}
