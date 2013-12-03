/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.client.api;

import com.creditcloud.model.client.Employee;
import com.creditcloud.model.client.EmployeeLoginResult;
import com.creditcloud.model.client.Role;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.client.Privilege;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface EmployeeService {

    /**
     * 创建或更新员工.
     *
     * 更新时只更新Employee对象的直接属性，身份证号尾号保持大写
     *
     * @param clientCode
     * @param employee
     * @return 保存失败返回null，否则返回更新过的Employee对象
     */
    Employee saveEmployee(String clientCode,
                          Employee employee);

    /**
     * 员工登陆.
     *
     * 使用普通的用户名密码登陆
     *
     * @param clientCode
     * @param loginName
     * @param password
     * @param info 与这次登陆相关的信息，如IP，客户端等
     * @param source
     * @return
     */
    EmployeeLoginResult login(String clientCode,
                              String loginName,
                              String password,
                              Map<String, String> info,
                              Source source);

    /**
     * 员工用手机号登陆.
     *
     * 使用手机号和密码登陆
     *
     * @param clientCode
     * @param mobile
     * @param password
     * @param info 与这次登陆相关的信息，如IP，客户端等
     * @param source
     * @return
     */
    EmployeeLoginResult loginMobile(String clientCode,
                                    String mobile,
                                    String password,
                                    Map<String, String> info,
                                    Source source);

    /**
     * 员工更新密码.
     *
     * 需要符合原有登陆条件才可以修改
     *
     * @param clientCode
     * @param loginName
     * @param password
     * @param newPassword
     * @return
     */
    boolean changePassword(String clientCode,
                           String loginName,
                           String password,
                           String newPassword);

    /**
     * **********************************************
     *
     * 权限相关方法
     *
     ***********************************************
     */
    /**
     * 根据员工ID解析其拥有的权限.
     *
     * @param clientCode
     * @param id id in Employee
     * @return
     */
    Set<Privilege> resolvePrivileges(String clientCode, String id);

    /**
     * 根据员工的ID获得其所有的Role
     *
     * @param clientCode
     * @param id Id in Employee
     * @return
     */
    Collection<Role> getRolesForEmployee(String clientCode, String id);

    /**
     * 获取所有定义的Role.
     *
     * 返回的Role中不包含members
     *
     * @param clientCode
     * @return
     */
    Collection<Role> getAllRoles(String clientCode);

    /**
     * 根据Id获取Role
     *
     * @param clientCode
     * @param roleId
     * @param includeMembers 是否同时获取Members
     * @return
     */
    Role getRoleById(String clientCode, String roleId, boolean includeMembers);

    /**
     * 为某Employee分配若干Roles.
     *
     * 调用该方法会将该员工原有的Role全部替换掉
     *
     * @param clientCode
     * @param employeeId
     * @param roleIds
     */
    void setRoles(String clientCode, String employeeId, String... roleIds);

    /**
     * 新建或更新Role.
     *
     * 忽略members，但更新Role下的Privilege
     *
     * @param clientCode
     * @param role
     */
    void saveRole(String clientCode, Role role);

    /**
     * **********************************************
     *
     * Employee相关方法
     *
     ***********************************************
     */
    /**
     * 获取某Client下所有员工列表
     *
     * @param clientCode
     * @return
     */
    List<Employee> listByClient(String clientCode);

    /**
     * 统计client下员工总数
     *
     * @param clientCode
     * @return
     */
    int countByClient(String clientCode);

    /**
     * 根据ID获取员工
     *
     * @param clientCode
     * @param id
     * @return null if not available
     */
    Employee findById(String clientCode,
                      String id);

    /**
     * 根据员工唯一号获取员工
     *
     * @param clientCode
     * @param empId
     * @return
     */
    Employee findByEmpId(String clientCode,
                         String empId);

    /**
     * 根据登录名获取员工
     *
     * @param clientCode
     * @param loginName
     * @return null if not available
     */
    Employee findByLoginName(String clientCode,
                             String loginName);

    /**
     * 根据身份证号获取员工.
     *
     * 身份证号不区分大小写（统一大写）
     *
     * @param clientCode
     * @param IdNumber
     * @return
     */
    Employee findByIdNumber(String clientCode,
                            String IdNumber);

    /**
     * 根据手机号获取员工
     *
     * @param clientCode
     * @param mobile
     * @return
     */
    Employee findByMobile(String clientCode,
                          String mobile);

    /**
     * 根据ID删除员工信息.
     *
     * 失败返回false
     *
     * @param clientCode
     * @param id
     * @return false if nothing removed or error happend
     */
    boolean removeById(String clientCode, String id);
}
