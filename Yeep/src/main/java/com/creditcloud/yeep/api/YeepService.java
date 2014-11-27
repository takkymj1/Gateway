/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.api;

import com.creditcloud.yeep.model.YeepAccount;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface YeepService extends YeepQueryService{

    public YeepAccount getYeepAccount(String clientCode, String userId);
}
