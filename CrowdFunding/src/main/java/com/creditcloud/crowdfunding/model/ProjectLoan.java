/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author rooseek
 */
public class ProjectLoan {

    private String id;

    private String projectId;

    /**
     * 放款金额
     */
    private BigDecimal loanAmount;

    /**
     * 剩余未放款金额
     */
    private BigDecimal leftAmount;

    private Date timeRceorded;
}
