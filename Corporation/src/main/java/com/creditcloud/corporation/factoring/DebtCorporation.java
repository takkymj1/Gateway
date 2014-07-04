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
 * 债务企业
 *
 * @author rooseek
 */
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@XmlRootElement
public class DebtCorporation extends Corporation {

    private static final long serialVersionUID = 20140702L;
    
    public DebtCorporation(String id,
                    String name,
                    String shortName,
                    String orgCode,
                    String busiCode,
                    String taxCode,
                    String Description) {
        super(id, name, shortName, orgCode, busiCode, taxCode, Description);
    }
}
