/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.misc.Bank;
import com.creditcloud.model.enums.misc.City;
import com.creditcloud.model.enums.misc.Province;
import com.creditcloud.payment.model.chinapnr.enums.IsDefault;
import com.creditcloud.payment.model.chinapnr.enums.RealFlag;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class CardInfoResult extends BaseObject {

    @NotNull
    private String MerCustId;

    @NotNull
    private String UsrCustId;

    @NotNull
    private String UsrName;

    @NotNull
    private String CertId;

    @NotNull
    private Bank bank;

    @NotNull
    private String CardId;

    @NotNull
    private RealFlag RealFlag;

    @NotNull
    private String updateTime;

    @NotNull
    private Province province;

    @NotNull
    private City city;

    @NotNull
    private IsDefault IsDefault;

}
