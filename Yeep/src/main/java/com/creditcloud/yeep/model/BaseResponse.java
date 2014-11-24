/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 接口输出
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public abstract class BaseResponse extends BaseObject {

    @NotNull
    private String platformNo;

    @NotNull
    private String code;

    private String description;

    public BaseResponse(String platformNo, 
                        String code, 
                        String description) {
        this.platformNo = platformNo;
        this.code = code;
        this.description = description;
    }

}
