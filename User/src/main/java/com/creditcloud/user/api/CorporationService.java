/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.user.corporation.Corporation;
import com.creditcloud.user.corporation.CorporationType;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface CorporationService {

    /**
     * 如果没有则添加，否则更新
     *
     * @param clientCode
     * @param corporation
     * @return
     */
    Corporation save(String clientCode, Corporation corporation);

    /**
     * 根据唯一Id获取
     *
     * @param clientCode
     * @param corpId
     * @return
     */
    Corporation getById(String clientCode, String corpId);

    /**
     * 根据企业名称获取
     *
     * @param clientCode
     * @param name
     * @return
     */
    Corporation getByName(String clientCode, String name);

    /**
     * 根据营业执照获取
     *
     * @param clientCode
     * @param busiCode
     * @return
     */
    Corporation getByBusiCode(String clientCode, String busiCode);

    /**
     * 根据税务登记号获取
     *
     * @param clientCode
     * @param taxCode
     * @return
     */
    Corporation getByTaxCode(String clientCode, String taxCode);

    /**
     * 根据组织机构代码获取
     *
     * @param clientCode
     * @param orgCode
     * @return
     */
    Corporation getByOrgCode(String clientCode, String orgCode);

    /**
     *
     * @param clientCode
     * @param info
     * @param type
     * @return
     */
    PagedResult<Corporation> listByType(String clientCode, PageInfo info, CorporationType... type);
}
