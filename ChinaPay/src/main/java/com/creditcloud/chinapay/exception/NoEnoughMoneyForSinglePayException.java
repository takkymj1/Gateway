/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.exception;

/**
 *
 * @author guohuazhang
 */
public class NoEnoughMoneyForSinglePayException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -880871181518322810L;

    public NoEnoughMoneyForSinglePayException(String message) {
        super(message);
    }
}
