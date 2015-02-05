/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.model.DisburseAccount;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author jinlzhang
 */
@Remote
public interface DisburseAccountService {
    public void addNew(DisburseAccount record);
    
    public List<DisburseAccount> listAll();
    
    /**
     * 根据是否可用查找
     * @param enable
     * @return 
     */
    public List<DisburseAccount> listByEnable(Boolean enable);

    public boolean markEnable(boolean enable, String  id);

    public DisburseAccount getById(String id);
}
