/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.api;

import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface ChinaPayService {

    /**
     * do nothing
     *
     * @return "ChinaPay" always
     */
    String ping();

}
