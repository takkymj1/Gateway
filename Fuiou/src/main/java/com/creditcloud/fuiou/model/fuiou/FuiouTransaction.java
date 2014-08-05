/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model.fuiou;

import com.creditcloud.fuiou.model.FuiouDate;
import com.creditcloud.model.BaseObject;
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
@XmlRootElement(name="trans")
@XmlType(propOrder={"merdt", "orderno", "accntno", "accntnm", "amt", "entseq", "memo", "state", "result", "reason"})
public class FuiouTransaction extends BaseObject{
    
    @NotNull
    @FuiouDate
    private String merdt;
            
    @NotNull
    @Size(max = 30)
    private String orderno;

    @NotNull
    @Size(max = 30)
    private String accntno;

    @NotNull
    @Size(max = 30)
    private String accntnm;

    @NotNull
    @Size(max = 12)
    private String amt;

    @Size(max = 32)
    private String entseq;

    @Size(max = 14)
    private String memo;

    @NotNull
    @Size(max = 11)
    private String state;

    @Size(max = 1)
    private String result;

    @Size(max = 20)
    private String reason;
    
    public FuiouTransaction(String merdt,
                            String orderno,
                            String accntno,
                            String accntnm,
                            String amt,
                            String entseq,
                            String memo,
                            String state,
                            String result,
                            String reason) {
        this.merdt = merdt;
        this.orderno = orderno;
        this.accntno = accntno;
        this.accntnm = accntnm;
        this.amt = amt;
        this.entseq = entseq;
        this.memo = memo;
        this.state = state;
        this.result = result;
        this.reason = reason;
    }
    
    public FuiouTransaction(String merdt,
                            String orderno,
                            String accntno,
                            String accntnm,
                            String amt,
                            String state) {
        this.merdt = merdt;
        this.orderno = orderno;
        this.accntno = accntno;
        this.accntnm = accntnm;
        this.amt = amt;
        this.state = state;
    }
}
