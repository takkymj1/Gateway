/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.exception;

import com.creditcloud.model.exception.CreditCloudException;

/**
 *
 * @author guohuazhang
 */
public class LionFundMoneyFilesAlreadyProcessedException extends CreditCloudException {

    private static final long serialVersionUID = 20150305L;

    public LionFundMoneyFilesAlreadyProcessedException() {
    }

    public LionFundMoneyFilesAlreadyProcessedException(String message) {
        super(message);
    }

    public LionFundMoneyFilesAlreadyProcessedException(String message, Throwable cause) {
        super(message, cause);
    }

    public LionFundMoneyFilesAlreadyProcessedException(Throwable cause) {
        super(cause);
    }
}
