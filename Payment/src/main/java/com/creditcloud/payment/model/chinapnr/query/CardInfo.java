/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.model.BaseObject;
import com.creditcloud.payment.model.chinapnr.enums.ExpressFlag;
import com.creditcloud.payment.model.chinapnr.enums.IsDefault;
import com.creditcloud.payment.model.chinapnr.enums.RealFlag;
import javax.validation.constraints.NotNull;
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
public class CardInfo extends BaseObject {

    @NotNull
    private String MerCustId;

    @NotNull
    private String UsrCustId;

    @NotNull
    private String UsrName;

    @NotNull
    private String CertId;

    @NotNull
    private String BankId;

    @NotNull
    private String CardId;

    @NotNull
    private RealFlag RealFlag;

    @NotNull
    private String UpdDateTime;

    @NotNull
    private String ProvId;

    @NotNull
    private String AreaId;

    @NotNull
    private IsDefault IsDefault;

    /**
     * 参数 UsrCardInfolist 的二级参数
     * 
     * @return
     */
    private ExpressFlag ExpressFlag;
    
}
