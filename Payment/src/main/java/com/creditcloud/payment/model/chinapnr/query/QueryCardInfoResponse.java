/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryCardInfoResponse extends UserResponse {

    private String CardId;
    
    private List<CardInfo> UsrCardInfoList;

    @Override
    public String chkString() {
        return baseChkString().concat(StringUtils.trimToEmpty(getCardId()));
    }
}
