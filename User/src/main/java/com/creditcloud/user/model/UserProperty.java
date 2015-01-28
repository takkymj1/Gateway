/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.model;

import com.creditcloud.model.BaseObject;
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
public class UserProperty extends BaseObject {

    private static final long serialVersionUID = 20150128L;

    private String userId;

    private String name;

    private Object value;

}
