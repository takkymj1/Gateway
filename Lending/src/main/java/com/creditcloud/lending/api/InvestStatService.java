/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.loan.LoanInvestStatistics;

/**
 *
 * @author rooseek
 */
public interface InvestStatService {

    LoanInvestStatistics getLoanInvestStatistics(String userId);
}
