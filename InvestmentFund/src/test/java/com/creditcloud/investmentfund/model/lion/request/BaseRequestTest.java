/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.request;

import com.lionfund.exception.ApplicationException;
import com.lionfund.security.Signature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class BaseRequestTest {
    
    public BaseRequestTest() {
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
     * Test of sign method, of class BaseRequest.
     */
    @Test
    public void testSign() {
        try {
            String attribute = "attributeSample";
            String mertid = "meridSample";
            long stamp = 1L;
            String merchantKey = "123456789";
            
            BaseRequest instance = new BaseRequest(attribute, mertid, stamp);
            instance.sign(merchantKey);
            Map<String, String> map = new HashMap<>();
            map.put("attribute", attribute);
            map.put("merid", mertid);
            map.put("stamp", String.valueOf(stamp));
            
            StringBuilder sequence = new StringBuilder();
            Set set = map.keySet();
            Object[] ObjectArr = set.toArray();
            String[] keyArr = new String[ObjectArr.length];
            for (int i = 0; i < ObjectArr.length; i++) {
                keyArr[i] = (String) ObjectArr[i];
            }
            Arrays.sort(keyArr, String.CASE_INSENSITIVE_ORDER);
            for (String key : keyArr) {
                sequence.append(key.trim()).append(map.get(key).trim());
            }
            
            assertEquals(instance.getToken(), new Signature().sign(merchantKey + sequence.toString() + merchantKey));
        } catch (ApplicationException ex) {
            Logger.getLogger(BaseRequestTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
