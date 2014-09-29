/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import java.math.BigDecimal;

/**
 *
 * @author rooseek
 */
public interface CrowdFundingTradeService {

    /**
     *
     * @param clientCode
     * @param projectId
     * @param amount
     * @return
     */
    public boolean invest(String clientCode, String projectId, BigDecimal amount);

    /**
     *
     * @param clientCode
     * @param investId
     * @return
     */
    public boolean investCancel(String clientCode, String investId);

    /**
     *
     * @param clientCode
     * @param projectId
     * @param amount
     * @return
     */
    public boolean loan(String clientCode, String projectId, BigDecimal amount);
}
