/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.PlatformRepayment;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 * 获取平台回款计划的服务接口
 */
@Remote
public interface PlatformRepayService {

    /**
     * 根据Id获取平台回款记录
     * @param id
     * @return 
     */
    PlatformRepayment find(String id);

    /**
     * 根据标的Id获取还款计划对应的平台回款计划
     * @param loanId
     * @return 
     */
    List<PlatformRepayment> listByLoanId(String loanId);

    /**
     * 创建平台回款计划信息
     * @param platformRepayment
     * @return 
     */
    PlatformRepayment create(PlatformRepayment platformRepayment);

    /**
     * 根据还款计划的Id、currentPeriod来获取对应的平台回款计划，如果没有则根据标的金额，期限，综合利率，还款方式和结标时间来创建平台回款计划
     * @param loanRepaymentId     标的还款id
     * @param currentPeriod       标的当前的期数
     * @param amount              标的金额
     * @param duration            标的期限
     * @param comprehensiveRate   标的对应平台的综合利率
     * @param method              标的还款方式
     * @param timeSettled         标的结标时间
     * @return 
     */
    PlatformRepayment getByLoanRepayment(String loanRepaymentId, int currentPeriod, int amount, Duration duration, int comprehensiveRate, RepaymentMethod method, Date timeSettled);
}
