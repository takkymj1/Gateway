/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.api;

import com.creditcloud.corporation.funding.FundingCorporation;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.misc.City;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
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
    
    public PagedResult<FundingCorporation> listByCityAndIndustry(String ClientCode,
                                                                 PageInfo pageInfo,
                                                                 List<String> industryList,
                                                                 List<City> cityList,
                                                                 List<String> incomeList,
                                                                 List<String> rateList,
                                                                 List<String> positionList);
}