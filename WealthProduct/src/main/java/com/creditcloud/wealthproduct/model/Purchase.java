/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.wealthproduct.enums.PurchaseStatus;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * purchase wealth product
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class Purchase extends BaseObject {

    private static final long serialVersionUID = 20140924L;

    private String id;

    @NotNull
    private String productId;

    @NotNull
    private String userId;

    @NotNull
    private int amount;

    @NotNull
    private PurchaseStatus status;

    @NotNull
    private Date submitTime;

    public Purchase(String id,
                    String productId,
                    String userId, 
                    int amount, 
                    PurchaseStatus status, 
                    Date submitTime) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.amount = amount;
        this.status = status;
        this.submitTime = submitTime;
    }

}
