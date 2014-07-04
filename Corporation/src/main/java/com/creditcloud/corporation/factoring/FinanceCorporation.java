/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.factoring;

import com.creditcloud.corporation.Corporation;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 融资企业
 *
 * @author rooseek
 */
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@XmlRootElement
public class FinanceCorporation extends Corporation {

    private static final long serialVersionUID = 20140702L;

    //银行开户许可证
    private String bankLicense;

    // 融资企业对应的保理企业
    private String factoringCorporation;

    public FinanceCorporation(String id,
                              String name,
                              String shortName,
                              String orgCode,
                              String busiCode,
                              String taxCode,
                              String description,
                              String bankLicense,
                              String factoringCorporation) {
        super(id, name, shortName, orgCode, busiCode, taxCode, description);
        this.bankLicense = bankLicense;
        this.factoringCorporation = factoringCorporation;
    }
}
