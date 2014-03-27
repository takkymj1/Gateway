/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.enums;

/**
 * 借款合同类型
 *
 * @author rooseek
 */
public enum LoanContractType {

    /**
     * 一对一合同，借款和所有投标只对应一个合同
     */
    OneToOne,
    /**
     * 一对多合同，每个投标对应一个合同
     */
    OneToMany,
    /**
     * 上述两种合同都需要
     */
    Both;

}
