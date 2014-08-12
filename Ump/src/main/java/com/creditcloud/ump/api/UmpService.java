/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.api;

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
    public void registerPerson(String clientCode, String custId, String custName, String idType, String idCode, String mobileId);
    
}
