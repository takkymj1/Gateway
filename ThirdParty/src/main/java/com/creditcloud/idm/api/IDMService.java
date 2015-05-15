/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idm.api;

import com.creditcloud.idm.model.IDMResult;
import com.creditcloud.idm.model.SearchUserResult;
import com.creditcloud.idm.model.UserAttr;
import javax.ejb.Remote;

/**
 *
 * @author tinglany
 */

@Remote
public interface IDMService {

    
    public IDMResult createIDMUser(String uid, String userpassword, String mobile, String smart_type);

    /**
     * 调用IDM查询用户
     *
     * @param searchName
     * @return
     */
//    public boolean searchUser(String searchName);

//    /**
//     * 按用户账号查询接口
//     *
//     * @param uid
//     * @return
//     */
//    public boolean lookUpUser(String uid);

    public IDMResult modifyUserIdNo(UserAttr userAttr);

//    public boolean resetPassword(String uid, String password);

    /**
     * 修改密码
     *
     * @param uid
     * @param oldPassword
     * @param newPassword
     * @return
     */
    public IDMResult modifyPassword(String uid, String oldPassword, String newPassword);

//    /**
//     * 启用用户
//     *
//     * @param uid
//     * @return
//     */
//    public boolean enableUser(String uid);
//
//    /**
//     * 禁用用户
//     *
//     * @param uid
//     * @return
//     */
//    public boolean disableUser(String uid);

//    public Map<Integer, Map<String, String>> searchUser(String filter);
    
    public SearchUserResult searchUser(String filter);
    
    
    //wap端登陆接口
    public IDMResult wapLogin (String uid, String userpassword);

}
