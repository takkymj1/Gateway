/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.ElementCount;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.credit.CertificateType;
import com.creditcloud.model.enums.user.credit.CreditRank;
import com.creditcloud.model.enums.user.credit.ProofType;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserStatService {

    /**
     * 按来源统计用户数
     *
     * @param clientCode
     * @return
     */
    List<ElementCount<Source>> countUserBySource(String clientCode);

    /**
     * 按经办员工统计用户数
     *
     * @param clientCode
     * @param source
     * @return
     */
    List<ElementCount<String>> countUserByEmployee(String clientCode, Source... source);

    /**
     * 按来源统计proof
     *
     * @param clientCode
     * @return
     */
    List<ElementCount<Source>> countProofBySource(String clientCode);

    /**
     * 按经办员工统计proof
     *
     * @param clientCode
     * @param source
     * @return
     */
    List<ElementCount<String>> countProofByEmployee(String clientCode, Source... source);

    /**
     * 按proof类别统计proof
     *
     * @param clientCode
     * @param source
     * @return
     */
    List<ElementCount<ProofType>> countProofByProofType(String clientCode, Source... source);

    /**
     * 按certificate类别统计proof
     *
     * @param clientCode
     * @param source
     * @return
     */
    List<ElementCount<CertificateType>> countProofByCertificateType(String clientCode, Source... source);

    /**
     * 按信用评级统计用户
     *
     * @param clientCode
     * @return
     */
    List<ElementCount<CreditRank>> countUserByCreditRank(String clientCode);

    /**
     * **************************
     *
     * 按日期统计信息
     *
     ***************************
     */
    /**
     * 统计每日注册用户.
     *
     * 如果某日无用户注册则没有该项
     *
     * @param clientCode
     * @param from
     * @param to
     * @return
     */
    List<ElementCount<LocalDate>> dailyRegister(String clientCode, Date from, Date to);

    /**
     * 统计每日用户登陆人次.
     *
     * 默认不排重
     *
     * @param clientCode
     * @param from
     * @param to
     * @return
     */
    List<ElementCount<LocalDate>> dailyLogin(String clientCode, Date from, Date to);

    /**
     * 统计每日登录的用户，去除重复登录
     *
     * @param clientCode
     * @param from
     * @param to
     * @return
     */
    List<ElementCount<LocalDate>> dailyLoginUser(String clientCode, Date from, Date to);
    
    /**
     * 統計登錄用戶 by Date
     * @param clientCode
     * @param from
     * @param to
     * @return 
     */
    List<String> listByLoginDate(String clientCode, Date from, Date to);
}
