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
@XmlRootElement(name = "sincomeforreq")  
@XmlType(propOrder = { "merdt", "orderno", "bankno", "accntno", "accntnm", "amt", "entseq", "memo", "mobile", "certtp", "certno" })
public class CollectRepaymentRequest extends BaseRequest{
    
    @NotNull
    @FuiouDate
    private String merdt;
            
    @NotNull
    @Size(max = 30)
    private String orderno;

    @NotNull
    @Size(max = 28)
    private String bankno;

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

    @Size(max = 11)
    private String mobile;

    @Size(max = 1)
    private String certtp;

    @Size(max = 20)
    private String certno;

    public CollectRepaymentRequest(String ver,
                                   String merdt,
                                   String orderno,
                                   String bankno,
                                   String accntno,
                                   String accntnm,
                                   String amt,
                                   String entseq,
                                   String memo,
                                   String mobile,
                                   String certtp,
                                   String certno) {
        super(ver, CmdIdType.SINCOMEFORREQ);
        this.merdt = merdt;
        this.orderno = orderno;
        this.bankno = bankno;
        this.accntno = accntno;
        this.accntnm = accntnm;
        this.amt = amt;
        this.entseq = entseq;
        this.memo = memo;
        this.mobile = mobile;
        this.certtp = certtp;
        this.certno = certno;
    }
    
    public CollectRepaymentRequest(String ver,
                                   String merdt,
                                   String orderno,
                                   String bankno,
                                   String accntno,
                                   String accntnm,
                                   String amt) {
        super(ver, CmdIdType.SINCOMEFORREQ);
        this.merdt = merdt;
        this.orderno = orderno;
        this.bankno = bankno;
        this.accntno = accntno;
        this.accntnm = accntnm;
        this.amt = amt;
    }
}
