/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author GuohuaZhang
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditCloudTAConfig extends ConfigObjBase {

    /**
     * 平台在云信TA的租户账号
     */
    private String tenantId;

    private String name;
    private String desc;
    private String url;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }

}
