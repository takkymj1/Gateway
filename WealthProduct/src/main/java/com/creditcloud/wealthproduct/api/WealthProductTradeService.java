/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.api;

import com.creditcloud.wealthproduct.enums.AppointResult;
import com.creditcloud.wealthproduct.enums.PurchaseResult;
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
     * @param clientCode
     * @param productId
     * @param amount
     * @param userId
     * @return
     */
    AppointResult appoint(String clientCode, String productId, int amount, String userId);

    /**
     * purchase wealth product
     *
     * @param clientCode
     * @param productId
     * @param amount
     * @param userId
     * @return
     */
    PurchaseResult purchase(String clientCode, String productId, int amount, String userId);

    /**
     * settle a wealth product
     *
     * @param clientCode
     * @param productId
     * @return
     */
    boolean settle(String clientCode, String productId);

    /**
     *
     * @param clientCode
     * @param productId
     * @param purchaseId
     * @return
     */
    boolean cancelPurchase(String clientCode, String productId, String purchaseId);

    /**
     *
     * @param clientCode
     * @param productId
     * @return
     */
    boolean repay(String clientCode, String productId);

    /**
     * redeem a certain purchase from wealth product
     *
     * @param clientCode
     * @param productId
     * @param purchaseId
     * @return
     */
    boolean redeem(String clientCode, String productId, String purchaseId);
}
