/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.RealmEntity;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class LoanRequestDetail extends BaseObject {

    private static final long serialVersionUID = 20141208L;

    @NotNull
    private String requestId;

    /**
     * 项目录入人
     */
    private RealmEntity requestCreator;

    /**
     * 区域位置
     */
    private String location;

    /**
     * 共同借款人
     */
    private RealmEntity coborrower;

}
