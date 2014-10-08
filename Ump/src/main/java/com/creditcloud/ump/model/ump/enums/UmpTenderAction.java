/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kdliu
 */
public enum UmpTenderAction implements BaseEnum{
    INFLOW("标的转入", "01"),
    OUTFLOW("标的转出", "02");
    
    private static Map<String, UmpTenderAction> codeMap;
    
    private String key;
    private String code;
    
    static {
        Map<String, UmpTenderAction> map = new HashMap<>(UmpTenderAction.values().length);
        for(UmpTenderAction action : UmpTenderAction.values()) {
            map.put(action.getCode(), action);
        }
        codeMap = Collections.unmodifiableMap(map);
    }
    
    UmpTenderAction(String key, String code) {
        this.key = key;
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getKey() {
        return key;
    }
    
    public static UmpTenderAction fromCode(String code) {
        return codeMap.get(code);
    }
}
