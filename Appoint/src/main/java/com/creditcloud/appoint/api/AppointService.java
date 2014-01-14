/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.api;

import com.creditcloud.appoint.enums.AppointRequestStatus;
import com.creditcloud.appoint.enums.AppointmentStatus;
import com.creditcloud.appoint.model.AppointAgent;
import com.creditcloud.appoint.model.AppointRequest;
import com.creditcloud.appoint.model.AppointResult;
import com.creditcloud.appoint.model.AppointUser;
import com.creditcloud.appoint.model.Appointment;
import com.creditcloud.appoint.model.BranchAppointStat;
import com.creditcloud.model.ElementCount;
import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface AppointService {

    /**
     * 增加白名单用户.
     * 
     * 失败则抛出异常
     * 
     * @param clientCode
     * @param user
     * @return 
     */
    AppointUser saveAppointUser(String clientCode, AppointUser user);

    /**
     *
     * @param clientCode
     * @param appointUserId
     * @return
     */
    boolean deleteAppointUser(String clientCode, String appointUserId);

    /**
     *
     * @param clientCode
     * @param appointUserId
     * @return
     */
    AppointUser getAppointUserById(String clientCode, String appointUserId);

    /**
     * 直接从文本中导入AppointUser
     *
     * @param clientCode
     * @param filePath
     */
    boolean importAppointUser(String clientCode, String filePath);

    /**
     *
     * @param clientCode
     * @param pageInfo
     * @return
     */
    PagedResult<AppointUser> listAllAppointUser(String clientCode, PageInfo pageInfo);

    /**
     * 按查询条件列出白名单用户
     *
     * @param clientCode
     * @param criteriaInfo
     * @return
     */
    PagedResult<AppointUser> listAppointUserByCriteria(String clientCode, CriteriaInfo criteriaInfo);

    /**
     * 按机构列出白名单用户
     *
     * @param clientCode
     * @param pageInfo
     * @param branch
     * @return
     */
    PagedResult<AppointUser> listAppointUserByBranch(String clientCode, PageInfo pageInfo, String... branch);

    /**
     *
     * @param clientCode
     * @param appointmentId
     * @return
     */
    Appointment getAppointmentById(String clientCode, String appointmentId);

    /**
     *
     * @param clientCode
     * @param requestId
     * @return
     */
    AppointRequest getAppointRequestById(String clientCode, String requestId);

    /**
     *
     * @param clientCode
     * @param agentId
     * @return
     */
    AppointAgent getAppointAgentById(String clientCode, String agentId);

    /**
     * 添加或更新认购代理人
     *
     * @param clientCode
     * @param agent
     * @return null if save not successful
     */
    AppointAgent saveAgent(String clientCode, AppointAgent agent);

    /**
     * 添加或更新认购产品
     *
     * @param clientCode
     * @param appointment
     * @return null if save not successful
     */
    Appointment saveAppointment(String clientCode, Appointment appointment);

    /**
     * 用户认购
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param appointmentId
     * @param branchId
     * @return
     */
    AppointResult appoint(String clientCode, String userId, int amount, String appointmentId, String branchId);

    /**
     * 取消之前的认购申请
     *
     * @param clientCode
     * @param requestId
     * @return true if cancel successful
     */
    boolean cancelRequest(String clientCode, String requestId);

    /**
     * 更新AppointRequest的status
     *
     * @param clientCode
     * @param status
     * @param requestIds
     */
    void markRequestStatus(String clientCode, AppointRequestStatus status, String... requestIds);

    /**
     * 列出认购
     *
     * @param clientCode
     * @param status
     * @return
     */
    List<Appointment> listAppointment(String clientCode, AppointmentStatus... status);

    /**
     * 根据认购产品列出所有的认购申请
     *
     * @param clientCode
     * @param appointmentId
     * @return
     */
    PagedResult<AppointRequest> listRequestByAppointment(String clientCode, String appointmentId, PageInfo pageInfo, AppointRequestStatus... status);

    /**
     * 根据认购人列出所有认购
     *
     * @param clientCode
     * @param userId
     * @return
     */
    PagedResult<AppointRequest> listRequestByUser(String clientCode, String userId, PageInfo pageInfo, AppointRequestStatus... status);

    /**
     * 根据认购产品和认购人列出所有认购
     *
     * @param clientCode
     * @param appointmentId
     * @param userId
     * @param status
     * @return
     */
    PagedResult<AppointRequest> listRequestByAppointmentAndUser(String clientCode, String appointmentId, String userId, PageInfo pageInfo, AppointRequestStatus... status);

    /**
     * 按照branch 来统计用户数
     *
     * @param clientCode
     * @return
     */
    List<ElementCount<String>> countAppointUserByBranch(String clientCode);

    /**
     * 统计branch的认购数目和金额
     *
     * @param clientCode
     * @param appointmentId
     * @return
     */
    List<BranchAppointStat> getBranchAppointStat(String clientCode, String appointmentId, AppointRequestStatus... status);

    /**
     * 统计branch的认购数目和金额
     *
     * @param clientCode
     * @return
     */
    List<BranchAppointStat> getBranchAppointStat(String clientCode, AppointRequestStatus... status);
}
