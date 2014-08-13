/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.api;

import com.creditcloud.model.enums.user.credit.ProofType;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import javax.ejb.Remote;

/**
 * 联动优势(UMP)相关服务
 * 
 * @author kdliu
 */
@Remote
public interface UmpService {
    
    /**
     * 个人用户注册
     * 
     * @param custName
     * @param custId
     * @param idType
     * @param idCode
     * @param mobileId
     * @param email 
     */
    public void registerUmpUser(String clientCode, String custId, String custName, String idType, String idCode, String mobileId);
    
    /**
     * 个人用户绑定银行卡
     * 
     * @param clientCode
     * @param umpUserId
     * @param accountId
     * @param accountName
     * @param type
     * @param idCode 
     */
    public void bindCard(String clientCode, String umpUserId, String accountId, String accountName, ProofType type, String idCode);
    
    /**
     * 获得请求的签名值
     * 
     * @param clientCode
     * @param baseRequest
     * @return 
     */
    public String getSignValue(String clientCode, BaseRequest baseRequest);
    
    
}
