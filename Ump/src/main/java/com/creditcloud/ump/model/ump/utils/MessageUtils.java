/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.utils;

import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.base.BaseResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.beanutils.BeanMap;

/**
 *
 * @author kdliu
 */
public class MessageUtils {
    
    private static final Pattern responsePattern = Pattern.compile("<META NAME=\"MobilePayPlatform\" CONTENT=\"(.*)\"/>");
    private static final String responseTemplate = "<HTML><HEAD><META NAME=\"MobilePayPlatform\" CONTENT=\"*\"/></HEAD></HTML>";
    private static Logger logger = Logger.getLogger(MessageUtils.class.getName());
    
    public static Map<String, String> getFieldValuesMap(BaseRequest request) {
        Map<String, String> result = new HashMap<>();
        for (Object entryObj : new BeanMap(request).entrySet()) {
            Map.Entry entry = (Map.Entry) entryObj;
            String key = entry.getKey().toString();
            String value = entry.getValue() == null ? null : entry.getValue().toString();
            if (!key.equalsIgnoreCase("class")) {
                result.put(key, value);
            }
        }
        return result;
    }
    
    public static Map<String, String> getFieldValuesMap(BaseResponse response) {
        Map<String, String> result = new HashMap<>();
        for (Object entryObj : new BeanMap(response).entrySet()) {
            Map.Entry entry = (Map.Entry) entryObj;
            String key = entry.getKey().toString();
            String value = entry.getValue() == null ? null : entry.getValue().toString();
            if (!key.equalsIgnoreCase("class")) {
                result.put(key, value);
            }
        }
        return result;
    }
    
   public static Map<String, String> getFieldValuesMap(String html) {
       Matcher matcher = responsePattern.matcher(html);
       Map<String, String> values = new HashMap<>();
        if(matcher.find()) {
            String responseStr = matcher.group(1);
            // handle sign field
            int signPos = responseStr.lastIndexOf(".&sign=");
            String sign = responseStr.substring(signPos+7);
            values.put("sign", sign);
            String content = responseStr.substring(0, signPos);
            String[] params = content.split("&");
            try {
                for(String paramStr : params) {
                    String[] keyAndValue = paramStr.split("=");
                    if(keyAndValue.length == 2) {
                        values.put(keyAndValue[0], URLDecoder.decode(keyAndValue[1], UmpConstant.ENCODE_TYPE));
                    }
                }
            } catch (UnsupportedEncodingException ex) {
                String errMsg = String.format("failed to parse the html response:%s", html);
                logger.log(Level.SEVERE, errMsg, ex);
           }
        }
        
        return values;
    }
   
   public static String createResponse(String rawContent) {
       return responseTemplate.replace("*", rawContent);
   }
}
