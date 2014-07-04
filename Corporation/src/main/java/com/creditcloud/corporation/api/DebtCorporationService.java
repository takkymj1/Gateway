/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.api;

import com.creditcloud.corporation.factoring.DebtCorporation;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface DebtCorporationService {

    /**
     * create if not exist, update if exist
     *
     * @param clientCode
     * @param debtCorporation
     * @return
     */
    public DebtCorporation save(String clientCode, DebtCorporation debtCorporation);

    /**
     *
     * @param clientCode
     * @param id
     * @return
     */
    public DebtCorporation getById(String clientCode, String id);

    /**
     *
     * @param clientCode
     * @param debtCorporation
     */
    @Deprecated
    public void delete(String clientCode, String debtCorporation);
}
