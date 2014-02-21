/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class DelCardRequest extends UserRequest {

    @NotNull
    @Size(max = 40)
    private String CardId;

    public DelCardRequest(String MerCustId, String UsrCustId, String CardId) {
        super(CmdIdType.DelCard, MerCustId, UsrCustId);
        this.CardId = CardId;
    }

    @Override
    public String chkString() {
        return baseChkString().concat(StringUtils.trimToEmpty(getCardId()));
    }
}
