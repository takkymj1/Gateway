/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.va.api;

import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.va.model.VirtualAccount;
import java.util.List;
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
    
    /**
     * 获取某个Owner的虚拟账户列表.
     * 
     * @param owner 虚拟账户所有者
     * @return 
     */
    List<VirtualAccount> listVirtualAccountsByOwner(RealmEntity owner);
    
    /**
     * 获取某个Owner的主要虚拟账户
     * 
     * @param owner
     * @return 
     */
    VirtualAccount getPrimaryVirtualAccountByOwner(RealmEntity owner);
}
