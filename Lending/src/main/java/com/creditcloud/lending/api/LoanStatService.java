/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.model.LoanAvg;
import com.creditcloud.lending.model.LoanStat;
import com.creditcloud.model.ElementCount;
import com.creditcloud.model.ElementSum;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.loan.LoanPurpose;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.List;

/**
 * not time critical queries
 *
 * @author rooseek
 */
public interface LoanStatService {

    /**
     * 统计用户的每种状态贷款数目
     *
     * @param userId
     * @param status
     * @return
     */
    public List<ElementCount<LoanStatus>> countByUserAndStatus(String userId, LoanStatus... status);

    /**
     * 按贷款状态统计贷款数
     *
     * @param status
     * @return
     */
    public List<ElementCount<LoanStatus>> countEachByStatus(LoanStatus... status);

    /**
     * 按贷款状态统计贷款金额
     *
     * @param status
     * @return
     */
    public List<ElementSum<LoanStatus>> sumEachByStatus(LoanStatus... status);

    /**
     * 按贷款状态和来源统计总数
     *
     * @param statusList
     * @param source
     * @return
     */
    public List<ElementCount<Source>> countEachBySource(List<LoanStatus> statusList, Source... source);

    /**
     * 按贷款状态和来源统计总金额
     *
     * @param statusList
     * @param source
     * @return
     */
    public List<ElementSum<Source>> sumEachBySource(List<LoanStatus> statusList, Source... source);

    /**
     * 按贷款状态和还款方式统计总数
     *
     * @param statusList
     * @param method
     * @return
     */
    public List<ElementCount<RepaymentMethod>> countEachByMethod(List<LoanStatus> statusList, RepaymentMethod... method);

    /**
     * 按贷款状态和还款方式统计总金额
     *
     * @param statusList
     * @param method
     * @return
     */
    public List<ElementSum<RepaymentMethod>> sumEachByMethod(List<LoanStatus> statusList, RepaymentMethod... method);

    /**
     * 按贷款状态和有无抵押统计总数
     *
     * @param statusList
     * @return
     */
    public List<ElementCount<Boolean>> countEachByMortgaged(List<LoanStatus> statusList);

    /**
     * 按贷款状态和有无抵押统计总金额
     *
     * @param statusList
     * @return
     */
    public List<ElementSum<Boolean>> sumEachByMortgaged(List<LoanStatus> statusList);

    /**
     * 按贷款状态综合统计
     *
     * @param status
     * @return
     */
    public List<LoanStat<LoanStatus>> countAndSumEachByStatus(LoanStatus... status);

    /**
     * 按贷款来源综合统计
     *
     * @param statusList
     * @param source
     * @return
     */
    public List<LoanStat<Source>> countAndSumEachBySource(List<LoanStatus> statusList, Source... source);

    /**
     * 按还款方式综合统计
     *
     * @param statusList
     * @param method
     * @return
     */
    public List<LoanStat<RepaymentMethod>> countAndSumEachByMethod(List<LoanStatus> statusList, RepaymentMethod... method);

    /**
     * 按有无抵押综合统计
     *
     * @param statusList
     * @return
     */
    public List<LoanStat<Boolean>> countAndSumEachByMortgaged(List<LoanStatus> statusList);

    /**
     * 按贷款用途综合统计
     *
     * @param statusList
     * @param purpose
     * @return
     */
    public List<LoanStat<LoanPurpose>> countAndSumEachByPurpose(List<LoanStatus> statusList, LoanPurpose... purpose);

    /**
     * 按经办人
     *
     * @param statusList
     * @return
     */
    public List<LoanStat<String>> countAndSumEachByEmployee(List<LoanStatus> statusList);

    /**
     * 统计所有贷款平均值
     *
     * @param status
     * @return
     */
    public LoanAvg avgByStatus(LoanStatus... status);
}
