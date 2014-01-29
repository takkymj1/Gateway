/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.chinapnr.base.UserRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class QueryCardInfoRequest extends UserRequest {

    private String CardId;

    public QueryCardInfoRequest(String MerCustId, String UsrCustId, String CardId) {
        super(CmdIdType.QueryCardInfo, MerCustId, UsrCustId);
        this.CardId = CardId;
    }

    @Override
    public String chkString() {
        return baseChkString().concat(StringUtils.trimToEmpty(getCardId()));
    }
}
