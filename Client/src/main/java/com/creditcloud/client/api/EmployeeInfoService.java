/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.client.api;

import com.creditcloud.model.ContactInfo;
import com.creditcloud.model.PersonalInfo;
import com.creditcloud.model.client.EmployeeInfo;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface EmployeeInfoService {

    /**
     *
     * @param clientCode
     * @param employeeId
     * @return
     */
    EmployeeInfo getEmployeeInfoById(String clientCode, String employeeId);

    /**
     *
     * @param clientCode
     * @param info
     * @return
     */
    boolean updateEmployeeInfo(String clientCode, EmployeeInfo info);

    /**
     * update personal info
     *
     * @param clientCode
     * @param employeeId
     * @param info
     * @return
     */
    boolean updatePersonalInfo(String clientCode, String employeeId, PersonalInfo info);

    /**
     * update contact info
     *
     * @param clientCode
     * @param employeeId
     * @param info
     * @return
     */
    boolean updateContactInfo(String clientCode, String employeeId, ContactInfo info);
}
