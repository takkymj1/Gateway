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
import com.creditcloud.appoint.model.Appointment;
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
    AppointRequest getAppointRequestById(String clientCode,String requestId);
    
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
     * @return
     */
    AppointAgent saveAgent(String clientCode, AppointAgent agent);

    /**
     * 添加或更新认购产品
     *
     * @param clientCode
     * @param appointment
     * @return
     */
    Appointment saveAppointment(String clientCode, Appointment appointment);
    

    /**
     * 用户认购
     *
     * @param clientCode
     * @param request
     * @return
     */
    AppointRequest appoint(String clientCode, String userId, int amount, String appointmentId);

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
}
