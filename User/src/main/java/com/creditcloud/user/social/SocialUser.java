/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.social;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.user.User;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialUser extends BaseObject {

    private static final long serialVersionUID = 20141118L;

    private User user;

    private SocialId socialId;
    
    private Date timeConnected;

}
