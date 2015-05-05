/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.api;

import com.creditcloud.wealthproduct.enums.PurchaseResult;
import com.creditcloud.wealthproduct.model.Subscribe;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface WealthProductTradeService {

    /**
     * appoint certain share in wealth product
     *
     * @param productId
     * @param amount
     * @param userId
     * @return
     */
    Subscribe appoint(String productId, int amount, String userId);

    /**
     * purchase wealth product
     *
     * @param productId
     * @param amount
     * @param userId
     * @return
     */
    PurchaseResult purchase(String productId, int amount, String userId);

    /**
     * settle a wealth product
     *
     * @param productId
     * @return
     */
    boolean settle(String productId);

    /**
     *
     * @param productId
     * @param purchaseId
     * @return
     */
    boolean cancelPurchase(String productId, String purchaseId);

    /**
     *
     * @param productId
     * @return
     */
    boolean repay(String productId);

    /**
     * redeem a certain purchase from wealth product
     *
     * @param productId
     * @param purchaseId
     * @return
     */
    boolean redeem(String productId, String purchaseId);
}
