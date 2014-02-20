package com.creditcloud.user.corporation;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 企业基本信息
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class Corporation extends BaseObject {

    private static final long serialVersionUID = 20140217L;

    private String id;

    //企业全称
    @NotNull
    @Size(max = CorporationConstant.MAX_CORP_NAME)
    private String name;

    //简称
    @Size(max = CorporationConstant.MAX_CORP_NAME)
    private String shortName;

    //组织结构代码
    @NotNull
    @Size(min = CorporationConstant.ORG_CODE_LEN, max = CorporationConstant.ORG_CODE_LEN)
    private String orgCode;

    //营业执照编号
    @NotNull
    @Size(min = CorporationConstant.BUSI_CODE_LEN, max = CorporationConstant.BUSI_CODE_LEN)
    private String busiCode;

    //税务登记号
    @NotNull
    @Size(min = CorporationConstant.TAX_CODE_LEN, max = CorporationConstant.TAX_CODE_LEN)
    private String taxCode;

    private CorporationType type;

    public Corporation(String id,
                       String name,
                       String shortName,
                       String orgCode,
                       String busiCode,
                       String taxCode,
                       CorporationType type) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.orgCode = orgCode;
        this.busiCode = busiCode;
        this.taxCode = taxCode;
        this.type = type;
    }
}