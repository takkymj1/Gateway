/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model.fuiou;

import com.creditcloud.fuiou.model.CmdIdType;
import com.creditcloud.fuiou.model.FuiouDate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement(name = "qrytransreq")  
@XmlType(propOrder = { "busicd", "orderno", "startdt", "enddt", "transst" })
public class QueryRequest extends BaseRequest{
    
    @NotNull
    private String busicd;

    @Size(max = 30)
    private String orderno;

    @FuiouDate
    private String startdt;
    
    @FuiouDate
    private String enddt;
            
    @Size(max = 1)
    private String transst;

    public QueryRequest(String ver,
                        String busicd,
                        String orderno,
                        String startdt,
                        String enddt,
                        String transst) {
        super(ver, CmdIdType.QRYTRANSREQ);
        this.busicd = busicd;
        this.orderno = orderno;
        this.startdt = startdt;
        this.enddt = enddt;
        this.transst = transst;
    }
    
    public QueryRequest(String ver,
                        String busicd) {
        super(ver, CmdIdType.QRYTRANSREQ);
        this.busicd = busicd;
    }
    
    public QueryRequest(String ver,
                        String busicd,
                        String orderno,
                        String transst) {
        super(ver, CmdIdType.QRYTRANSREQ);
        this.busicd = busicd;
        this.orderno = orderno;
        this.transst = transst;
    }
}
