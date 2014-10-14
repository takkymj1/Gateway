/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
@XmlRootElement
public class UmpPostResult extends UmpResult {
        
    private final Map<String, String> postParams;

    public UmpPostResult(UmpResultType umpResultType, Map<String, String> postParams) {
        super(umpResultType);
        this.postParams = postParams;
    }
    
    public UmpPostResult(Map<String, String> postParams) {
        this(UmpResultType.SUCCESS, postParams);
    }
        
    public UmpPostResult(UmpResultType umpResultType) {
        super(umpResultType);
        postParams = null;
    }
}