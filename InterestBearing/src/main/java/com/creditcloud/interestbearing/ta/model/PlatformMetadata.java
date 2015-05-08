/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.model;

import java.util.Date;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author guohuazhang
 */
@Data
public class PlatformMetadata {
    
    private String tenantId;
    private String name;
    private String description;
    private String url;
    private long create_time;
    
    public Date getCreateTime() {
        return new Date(create_time);
    }
    
    @Override
    public String toString() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        builder.setAppendStatics(false);
        builder.setAppendTransients(false);
        
        builder.append("createTime", getCreateTime());
        return builder.build();
    }
}
