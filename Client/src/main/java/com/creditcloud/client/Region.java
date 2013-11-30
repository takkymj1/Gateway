/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.client;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * 表示客户机构的区域.
 * 
 * 如华东区、华南区等
 * 
 * @author sobranie
 */
@Data
@XmlRootElement
public class Region extends BaseObject {
    
    private String id;

    @NotNull
    @FormParam("name")
    private String name;
}
