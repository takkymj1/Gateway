package com.creditcloud.fund.api;

import com.creditcloud.fund.model.record.RechargeRecord;

import javax.ejb.Remote;

/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/4/10
 * Time: 14:47
 * Desc: 充值
 * To change this template use File | Settings | File Templates.
 */

@Remote
public interface RechargeService {


    /**
     * 新增充值记录
     * @param rechargeRecord
     * @return
     */
    RechargeRecord addNew(RechargeRecord rechargeRecord);

    RechargeRecord addNew(RechargeRecord rechargeRecord);

}
