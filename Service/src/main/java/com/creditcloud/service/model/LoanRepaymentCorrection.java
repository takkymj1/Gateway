/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * wrap information needed to correct a loan repayment item
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class LoanRepaymentCorrection extends BaseObject {

    private static final long serialVersionUID = 20140826L;

    private String loanId;

    private int period;

    /**
     * 利息增量
     */
    private BigDecimal interestDelta = BigDecimal.ZERO;

}
