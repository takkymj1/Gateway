/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.user.proof.ProofContent;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Proof extends BaseObject {

    @NotNull
    private String title;

    @NotNull
    private ProofContent type;

    @NotNull
    private String proof;

    private String description;

    public Proof() {
    }

    public Proof(String title,
                 ProofContent type,
                 String proof) {
        this(title, type, proof, null);
    }

    public Proof(String title,
                 ProofContent type,
                 String proof,
                 String description) {
        this.title = title;
        this.type = type;
        this.proof = proof;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public ProofContent getType() {
        return type;
    }

    public String getProof() {
        return proof;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(ProofContent type) {
        this.type = type;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
