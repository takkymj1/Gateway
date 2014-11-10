/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.loan.LoanPurpose;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 贷款申请总和统计
 *
 * @author rooseek
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class RequestOverallStat extends BaseObject {

    private static final long serialVersionUID = 20131029L;

    /**
     * 按申请状态
     */
    private List<LoanStat<LoanRequestStatus>> statusStat;

    /**
     * 按申请用途
     */
    private List<LoanStat<LoanPurpose>> purposeStat;

    /**
     * 按还款方式
     */
    private List<LoanStat<RepaymentMethod>> methodStat;

    /**
     * 按来源
     */
    private List<LoanStat<Source>> sourceStat;

    /**
     * 按有无抵押
     */
    private List<LoanStat<Boolean>> mortgagedStat;

    /**
     * 按经办员工
     */
    private List<LoanStat<String>> employeeStat;
}
