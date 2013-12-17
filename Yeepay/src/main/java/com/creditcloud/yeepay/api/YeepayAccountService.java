/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.yeepay.api;

import com.creditcloud.yeepay.model.ClientAccount;
import com.creditcloud.yeepay.model.SubAccountType;
import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 * 与易宝支付中商户账户相关的服务接口
 * 
 * @author sobranie
 */
@Remote
public interface YeepayAccountService {
    
    /**
     * 返回应用记录的商户账户信息，不是易宝方面的记录
     * 
     * @return 
     */
    ClientAccount queryBalance();
    
    /**
     * 收取服务费的记账
     * 
     * @param amount 
     */
    void gainService(BigDecimal amount);
    
    /**
     * 收取风险金的记账
     * 
     * @param amount 
     */
    void takingRisk(BigDecimal amount);
    
    /**
     * 扣减风险金，垫付时用
     * 
     * @param amount 
     */
    void deductRisk(BigDecimal amount);
    
    /**
     * 商户存入资金，只到基本（往来）账户
     * 
     * @param amount 
     */
    void deposit(BigDecimal amount);
    
    /**
     * 商户从基本（往来）账户取款
     * 
     * @param amount
     * @return 是否成功，有可能余额不足
     */
    boolean withdraw(BigDecimal amount);
    
    /**
     * 商户子账户之间调账
     * 
     * @param outAccout 出账账户
     * @param intAccount 入账账户
     * @param amount 金额
     * @return 出账金额不能大于出账子账户余额，否则返回false
     */
    boolean transfer(SubAccountType outAccout,
                     SubAccountType intAccount,
                     BigDecimal amount);
}
