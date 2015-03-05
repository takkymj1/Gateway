/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idm.api;

import java.util.Map;
import javax.ejb.Remote;
/**
 *
 * @author tinglany
 */

@Remote
public interface IDMService {

    public boolean createIDMUser(String uid,
                                 String psw,
                                 String cnName,
                                 String snName,
                                 String mobile,
                                 String mail,
                                 String userType,
                                 String idType,
                                 String idNumber);
    /**
     * 调用IDM查询用户
     * 
     * @param searchName
     * @return 
     */
//    public boolean searchUser(String searchName);
    
    /**
     * 按用户账号查询接口
     * 
     * @param uid
     * @return 
     */   
    public boolean lookUpUser(String uid);
    
    public boolean modifyUser(String uid,Map userAttr);
    
    public boolean resetPassword(String uid,String password);

    /**
     * 修改密码
     * 
     * @param uid
     * @param oldPassword
     * @param newPassword
     * @return 
     */    
    public boolean modifyPassword(String uid,String oldPassword,String newPassword);
    
    /**
     *  启用用户
     * 
     * @param uid
     * @return 
     */
    public boolean enableUser(String uid);
    
    /**
     *  禁用用户
     * 
     * @param uid
     * @return 
     */
    public boolean disableUser(String uid);    
    
//    public Map searchUser(Map wsSearchArguments);
}