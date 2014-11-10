/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.loan.LoanPurpose;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 平台贷款的统计
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class LoanOverallStat extends BaseObject {

    private static final long serialVersionUID = 20131029L;

    /**
     * 按贷款状态统计
     */
    private List<LoanStat<LoanStatus>> statusStat;

    /**
     * 按还款方式统计
     */
    private List<LoanStat<RepaymentMethod>> methodStat;

    /**
     * 按来源统计
     */
    private List<LoanStat<Source>> sourceStat;

    /**
     * 按有无抵押统计
     */
    private List<LoanStat<Boolean>> mortgagedStat;

    /**
     * 按贷款用途
     */
    private List<LoanStat<LoanPurpose>> purposeStat;

    /**
     * 按经办人
     */
    private List<LoanStat<String>> employeeStat;
}
