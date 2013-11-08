/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.loan.InvestRepayment;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestRepayService {

    /**
     * list InvestRepayment by invest id
     *
     * @param clientCode
     * @param investId
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<InvestRepayment> listRepayByInvest(String clientCode, String investId);
}
