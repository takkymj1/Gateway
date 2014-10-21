/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.impl;

import com.creditcloud.service.MarketControlService;

/**
 * general portal for all impl in Market</p>
 * no need to update every branch any more.
 *
 * @author rooseek
 */
public abstract class AbstractMarketControlService implements MarketControlService {

    @Override
    public boolean cancelLoan(String clientCode, String loanId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cancelFundingInvest(String clientCode, String investId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cancelFundingProject(String clientCode, String projectId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
