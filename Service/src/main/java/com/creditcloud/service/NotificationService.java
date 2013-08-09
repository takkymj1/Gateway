/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import javax.ejb.Remote;

/**
 * system notifications from CreditManager to users in CreditMarket
 *
 * @author rooseek
 */
@Remote
public interface NotificationService {

    /**
     * notify some users
     *
     * @param clientCode
     * @param userId
     * @param title
     * @param content
     */
    void notifyUser(String clientCode, String title, String content, String... userId);

    /**
     * broadcast to all users
     *
     * @param clientCode
     * @param title
     * @param content
     */
    void broadcast(String clientCode, String title, String content);

    /**
     * notify info about a loan
     *
     * @param clientCode
     * @param loanId
     * @param title
     * @param content
     */
    void notifyLoan(String clientCode, String loanId, String title, String content);
}
