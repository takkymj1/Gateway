/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.impl;

import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.CreditAssignStatus;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.loan.CreditAssign;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.service.MarketCreditAssignService;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rooseek
 */
public class AbstractMarketCreditAssignService implements MarketCreditAssignService {

    @Override
    public void markStatus(String clientCode, CreditAssignStatus status, String... creditAssignIds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CreditAssign getById(String clientCode, String creditAssignId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<CreditAssign> list(String clientCode, Date from, Date to, PageInfo info, CreditAssignStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<CreditAssign> list(String clientCode, PageInfo info, CreditAssignStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<CreditAssign> list(String clientCode, CriteriaInfo criteriaInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CreditAssign> listByOriginalInvest(String clientCode, String investId, CreditAssignStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<Invest> listInvest(String clientCode, String creditAssignId, InvestStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean markStatus(String clientCode, String creditAssignId, CreditAssignStatus status, int bidNumber, BigDecimal bidAmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
