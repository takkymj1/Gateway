/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay;

import javax.ejb.Remote;

/**
 *
 * @author tinglany
 */
@Remote
public interface LianLianPayService {
    
    public CardDetail  queryCard(String clientCode, String cardNo);
}
