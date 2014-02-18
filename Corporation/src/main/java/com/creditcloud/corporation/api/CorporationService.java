/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.api;

import com.creditcloud.corporation.model.Corporation;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface CorporationService {

    /**
     * 如果没有则添加，否则更新
     * @param clientCode
     * @param corporation
     * @return 
     */
    Corporation save(String clientCode, Corporation corporation);
    
}
