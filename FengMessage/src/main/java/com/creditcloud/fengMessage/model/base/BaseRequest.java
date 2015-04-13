/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fengMessage.model.base;

import com.creditcloud.model.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author zhanggm
 */
@Data
@NoArgsConstructor
public class BaseRequest  extends BaseObject {
    
   private String template_id;
}
