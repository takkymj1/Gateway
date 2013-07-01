/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.Client;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface ClientService {

    /**
     * for Market to ask Manager what's the current client
     * 
     * @return 
     */
    Client getCurrentClient();
}
