/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.va.api;

import com.creditcloud.va.model.VirtualAccount;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface VirtualAccountService {
    
    /**
     * 获取平台虚拟账户
     * 
     * @return 
     */
    VirtualAccount getMainAccount();
    
}
