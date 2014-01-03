/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.api;

import com.creditcloud.appoint.model.AppointAgent;
import com.creditcloud.appoint.model.AppointRequest;
import com.creditcloud.appoint.model.Appointment;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface AppointService {

    /**
     * 添加认购代理人
     *
     * @param clientCode
     * @param agent
     * @return
     */
    AppointAgent addAgent(String clientCode, AppointAgent agent);

    /**
     * 添加新的认购产品
     *
     * @param clientCode
     * @param appointment
     * @return
     */
    Appointment addAppointment(String clientCode, Appointment appointment);

    /**
     * 更新Appointment
     *
     * @param clientCode
     * @param appointment
     * @return
     */
    Appointment updateAppointment(String clientCode, Appointment appointment);

    /**
     * 用户认购
     *
     * @param clientCode
     * @param request
     * @return
     */
    AppointRequest addRequest(String clientCode, AppointRequest request, String appointmentId);

    /**
     * 更新AppointRequest
     *
     * @param clientCode
     * @param request
     */
    void updateRequest(String clientCode, AppointRequest request);

    /**
     * 根据认购产品列出所有的认购申请
     *
     * @param clientCode
     * @param appointmentId
     * @return
     */
    PagedResult<AppointRequest> listRequestByAppointment(String clientCode, String appointmentId);

    /**
     * 根据代理人列出认购申请
     *
     * @param clientCode
     * @param agentUserId
     * @return
     */
    PagedResult<AppointRequest> listRequestByAgent(String clientCode, String agentUserId);

    /**
     * 列出代理人代理的认购产品
     *
     * @param clientCode
     * @param agentUserId
     * @return
     */
    PagedResult<Appointment> listAppointmentByAgent(String clientCode, String agentUserId);
}
