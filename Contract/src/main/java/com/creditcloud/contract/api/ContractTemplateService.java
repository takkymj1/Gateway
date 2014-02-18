/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract.api;

import com.creditcloud.contract.ContractTemplate;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author suetming
 */
@Remote
public interface ContractTemplateService {
    /**
     * 
     * @param clientCode
     * @return 
     */
    public List<ContractTemplate> listAllTemplates(String clientCode);
    
    public void deleteById(String contractId);
    
    public ContractTemplate addNew(String name, byte [] content);
    
    public ContractTemplate update(String id, String name);
}
