/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.model.BaseObject;
import com.creditcloud.payment.model.chinapnr.enums.TransStat;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 取现对账记录，汇付2.0接口
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class CashReconciliation2 extends BaseObject {

    private static final long serialVersionUID = 20140211L;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 16)
    private String MerCustId;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    private String CardId;

    @NotNull
    private BigDecimal TransAmt;

    @NotNull
    @Size(min = 1, max = 1)
    private TransStat TransStat;

    @NotNull
    private String PnrDate;

    @NotNull
    private String PnrSeqId;

    @NotNull
    @Size(max = 14)
    private BigDecimal FeeAmt;

    @NotNull
    @Size(max = 14)
    private String ServFee;

    @NotNull
    @Size(max = 9)
    private String ServFeeAcctId;

}