/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.api;

import com.creditcloud.corporation.factoring.Factoring;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 保理项目
 *
 * @author rooseek
 */
@Remote
public interface FactoringService {

    /**
     * create if not exist, update if exist
     *
     * @param clientCode
     * @param factoring
     * @return
     */
    public Factoring save(String clientCode, Factoring factoring);

    /**
     *
     * @param clientCode
     * @param Id
     * @return
     */
    public Factoring getById(String clientCode, String Id);

    /**
     * 按照保理公司列出保理项目
     *
     * @param clientCode
     * @param factoringCorporation
     * @param info
     * @return
     */
    public PagedResult<Factoring> listByFactoringCorporation(String clientCode, String factoringCorporation, PageInfo info);

    /**
     * 按照融资企业列出保理项目
     *
     * @param clientCode
     * @param financeCorporation
     * @param info
     * @return
     */
    public PagedResult<Factoring> listByFinanceCorporation(String clientCode, String financeCorporation, PageInfo info);
}
