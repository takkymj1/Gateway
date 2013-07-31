/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.Proof;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface ProofService {

    /**
     * submit proof
     *
     * @param clientCode
     * @param proof
     * @return true if successful
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean submitProof(String clientCode, Proof proof);

    /**
     * list proof by user id
     *
     * @param clientCode
     * @param userId
     * @return empty list if found nothing
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<Proof> listByUserId(String clientCode, String userId);
}
