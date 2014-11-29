/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.fee;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class FeeItem extends BaseObject {

    private static final long serialVersionUID = 20141128L;

    private String id;

    @NotNull
    private String name;

    @NotNull
    private FeeCategory category;

    private String userId;

    //private BigDecimal fixed;
    @NotNull
    private BigDecimal rate;

    private String description;

    public FeeItem(String id,
                   String name,
                   FeeCategory category,
                   String userId,
                   BigDecimal rate,
                   String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.userId = userId;
        this.rate = rate;
        this.description = description;
    }
}
