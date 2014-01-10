/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.tag.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Collection;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体到tag之间的映射关系,每个实体可以映射到多个tag
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagEntity extends BaseObject {

    private static final long serialVersionUID = 20131230L;
    
    private String id;

    @NotNull
    private RealmEntity entity;

    private Collection<Tag> tags;
    
    private Date timeRecorded;
}
