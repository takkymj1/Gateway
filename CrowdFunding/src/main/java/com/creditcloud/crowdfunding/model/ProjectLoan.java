/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
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

    private String projectId;

    /**
     * 放款序号
     */
    private int ordinal;

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
