/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.api;

import com.creditcloud.corporation.funding.FundingCorporation;
import javax.ejb.Remote;

/**
 *
 * @author chai
 */
@Remote
public interface FundingCorporationService {

    /**
     * create if not exist, update if exist
     *
     * @param clientCode
     * @param financeCorporation
     * @return
     */
    public FundingCorporation save(String clientCode, FundingCorporation financeCorporation);

    /**
     *
     * @param clientCode
     * @param id
     * @return
     */
    public FundingCorporation getById(String clientCode, String id);
}
