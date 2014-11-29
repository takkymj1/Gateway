/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.fee;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface FeeService {

    FeeItem addNew(FeeItem item);
    
    void update(FeeItem item);

    FeeItem getByCategory(FeeCategory category);
    
    List<FeeItem> listAll();
}
