/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.guarantee;

import com.creditcloud.corporation.Corporation;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 担保公司
 *
 * @author rooseek
 */
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@XmlRootElement
public class GuaranteeCorporation extends Corporation {

    private static final long serialVersionUID = 20140723L;
    
    /**
     * 融资性担保机构经营许可证
     */
    private String guaranteeLicense;

    public GuaranteeCorporation(String id,
                                String name,
                                String shortName,
                                String orgCode,
                                String busiCode,
                                String taxCode,
                                String description,
                                String guaranteeLicense) {
        super(id, name, shortName, orgCode, busiCode, taxCode, description);
        this.guaranteeLicense = guaranteeLicense;
    }
}
