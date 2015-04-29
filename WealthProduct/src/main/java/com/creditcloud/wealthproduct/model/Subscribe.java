package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 认购
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class Subscribe extends BaseObject {

    private static final long serialVersionUID = 20140924L;

    private String id;

    @NotNull
    private String productId;

    @NotNull
    private String userId;

    @NotNull
    private int amount;

//    @NotNull
//    private PurchaseStatus status;

    @NotNull
    private Date submitTime;

}