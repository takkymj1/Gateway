/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.criteria;

import com.creditcloud.model.BaseObject;
import javax.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo extends BaseObject {

    private static final long serialVersionUID = 20131015L;

    /**
     * 获取全部内容
     */
    public static final PageInfo ALL = new PageInfo(0, Integer.MAX_VALUE);

    /**
     * offset x means start from number (x + 1)
     */
    @FormParam("offset")
    private int offset;

    /**
     * page size
     */
    @FormParam("size")
    private int size;
}
