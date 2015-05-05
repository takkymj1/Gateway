package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.wealthproduct.enums.SubscribeStatus;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 认购
 *
 * @author rooseek
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Subscribe extends BaseObject {

    private static final long serialVersionUID = 20140924L;

    private String id;

    @NotNull
    private String productId;

    @NotNull
    private String userId;

    @NotNull
    private BigDecimal amount;

    @NotNull
    private WealthProductRate rate;
    
    @NotNull
    private SubscribeStatus status;

}