/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idcard.api;

import com.creditcloud.model.misc.CheckIDResult;
import javax.ejb.Remote;

/**
 * 身份证查询相关API
 *
 * @author sobranie
 */
@Remote
public interface IDCardService {

    /**
     * 查询给定的身份证号码和姓名是否匹配.
     *
     * 如匹配回返回CheckIDResult，包含了所有状态信息和照片
     *
     * @param clientCode
     * @param idNumber
     * @param name
     * @return
     */
    CheckIDResult check(String clientCode,
                        String idNumber,
                        String name);

    /**
     * 快速检查是否一致，不返回任何其他信息
     * 
     * @param clientCode
     * @param idNumber
     * @param name
     * @return 
     */
    boolean quickCheck(String clientCode,
                       String idNumber,
                       String name);
}
