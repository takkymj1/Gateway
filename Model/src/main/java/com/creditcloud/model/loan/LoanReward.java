/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.LoanRewardMethod;
import com.creditcloud.model.misc.Reward;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 贷款投标奖励,一个贷款可能对应到多个奖励条件
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class LoanReward extends BaseObject {

    private static final long serialVersionUID = 20140310L;

    private String id;

    @NotNull
    private String loanId;

    @NotNull
    private LoanRewardMethod method;

    private Reward reward;

    /**
     * 投标金额区间
     */
    @Min(0)
    private int minInvest;

    @Min(0)
    private int maxInvest;

}
