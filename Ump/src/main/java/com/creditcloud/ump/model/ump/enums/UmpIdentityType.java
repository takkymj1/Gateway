/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.user.credit.ProofType;

/**
 *
 * @author kdliu
 */
public enum UmpIdentityType {
    IDENTITY_CARD(ProofType.ID_CARD, "IDENTITY_CARD");
    
    private ProofType proofType;
    private String umpCode;
    
    UmpIdentityType(ProofType proofType, String umpCode) {
        this.proofType = proofType;
        this.umpCode=umpCode;
    }
    
    public static UmpIdentityType getEnum(ProofType proofType) {
        for(UmpIdentityType atype : UmpIdentityType.values()) {
            if(atype.proofType.equals(proofType)) {
                return atype;
            }
        }
        return null;
    }

    public ProofType getProofType() {
        return proofType;
    }

    public String getUmpCode() {
        return umpCode;
    }

}
