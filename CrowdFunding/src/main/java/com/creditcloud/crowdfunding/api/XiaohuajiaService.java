/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.enums.XiaohuajiaSignupStatus;
import com.creditcloud.crowdfunding.model.Xiaohuajia;
import com.creditcloud.crowdfunding.model.XiaohuajiaSchool;
import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author zaishu.ye@fengjr.com
 */
@Remote
public interface XiaohuajiaService {
    public PagedResult<XiaohuajiaSchool> searchSchool(CriteriaInfo criteria);
    
    public PagedResult<Xiaohuajia> findByParentIdAndAuthorName(String parentId, String authorName);
    
    public PagedResult<Xiaohuajia> findByStatus(List<XiaohuajiaSignupStatus> status, PageInfo pageInfo);
    
    public PagedResult<Xiaohuajia> findByQAndStatus(String q, List<XiaohuajiaSignupStatus> status, PageInfo pageInfo);
    
    public Xiaohuajia findById(String id);
    
    public Xiaohuajia findByZcId(String zcId);
    
    public PagedResult<Xiaohuajia> findByParentId(String parentId);
    
    public boolean add(Xiaohuajia x);
    
    public boolean upload(String id, String authorPhoto, String paintName, String paintIntroduction, String paintPicture);
    
    public boolean updateStatus(String id, XiaohuajiaSignupStatus status);
    
    public boolean zcCreated(String id, String zcId);
}
