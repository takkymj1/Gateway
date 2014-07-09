/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.api;

import com.creditcloud.corporation.factoring.FinanceCorporation;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface FinanceCorporationService {

    /**
     * create if not exist, update if exist
     *
     * @param clientCode
     * @param financeCorporation
     * @return
     */
    public FinanceCorporation save(String clientCode, FinanceCorporation financeCorporation);

    /**
     *
     * @param clientCode
     * @param id
     * @return
     */
    public FinanceCorporation getById(String clientCode, String id);

    /**
     * 按照企业名查找
     *
     * @param clientCode
     * @param factoringCorporation
     * @param name
     * @return
     */
    public FinanceCorporation getByName(String clientCode, String factoringCorporation, String name);

    /**
     * 按照营业许可证查找
     *
     * @param clientCode
     * @param factoringCorporation
     * @param busiCode
     * @return
     */
    public FinanceCorporation getByBusiCode(String clientCode, String factoringCorporation, String busiCode);

    /**
     * 按照税务登记号查找
     *
     * @param clientCode
     * @param factoringCorporation
     * @param taxCode
     * @return
     */
    public FinanceCorporation getByTaxCode(String clientCode, String factoringCorporation, String taxCode);

    /**
     * 按照组织结构代码查找
     *
     * @param clientCode
     * @param factoringCorporation
     * @param orgCode
     * @return
     */
    public FinanceCorporation getByOrgCode(String clientCode, String factoringCorporation, String orgCode);

    /**
     * 按照银行开户许可证查找
     *
     * @param clientCode
     * @param factoringCorporation
     * @param bankLicense
     * @return
     */
    public FinanceCorporation getByBankLicense(String clientCode, String factoringCorporation, String bankLicense);

    /**
     * 按照保理公司列出融资企业
     *
     * @param clientCode
     * @param factoringCorporation
     * @param pageInfo
     * @return
     */
    public PagedResult<FinanceCorporation> listByFactoringCorporation(String clientCode, String factoringCorporation, PageInfo pageInfo);

    /**
     *
     * @param clientCode
     * @param financeCorporation
     */
    @Deprecated
    public void delete(String clientCode, String financeCorporation);
}
