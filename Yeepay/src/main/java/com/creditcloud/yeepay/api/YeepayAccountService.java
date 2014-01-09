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
     * @param clientCode
     * @return
     */
    ClientAccount queryBalance(String clientCode);

    /**
     * 收取服务费的记账
     *
     * @param clientCode
     * @param amount     必须为正数
     */
    void gainService(String clientCode, BigDecimal amount);

    /**
     * 收取风险金的记账
     *
     * @param clientCode
     * @param amount     必须为正数
     */
    void takingRisk(String clientCode, BigDecimal amount);

    /**
     * 扣减风险金，垫付时用
     *
     * @param clientCode
     * @param amount     必须为正数
     * @return 是否成功，有可能风险金不足
     */
    boolean deductRisk(String clientCode, BigDecimal amount);

    /**
     * 商户存入资金，只到基本（往来）账户
     *
     * @param clientCode
     * @param amount     必须为正数
     */
    void deposit(String clientCode, BigDecimal amount);

    /**
     * 商户从基本（往来）账户申请取款.
     *
     * 将可用余额转为冻结余额
     *
     * @param clientCode
     * @param amount     必须为正数
     * @return 是否成功，有可能余额不足
     */
    boolean withdrawPropose(String clientCode, BigDecimal amount);

    /**
     * 商户从基本（往来）账户批准取款.
     *
     * 从冻结余额转出
     *
     * @param clientCode
     * @param amount     必须为正数
     * @return 是否成功，有可能冻结余额不足
     */
    boolean withdrawApprove(String clientCode, BigDecimal amount);

    /**
     * 商户子账户之间调账
     *
     * @param clientCode
     * @param outAccount 出账账户
     * @param intAccount 入账账户
     * @param amount     金额，必须为正数
     * @return 出账金额不能大于出账子账户余额，否则返回false
     */
    boolean transfer(String clientCode,
                     SubAccountType outAccount,
                     SubAccountType intAccount,
                     BigDecimal amount);
}
