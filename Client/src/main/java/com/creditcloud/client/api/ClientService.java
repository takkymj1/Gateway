/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.client.api;

import com.creditcloud.model.client.Client;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface ClientService {

    /**
     * Fetch the Client object by given clientCode.
     *
     * @param clientCode
     * @return null if no matching record
     */
    Client getClient(String clientCode);

    /**
     * Save(persist) or update a client.
     *
     * @param client
     */
    void saveClient(Client client);

    /**
     * return base64 encoded icon for this client
     *
     * @param clientCode
     * @return
     */
    String getIcon(String clientCode);
}
