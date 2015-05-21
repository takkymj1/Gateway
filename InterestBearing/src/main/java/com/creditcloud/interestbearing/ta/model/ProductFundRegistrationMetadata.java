/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class ProductFundRegistrationMetadata implements Serializable {

    private String product_type = "";
    private String product_id = "";
    private int status;
    private long register_time = 0l;
    private int priority;
    private double quota;
    private ProductFundMetadata product;

    @JsonIgnore
    public Date getRegisterTime() {
        return new Date(register_time);
    }

    @Override
    public String toString() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        builder.setAppendStatics(false);
        builder.setAppendTransients(false);

        builder.append("registerTime", getRegisterTime());
        return builder.build();
    }
}
