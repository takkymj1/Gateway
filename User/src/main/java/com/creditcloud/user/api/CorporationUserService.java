/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.corporation.CorporationUser;
import com.creditcloud.model.user.corporation.CorporationInfo;
import com.creditcloud.model.user.corporation.CorporationType;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface CorporationUserService {

    /**
     * 如果没有则添加，否则更新,TODO目前只支持从后台添加
     *
     * @param clientCode
     * @param corporationUser
     * @return
     */
    CorporationUser save(String clientCode, CorporationUser corporationUser);

    /**
     * 查看user是否是企业用户
     *
     * @param clientCode
     * @param userId
     * @return
     */
    boolean isCorporationUser(String clientCode, String userId);

    /**
     * 更新CorporationUserInfo
     *
     * @param clientCode
     * @param info
     * @return
     */
    CorporationInfo updateInfo(String clientCode, CorporationInfo info);

    /**
     * 根据唯一Id获取
     *
     * @param clientCode
     * @param corpId
     * @return
     */
    CorporationUser getById(String clientCode, String corpId);

    /**
     * 获取CorporationInfo
     *
     * @param clientCode
     * @param id
     * @return
     */
    CorporationInfo getInfoById(String clientCode, String id);

    /**
     * 根据企业名称获取
     *
     * @param clientCode
     * @param name
     * @return
     */
    CorporationUser getByName(String clientCode, String name);

    /**
     * 根据营业执照获取
     *
     * @param clientCode
     * @param busiCode
     * @return
     */
    CorporationUser getByBusiCode(String clientCode, String busiCode);

    /**
     * 根据税务登记号获取
     *
     * @param clientCode
     * @param taxCode
     * @return
     */
    CorporationUser getByTaxCode(String clientCode, String taxCode);

    /**
     * 根据组织机构代码获取
     *
     * @param clientCode
     * @param orgCode
     * @return
     */
    CorporationUser getByOrgCode(String clientCode, String orgCode);

    /**
     *
     * @param clientCode
     * @param info
     * @param type
     * @return
     */
    PagedResult<CorporationUser> listByType(String clientCode, PageInfo info, CorporationType... type);

    /**
     *
     * @param clientCode
     * @param info
     * @return
     */
    PagedResult<CorporationUser> list(String clientCode, CriteriaInfo info);

    /**
     * 列出所有企业用户
     *
     * @param clientCode
     * @return
     */
    List<CorporationUser> listAll(String clientCode);

    /**
     * 列出法人下面所有的企业
     *
     * @param clientCode
     * @param legalPersonId
     * @return
     */
    List<CorporationUser> listByLegalPerson(String clientCode, String legalPersonId);

    /**
     * 列出所有企业用户的法人,剔除重复
     *
     * @param clientCode
     * @return
     */
    List<String> listLegalPerson(String clientCode);

    /**
     * 查看是否是法人
     *
     * @param clientCode
     * @param legalPersonId
     * @return
     */
    boolean checkLegalPerson(String clientCode, String legalPersonId);
    /**
     * 列出是否属于合作企业信息列表
     *
     * @param clientCode
     * @param rtpo
     * @return
     */
    List<CorporationUser> listByRtpo(String clientCode, Boolean rtpo);
    
    
   /**
     * 根据企业名称模糊查找企业
     *
     * @param clientCode
     * @param name
     * @return
     */
    List<com.creditcloud.model.user.corporation.CorporationUser>  listByName(String clientCode, String name) ;
}
 