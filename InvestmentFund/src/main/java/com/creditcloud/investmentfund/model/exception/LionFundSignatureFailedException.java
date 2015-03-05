/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.exception;

import com.creditcloud.model.exception.CreditCloudException;

/**
 * 诺安基金签名异常
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class LionFundSignatureFailedException extends CreditCloudException {

    private static final long serialVersionUID = 20150305L;
    
    public LionFundSignatureFailedException() {
    }

    public LionFundSignatureFailedException(String message) {
        super(message);
    }

    public LionFundSignatureFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public LionFundSignatureFailedException(Throwable cause) {
        super(cause);
    }
}
