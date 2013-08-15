/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.Proof;
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
     * delete by proof Id,
     *
     * @param clientCode
     * @param proof
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void deleteProofById(String clientCode, String proofId);
}
