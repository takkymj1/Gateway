/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model.fuiou;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.collections.CollectionUtils;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement(name = "qrytransrsp")  
@XmlType(propOrder = { "trans" })
public class QueryResponse extends BaseResponse{
  
    @XmlElement(name = "trans") 
    private List<FuiouTransaction> trans;
    
    public QueryResponse(String ret,
                         String memo,
                         List<FuiouTransaction> trans) {
        super(ret, memo);
        this.trans = trans;
    }
    
    public boolean hasTrans() {
        return CollectionUtils.isNotEmpty(getTrans());
    }
}
