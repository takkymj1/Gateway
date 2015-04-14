/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fengMessage.model.base;

import com.creditcloud.model.BaseObject;
import java.text.SimpleDateFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author zhanggm
 */
@Data
@NoArgsConstructor
public class BaseRequest extends BaseObject {
    public static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy年MM月dd日");
    public static final SimpleDateFormat DATETIME_FORMATTER =  new SimpleDateFormat("yyyy年MM月dd日 hh:mm");
    protected String template_id;
}
