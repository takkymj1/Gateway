/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@XmlRootElement
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class ProjectLocation extends BaseObject {

    private static final long serialVersionUID = 20140922L;
    
    private String province;

    private String city;

}
