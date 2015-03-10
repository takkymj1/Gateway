/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idm.saml;

import javax.ejb.Remote;

/**
 *
 * @author tinglany
 */
@Remote
public interface SAMLService {
    
    public  String encoding(String originalString);
    
    public String validate(String responseString) throws Exception;
}
