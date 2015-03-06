/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
//        try {
//            Attribute attribute = Attribute.getfundinfo;
//            String mertid = "meridSample";
//            String merchantKey = "123456789";
//            
//            BaseRequest instance = new BaseRequest(attribute, mertid);
//            instance.sign(merchantKey);
//            Map<String, String> map = new HashMap<>();
//            map.put("attribute", attribute.name());
//            map.put("merid", mertid);
//            map.put("stamp", String.valueOf(instance.getStamp()));
//            
//            StringBuilder sequence = new StringBuilder();
//            Set set = map.keySet();
//            Object[] ObjectArr = set.toArray();
//            String[] keyArr = new String[ObjectArr.length];
//            for (int i = 0; i < ObjectArr.length; i++) {
//                keyArr[i] = (String) ObjectArr[i];
//            }
//            Arrays.sort(keyArr, String.CASE_INSENSITIVE_ORDER);
//            for (String key : keyArr) {
//                sequence.append(key.trim()).append(map.get(key).trim());
//            }
//            
//            assertEquals(instance.getToken(), new Signature().sign(merchantKey + sequence.toString() + merchantKey));
//        } catch (ApplicationException ex) {
//        }
    }
    
}
