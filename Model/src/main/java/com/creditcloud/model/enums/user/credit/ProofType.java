/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.credit;

import com.creditcloud.model.enums.BaseEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 证明类型，对基本认证类型的扩展
 *
 * @author rooseek
 */
public enum ProofType implements BaseEnum {

    IDCARD("身份证证明", CertificateType.ID),
    HUKOU("户口本证明", CertificateType.ID),
    DRIVELICENSE("驾照证明", CertificateType.ID),
    MARITAL("婚姻证明", CertificateType.ID),
    BANKACCOUNT("银行流水",CertificateType.INCOME);

    private final String key;

    private final CertificateType certificateType;

    private ProofType(String key, CertificateType certificateType) {
        this.key = key;
        this.certificateType = certificateType;
    }

    private static final HashMap<CertificateType, List<ProofType>> proofMap = new HashMap<>();

    static {
        for (CertificateType type : CertificateType.values()) {
            proofMap.put(type, new ArrayList<ProofType>());
        }
        for (ProofType type : ProofType.values()) {
            proofMap.get(type.getCertificateType()).add(type);
        }
    }

    @Override
    public String getKey() {
        return key;
    }

    public CertificateType getCertificateType() {
        return certificateType;
    }

    /**
     * list related proof type by certificate type
     *
     * @param type
     * @return
     */
    public List<ProofType> listByCertificate(CertificateType type) {
        return proofMap.get(key);
    }
}
