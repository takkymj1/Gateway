/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.utils;

import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.umpay.api.common.ReqData;
import com.umpay.api.exception.ReqDataException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
    
    private static final Pattern responsePattern = Pattern.compile("<META NAME=\"MobilePayPlatform\" CONTENT=\"(.*)\">", Pattern.CASE_INSENSITIVE);
    private static final Logger logger = Logger.getLogger(MessageUtils.class.getName());
    
    public static Map<String, String> getFieldValuesMap(BaseRequest request) {
        Map<String, String> result = new HashMap<>();
        Set set = new BeanMap(request).entrySet();
        for (Object entryObj : set) {
            Map.Entry entry = (Map.Entry) entryObj;
            String key = entry.getKey().toString();
            String value = entry.getValue() == null ? null : entry.getValue().toString();
            if (!key.equalsIgnoreCase("class")) {
                // not put null field
                if(value!=null) {
                    value = key.equals("service")? value.toLowerCase():value;
                    result.put(key, value);
                }
            }
        }
        return result;
    }
    
    public static Map<String, String> getFieldEncryptValuesMap(BaseRequest request) {
        Map<String, String> values = MessageUtils.getFieldValuesMap(request);
        Map<String, String> results = new HashMap<>();
        values.remove("sign");
        try {
            ReqData reqData = com.umpay.api.paygate.v40.Mer2Plat_v40.makeReqDataByPost(values);
            for (Object object : reqData.getField().entrySet()) {
                Map.Entry<String, String> entry = (Map.Entry<String, String>) object;
                results.put(entry.getKey(), entry.getValue());
            }
        } catch (ReqDataException ex) {
            // ignore
        }

        return results;
    }
    
    public static Map<String, String> getFieldValuesMap(BaseResponse response) {
        Map<String, String> result = new HashMap<>();
        for (Object entryObj : new BeanMap(response).entrySet()) {
            Map.Entry entry = (Map.Entry) entryObj;
            String key = entry.getKey().toString();
            String value = entry.getValue() == null ? null : entry.getValue().toString();
            if (!key.equalsIgnoreCase("class") && !key.equals("rspType") && value!=null) {
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
            String[] params = responseStr.split("&");
            try {
                for(String paramStr : params) {
                    int pos = paramStr.indexOf("=");
                    if(pos != -1) {
                        values.put(paramStr.substring(0, pos), paramStr.substring(pos+1, paramStr.length()));
                    }else{
                        String errMsg = String.format("wrong format:%s, ignore", paramStr);
                        logger.log(Level.SEVERE, errMsg);
                    }
                }
            } catch (Exception ex) {
                String errMsg = String.format("failed to parse the html response:%s", html);
                logger.log(Level.SEVERE, errMsg, ex);
           }
        }
        
        return values;
    }
}
