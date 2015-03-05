/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.utils.LionUtils;
import com.lionfund.security.Signature;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class QueryFundProductRequestTest {
    
    public QueryFundProductRequestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of setFundcode method, of class QueryFundProductRequest.
     */
    @Test
    public void testSign() {
        try {
            String mertid = "meridSample";
            String merchantKey = "123456789";
            String fundCode = "10000";
            
            QueryFundProductRequest instance = new QueryFundProductRequest(fundCode, mertid);
            Map<String, String> map = new HashMap<>();
            map.put("attribute", instance.getAttribute().name());
            map.put("merid", mertid);
            map.put("stamp", String.valueOf(instance.getStamp()));
            map.put("fundCode", fundCode);
            
            String data = LionUtils.convertMapToOrderedData(LionUtils.convertObjToMap(instance));
            String token = new Signature().sign(merchantKey + data + merchantKey);
            
            instance.sign(merchantKey);
            System.err.println(merchantKey + data + merchantKey);
            System.err.println("src:"+ instance.getToken());
            System.err.println("dst:"+ token);
            
            assertTrue(instance.getToken().contentEquals(token));
            
        } catch (Exception ex) {
            
        }
    }
    
}
