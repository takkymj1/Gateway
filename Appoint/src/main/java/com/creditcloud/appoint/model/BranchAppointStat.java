/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 按照机构来统计对产品的认购
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class BranchAppointStat extends BaseObject {

    private static final long serialVersionUID = 20140114L;

    /**
     * 存储机构id
     */
    private String branch;

    /**
     * 认购数
     */
    private int count;

    /**
     * 认购金额
     */
    private long sum;
}
