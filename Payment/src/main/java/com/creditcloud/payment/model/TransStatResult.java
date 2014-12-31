/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.TransStat;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
public class TransStatResult extends BaseObject {

    private static final long serialVersionUID = 20131113L;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @PnRDate
    private String OrdDate;

    @NotNull
    private QueryTransType QueryTransType;

    private TransStat TransStat;

    private BigDecimal TransAmt;

    private String TrxId;

    public TransStatResult(String OrdId,
                           String OrdDate,
                           QueryTransType QueryTransType,
                           TransStat TransStat,
                           BigDecimal TransAmt,
                           String TrxId) {
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.QueryTransType = QueryTransType;
        this.TransStat = TransStat;
        this.TransAmt = TransAmt;
        this.TrxId = TrxId;
    }
}
