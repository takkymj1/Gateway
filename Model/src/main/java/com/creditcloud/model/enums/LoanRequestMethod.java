/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * loan request purpose
 *
 */
public enum LoanRequestMethod {

    //按月付息到期还本	MonthlyInterest
    //等额本息			EqualInstallment
    //等额本金			EqualPrincipal	（这个可能不需要）
    //一次性还本付息		BulletRepayment
    MonthlyInterest, EqualInstallment, BulletRepayment
}
