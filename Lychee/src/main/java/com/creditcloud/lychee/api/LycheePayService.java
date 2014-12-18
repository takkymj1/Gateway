/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lychee.api;

import com.creditcloud.lychee.model.LycheePayAccount;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LycheePayService {
    /**
     * 根据userId获取快付通账户信息
     * @param userId
     * @return 
     */
    public LycheePayAccount getByUserId(String userId);
}
