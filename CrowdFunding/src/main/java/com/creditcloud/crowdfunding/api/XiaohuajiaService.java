/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.model.Xiaohuajia;
import com.creditcloud.crowdfunding.model.XiaohuajiaSchool;
import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 *
 * @author zaishu.ye@fengjr.com
 */
@Remote
public interface XiaohuajiaService {
    public PagedResult<XiaohuajiaSchool> searchSchool(CriteriaInfo criteria);
    
    public PagedResult<Xiaohuajia> searchXiaohuajia(CriteriaInfo criteria);
    
    public PagedResult<Xiaohuajia> findXiaohuajiaByParentIdAndAuthorName(String parentId, String authorName);
    
    public Xiaohuajia findXiaohuajiaById(String id);
    
    public PagedResult<Xiaohuajia> findXiaohuajiaByParentId(String parentId);
    
    public boolean addXiaohuajia(Xiaohuajia x);
    
    public boolean upload(String id, String authorPhoto, String paintName, String paintIntroduction, String paintPicture);
}
