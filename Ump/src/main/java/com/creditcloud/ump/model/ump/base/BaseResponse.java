/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.base;

import com.creditcloud.model.BaseObject;
import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;
import com.creditcloud.ump.model.ump.utils.MessageUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
public abstract class BaseResponse extends BaseObject {
    
    private CmdIdRspType rspType;
    
    private String sign_type;
    
    private String sign;
    
    private String mer_id;
    
    private String version;
    
    private String ret_code;

    private String ret_msg;
    
    public BaseResponse(CmdIdRspType rspType) {
        this.rspType = rspType;
    }
    
    public BaseResponse(CmdIdRspType rspType, 
                        String sign_type, 
                        String sign, 
                        String mer_id, 
                        String version,
                        String ret_code,
                        String ret_msg) {
        this.rspType = rspType;
        this.sign_type = sign_type;
        this.sign = sign;
        this.mer_id = mer_id;
        this.version = version;
        this.ret_code = ret_code;
        this.ret_msg = ret_msg;
    }
    
    public BaseResponse(CmdIdRspType rspType, 
                        String mer_id,
                        String ret_code,
                        String ret_msg) {
        this.rspType = rspType;
        this.mer_id = mer_id;
        this.sign_type = UmpConstant.SIGN_TYPE;
        this.sign = "";
        this.mer_id = mer_id;
        this.version = UmpConstant.CURRENT_VERSION;
    }
        
    public String chkString() {
        Map<String, String> values = MessageUtils.getFieldValuesMap(this);
        Set<String> sets = new TreeSet<>();
        
        for(String key : values.keySet()) {
            String value = values.get(key);
            if(!key.equals("sign") && !key.equals("sign_type") && !key.equals("rspType")) {
                // skip sign and sign_type and rspType field, they are not in checksum string
                if(value!=null) {
                    sets.add(key + "=" +value);
                }
            }
        }
        
        return StringUtils.join(sets, "&");
    }

    public String contentString() {
        Map<String, String> values = MessageUtils.getFieldValuesMap(this);
        Set<String> sets = new TreeSet<>();
        
        for(String key : values.keySet()) {
            String value = values.get(key);
            if(!key.equals("sign") && !key.equals("rspType")) {
                // skip sign and rspType field, they are not in the content string
                if(value!=null) {
                    sets.add(key + "=" +value);
                }
            }
        }
        
        return StringUtils.join(sets, "&");
    }
        
    public boolean success() {
        if(ret_code!=null) {
            return ret_code.equals(UmpConstant.SUCCESS_CODE);
        }else{
            return false;
        }
    }
    
    public static <T extends BaseResponse> T fromHTML(String html, Class<T> theClass) {
        T response = null;
        try {
            response = theClass.newInstance();
            Map<String, String> fieldValueMaps = MessageUtils.getFieldValuesMap(html);
            BeanUtils.populate(response, fieldValueMaps);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            String errMsg = String.format("create response object for:%s from:%s error", theClass.getName(), html);
            throw new RuntimeException(errMsg, ex);
        }
        
        return response;
    }
    
    public String toResponseStr() {
        String content = this.contentString();
        
        return StringUtils.join(content, "&sign=", this.getSign());
    }

}
