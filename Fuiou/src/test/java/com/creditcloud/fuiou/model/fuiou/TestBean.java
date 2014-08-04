/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model.fuiou;

import com.creditcloud.fuiou.model.fuiou.utils.FuiouUtils;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author kdliu
 */
public class TestBean {
    
    public static void main(String args[]) {
        List<FuiouTransaction> trans = new ArrayList<FuiouTransaction>();
        
        FuiouTransaction tran = new FuiouTransaction("20140802",
                            "123123123123123123",
                            "123123123123123123",
                            "lkd",
                            "100.00",
                            "abc",
                            "def",
                            "asdf",
                            "ffgh",
                            "cde");
        
        trans.add(tran);
        trans.add(tran);
        
        QueryResponse response = new QueryResponse("0000", "123", trans);
        
        String xml = FuiouUtils.convertToXml(response);
        System.out.println(xml);
        response = FuiouUtils.converyToJavaBean(xml, QueryResponse.class);
                System.out.println(response.toString());
                
                
        QueryRequest qr = new QueryRequest("1", "2");
        xml = FuiouUtils.convertToXml(qr);
        System.out.println(xml);
        qr = FuiouUtils.converyToJavaBean(xml, QueryRequest.class);
                System.out.println(qr.toString());

    }
}
