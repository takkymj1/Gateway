/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.enums.SaveLoanRewardResult;
import com.creditcloud.model.loan.LoanReward;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanRewardService {


    /**
     * 如果添加更新成功返回LoanReward,否则返回null
     *
     * @param reward
     * @param overwrite 如果与现有奖励金额区间重合是否覆盖
     * @return
     */
    public SaveLoanRewardResult save(LoanReward reward, boolean overwrite);

    public List<LoanReward> listByLoan(String loanId);

    public int countByLoan(String loanId);
}
