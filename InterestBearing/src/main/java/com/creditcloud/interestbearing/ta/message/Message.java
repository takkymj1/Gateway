/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author guohuazhang
 */
@Slf4j
public class Message implements Serializable {

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }

    public String toJSON() {
        ObjectMapper mapper = new ObjectMapper();

        String json;
        try {
            json = mapper.writeValueAsString(this); //返回字符串
            return json;
        } catch (JsonProcessingException ex) {
            log.error("将当前对象{}转换为JSON文本遇到异常", this, ex);
            return "{}";
        }

    }
}
