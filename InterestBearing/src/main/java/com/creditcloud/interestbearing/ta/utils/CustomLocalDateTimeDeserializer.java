/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.utils;

import com.creditcloud.interestbearing.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author guohuazhang
 */
public class CustomLocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

    private final static DateTimeFormatter formatter = DateTimeFormat.forPattern(Constants.LOCAL_DATETIME_PATTERN);

    @Override
    public LocalDateTime deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
        String text = jp.getText();
        return LocalDateTime.parse(text, formatter);
    }

}
