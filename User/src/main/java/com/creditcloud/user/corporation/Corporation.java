package com.creditcloud.user.corporation;


import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.CorporationConstant;
import java.util.Date;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class Corporation extends BaseObject {

    private static final long serialVersionUID = 20140217L;

    private String id;

    //企业全称
    @Size(max = CorporationConstant.MAX_CORP_NAME)
    private String name;

    //简称
    @Size(max = CorporationConstant.MAX_CORP_NAME)
    private String shortName;

    //企业url
    @Size(max = CorporationConstant.MAX_CORP_URL)
    private String url;

    //组织结构代码
    @Size(min = CorporationConstant.ORG_CODE_LEN, max = CorporationConstant.ORG_CODE_LEN)
    private String orgCode;

    //营业执照编号
    @Size(min = CorporationConstant.BUSI_CODE_LEN, max = CorporationConstant.BUSI_CODE_LEN)
    private String busiCode;

    //税务登记号
    @Size(min = CorporationConstant.TAX_CODE_LEN, max = CorporationConstant.TAX_CODE_LEN)
    private String taxCode;

    private CorporationType type;

    private Date timeCreated;

    private Date timeLastUpdated;

    public Corporation(String id,
                       String name,
                       String shortName,
                       String url,
                       String orgCode,
                       String busiCode,
                       String taxCode,
                       CorporationType type) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.url = url;
        this.orgCode = orgCode;
        this.busiCode = busiCode;
        this.taxCode = taxCode;
        this.type = type;
    }
}