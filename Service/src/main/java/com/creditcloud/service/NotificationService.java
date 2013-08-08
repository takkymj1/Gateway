/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

/**
 * system notifications from CreditManager to users in CreditMarket
 *
 * @author rooseek
 */
public interface NotificationService {

    /**
     * 
     * @param clientCode
     * @param userId
     * @param title
     * @param content 
     */
    void notify(String clientCode, String userId, String title, String content);
}
