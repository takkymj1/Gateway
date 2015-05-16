/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.user.corporation.CorporationConstant;
import java.util.Date;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class Corporation extends BaseObject {

    private static final long serialVersionUID = 20140702;

    private String id;

    //企业全称
    @Size(max = CorporationConstant.MAX_CORP_NAME)
    @FormParam("name")
    private String name;

    //企业名简称
    @Size(max = CorporationConstant.MAX_CORP_NAME)
    private String shortName;

    //组织结构代码
    @Size(max = CorporationConstant.ORG_CODE_LEN)
    @FormParam("orgCode")
    private String orgCode;

    //营业执照编号
    @Size(max = CorporationConstant.BUSI_CODE_LEN)
    private String busiCode;

    //税务登记号
    @Size(max = CorporationConstant.TAX_CODE_LEN)
    private String taxCode;

    @Size(max = CorporationConstant.MAX_CORP_DESC)
    private String description;

    private Date timeCreated;

    private Date timeLastUpdated;

    public Corporation(String id,
                       String name,
                       String shortName,
                       String orgCode,
                       String busiCode,
                       String taxCode,
                       String description) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.orgCode = orgCode;
        this.busiCode = busiCode;
        this.taxCode = taxCode;
        this.description = description;
    }
}
