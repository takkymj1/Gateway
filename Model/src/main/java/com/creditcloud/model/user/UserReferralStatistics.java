/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user;

import com.creditcloud.model.BaseObject;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户推荐统计
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReferralStatistics extends BaseObject {

    private static final long serialVersionUID = 20140612L;

    /**
     * 推荐人
     */
    private User user;

    /**
     * 推荐用戶列表
     */
    private List<ReferralUser> referralUsers;
    
}
