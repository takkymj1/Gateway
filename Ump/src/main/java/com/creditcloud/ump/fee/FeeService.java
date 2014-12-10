/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.fee;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface FeeService {

    /**
     * TODO目前只支持FeeCategory与FeeItem一一对应</p>
     * 如果FeeCategory已经存在返回null
     *
     * @param item
     * @return
     */
    FeeItem addNew(FeeItem item);

    void update(FeeItem item);

    FeeItem getById(String itemId);

    FeeItem getByCategory(FeeCategory category);

    List<FeeItem> listAll();
}
