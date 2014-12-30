/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.payment.model.chinapnr.enums.FeeObjFlag;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class MerCashResult extends PaymentResult {

    @NotNull
    private BigDecimal TransAmt;

    @NotNull
    private BigDecimal FeeAmt;

    private FeeObjFlag FeeObjFlag;
    
    @NotNull
    private String FeeCustId;

    private String FeeAcctId;

    public MerCashResult(String RespCode, 
                         String RespDesc,
                         BigDecimal TransAmt,
                         BigDecimal FeeAmt, 
                         FeeObjFlag FeeObjFlag,
                         String FeeCustId, 
                         String FeeAcctId) {
        super(RespCode, RespDesc);
        this.TransAmt = TransAmt;
        this.FeeAmt = FeeAmt;
        this.FeeObjFlag = FeeObjFlag;
        this.FeeCustId = FeeCustId;
        this.FeeAcctId = FeeAcctId;
    }
}
