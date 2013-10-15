/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.dictionary.api;

import com.creditcloud.model.util.Regions;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface DictionaryService {

    /**
     * Fetch the Regions List by given code.
     * 
     * @param code
     * @return null if no matching record 
     */
    List<Regions.Entry> getRegionList(String code);
    
}
