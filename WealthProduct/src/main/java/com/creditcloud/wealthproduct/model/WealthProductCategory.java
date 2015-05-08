/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_DESCRIPTION_LENGTH;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_KEY_LENGTH;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_TITLE_LENGTH;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WealthProductCategory extends BaseObject {

    /**
     * ID
     * @return
     */
    public String id;
    
    /**
     * 类别名称
     * 
     * @return
     */
    @Size(max=MAX_TITLE_LENGTH)
    private String title;
    
    /**
     * 英文缩写
     * 
     * @return
     */
    @Size(max=MAX_KEY_LENGTH)
    private String key;
    
    /**
     * 类别描述
     * 
     * @return
     */
    @Size(max=MAX_DESCRIPTION_LENGTH)
    private String description;
    
}
