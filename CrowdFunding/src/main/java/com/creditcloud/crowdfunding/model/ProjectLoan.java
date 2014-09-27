/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.crowdfunding.enums.ProjectLoanStatus;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@XmlRootElement
@Data
@NoArgsConstructor
public class ProjectLoan extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    @NotNull
    private String projectId;

    /**
     * loan ordinal
     */
    @NotNull
    private int ordinal;

    @NotNull
    private ProjectLoanStatus status;

    /**
     * loan amount
     */
    @NotNull
    private BigDecimal loanAmount;

    private Date timeRecorded;

    /**
     * left amount not loaned
     */
    @NotNull
    private BigDecimal leftAmount;

    /**
     * total amount raised for project
     */
    @Transient
    private BigDecimal totalAmount;

    public ProjectLoan(String id,
                       String projectId,
                       int ordinal,
                       ProjectLoanStatus status,
                       BigDecimal loanAmount,
                       BigDecimal leftAmount,
                       Date timeRecorded) {
        this.id = id;
        this.projectId = projectId;
        this.status = status;
        this.ordinal = ordinal;
        this.loanAmount = loanAmount;
        this.leftAmount = leftAmount;
        this.timeRecorded = timeRecorded;
    }
}
