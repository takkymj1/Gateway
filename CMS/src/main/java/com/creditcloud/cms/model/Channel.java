/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.model;

import com.creditcloud.cms.enums.Category;
import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Channel extends BaseObject {

    private static final long serialVersionUID = 20140430L;

    private String id;

    @NotNull
    private Category category;

    @NotNull
    private String name;

    private String descrption;

    private Date timeRecorded;

    public Channel(String id, Category category, String name, String descrption) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.descrption = descrption;
    }
}
