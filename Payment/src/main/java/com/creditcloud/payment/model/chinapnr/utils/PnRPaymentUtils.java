/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.utils;

import com.creditcloud.payment.model.chinapnr.transfer.BidDetail;
import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author rooseek
 */
public class PnRPaymentUtils {

    private static final String BID_DETAILS_PREFIX = "{\"BidDetails\":";

    private static final String BID_DETAILS_SUFFIX = "}";

    /**
     * convert list of BidDetail to json string
     *
     * @param bidDetails
     * @return
     */
    public static String bidDetailToJsonString(List<BidDetail> bidDetails) {
        Gson gson = new Gson();
        String result = gson.toJson(bidDetails);
        return BID_DETAILS_PREFIX.concat(result).concat(BID_DETAILS_SUFFIX);
    }
}
