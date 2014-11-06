/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.base;

import com.creditcloud.model.BaseObject;
import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import com.creditcloud.ump.model.ump.utils.MessageUtils;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.ws.rs.QueryParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
public abstract class BaseRequest extends BaseObject {
    
    private CmdIdType service;
    
    @QueryParam("sign_type")
    private String sign_type;
    
    @QueryParam("charset")
    private String charset;
    
    @QueryParam("res_format")
    private String res_format;
    
    @QueryParam("sign")
    private String sign;
    
    @QueryParam("mer_id")
    private String mer_id;
    
    @QueryParam("version")
    private String version;

    public BaseRequest(CmdIdType service,
                       String sign_type, 
                       String charset, 
                       String res_format, 
                       String sign, 
                       String mer_id, 
                       String version) {
        this.service = service;
        this.sign_type = sign_type;
        this.charset = charset;
        this.res_format = res_format;
        this.sign = sign;
        this.mer_id = mer_id;
        this.version = version;
    }
    
    public BaseRequest(CmdIdType service) {
        this.service = service;
    }
    
    public BaseRequest(CmdIdType service, String mer_id) {
        this.service = service;
        this.mer_id = mer_id;
        this.sign_type = UmpConstant.SIGN_TYPE;
        this.charset = UmpConstant.ENCODE_TYPE;
        this.res_format = UmpConstant.RESPONSE_FORMAT;
        this.sign = "";
        this.mer_id = mer_id;
        this.version = UmpConstant.VERSION_1;
    }
    
    public String chkString() {
        Map<String, String> values = MessageUtils.getFieldValuesMap(this);
        Set<String> sets = new TreeSet<>();
        
        for(String key : values.keySet()) {
            String value = values.get(key);
            if(!key.equals("sign") && !key.equals("sign_type")) {
                // skip sign and sign_type field, they are not in checksum string
                if(value!=null) {
                    String theValue = key.equals("service")? value.toLowerCase():value;
                    sets.add(key + "=" +theValue);
                }
            }
        }
        
        return StringUtils.join(sets, "&");
    }
}
