/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.model;

import com.creditcloud.cms.constant.Category;
import lombok.Data;

/**
 *
 * @author sobranie
 */
@Data
public class Channel {

    String id;

    Category category;

    String name;
}
