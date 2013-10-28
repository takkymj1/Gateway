/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.credit;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ProofStatus implements BaseEnum {

    TODO("");

    private final String key;

    private ProofStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
