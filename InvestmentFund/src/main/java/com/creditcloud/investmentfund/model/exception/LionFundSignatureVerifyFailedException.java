/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.exception;

import com.creditcloud.model.exception.CreditCloudException;

/**
 * 诺安基金验签失败异常
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class LionFundSignatureVerifyFailedException extends CreditCloudException {

    private static final long serialVersionUID = 20150305L;
    
    public LionFundSignatureVerifyFailedException() {
    }

    public LionFundSignatureVerifyFailedException(String message) {
        super(message);
    }

    public LionFundSignatureVerifyFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public LionFundSignatureVerifyFailedException(Throwable cause) {
        super(cause);
    }
    
}
