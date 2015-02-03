package com.creditcloud.model.user.corporation;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.user.User;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 企业用户基本信息
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class CorporationUser extends BaseObject {

    private static final long serialVersionUID = 20140217L;

    private User user;

    /**
     * corporation对应的user不一定是企业法人,所以可以额外指定某个人用户为企业法人
     */
    private String legalPersonId;

    //企业全称
    @NotNull
    @Size(max = CorporationConstant.MAX_CORP_NAME)
    private String name;

    //简称
    @Size(max = CorporationConstant.MAX_CORP_NAME)
    private String shortName;

    //组织结构代码
    @NotNull
    @Size(max = CorporationConstant.ORG_CODE_LEN)
    private String orgCode;

    //营业执照编号
    @NotNull
    @Size(max = CorporationConstant.BUSI_CODE_LEN)
    private String busiCode;

    //税务登记号
    @NotNull
    @Size(max = CorporationConstant.TAX_CODE_LEN)
    private String taxCode;

    //企业合同章特征码
    @Size(max = CorporationConstant.CONTRACT_SEAL_CODE_LEN)
    private String contractSealCode;
    
    @NotNull
    private CorporationType type;

    //营业执照上的公司类型
    @Size(max = CorporationConstant.MAX_CORP_CTG_LEN)
    private String category;
    
    //开户银行许可证
    @Size(max = CorporationConstant.BANK_LICENSE_LEN)
    private String bankLicense;

    
    /**
     * 是否第三方机构
     * 
     * @deprecated 临时解决方案，将移除
     */
    @Deprecated
    private boolean rtpo;
    
    public CorporationUser(User user,
                           String name,
                           String shortName,
                           String orgCode,
                           String busiCode,
                           String taxCode,
                           CorporationType type,
                           String category,
                           String legalPersonId) {
        this.user = user;
        this.name = name;
        this.shortName = shortName;
        this.orgCode = orgCode;
        this.busiCode = busiCode;
        this.taxCode = taxCode;
        this.type = type;
        this.category = category;
        this.legalPersonId = legalPersonId;
    }
 
    public CorporationUser(User user,
                           String name,
                           String shortName,
                           String orgCode,
                           String busiCode,
                           String taxCode,
                           CorporationType type,
                           String category,
                           String legalPersonId,
                           Boolean rtpo,
                           String bankLicense) {
        this.user = user;
        this.name = name;
        this.shortName = shortName;
        this.orgCode = orgCode;
        this.busiCode = busiCode;
        this.taxCode = taxCode;
        this.type = type;
        this.category = category;
        this.legalPersonId = legalPersonId;
        this.rtpo = rtpo;
        this.bankLicense = bankLicense;
    }

    public String getUserId() {
        return user == null ? null : user.getId();
    }

    /**
     * for jsp display
     *
     * @return
     */
    public String getId() {
        return getUserId();
    }

    /**
     * for jsp display
     *
     * @return
     */
    public String getLoginName() {
        return user == null ? null : user.getLoginName();
    }

    /**
     * for jsp display
     *
     * @return
     */
    public String getUserName() {
        return user == null ? null : user.getName();
    }

    /**
     * for jsp display
     *
     * @return
     */
    public Date getLastLoginDate() {
        return user == null ? null : user.getLastLoginDate();
    }

    /**
     * for jsp display
     *
     * @return
     */
    public Date getRegisterDate() {
        return user == null ? null : user.getRegisterDate();
    }

    /**
     * 
     * @return 
     */
    public String getUserIdNumber() {
        return user == null ? null : user.getIdNumber();
    }
    
    /**
     * 
     * @return 
     */
    public String getUserMobile() {
        return user == null ? null : user.getMobile();
    }
    
    /**
     * 
     * @return 
     */
    public String getUserEmail() {
        return user == null ? null : user.getEmail();
    }
    
    
}
