/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.tag.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 可以自定义的标签
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tag extends BaseObject {

    private static final long serialVersionUID = 20131230L;

    /**
     * tag名称，必须唯一
     */
    @NotNull
    private String name;

    private String description;
   
}
