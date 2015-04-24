/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 * 系統內部业务对账
 *
 * @author rooseek
 */
@Remote
public interface FundReconService {

    /**
     * 检查所有UserFund中未还和未收是否相等，返回具体差额<p>
     * 总未还应当等于总应收
     *
     * @return
     */
    BigDecimal checkTotalDue();
}
