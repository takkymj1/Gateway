/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.model.BaseObject;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class QueryCardResult extends BaseObject {

    private String UsrCustId;

    private String CardId;

    private List<CardInfoResult> cardInfoResult;

    public QueryCardResult(String UsrCustId,
                           String CardId,
                           List<CardInfoResult> cardInfoResult) {
        this.UsrCustId = UsrCustId;
        this.CardId = CardId;
        this.cardInfoResult = cardInfoResult;
    }
}
