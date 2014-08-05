/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model.fuiou.utils;

import com.creditcloud.fuiou.model.FuiouConstant;
import com.creditcloud.fuiou.model.fuiou.BaseRequest;
import com.creditcloud.fuiou.model.fuiou.BaseResponse;
import com.creditcloud.fuiou.model.fuiou.CollectRepaymentRequest;
import com.creditcloud.fuiou.model.fuiou.CollectRepaymentResponse;
import com.creditcloud.fuiou.model.fuiou.FuiouTransaction;
import com.creditcloud.fuiou.model.fuiou.QueryRequest;
import com.creditcloud.fuiou.model.fuiou.QueryResponse;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author kdliu
 */
public class FuiouUtils {
    
    protected static JAXBContext context = null;
    
    static {
        try {
            context = JAXBContext.newInstance(BaseRequest.class,
                    BaseResponse.class,
                    CollectRepaymentRequest.class,
                    CollectRepaymentResponse.class,
                    QueryRequest.class,
                    QueryResponse.class,
                    FuiouTransaction.class);
        } catch (JAXBException ex) {
            // TODO
        }
    }
  
    public static String convertToXml(Object obj) {  
        String result = "";  
        try {
            Marshaller marshaller = context.createMarshaller();  
            marshaller.setProperty(Marshaller.JAXB_ENCODING, FuiouConstant.CHAR_SET);  
  
            StringWriter writer = new StringWriter();  
            marshaller.marshal(obj, writer);  
            result = writer.toString();  
        } catch (JAXBException e) {
            // TODO
        }  
  
        return result;  
    }  
    
    @SuppressWarnings("unchecked")  
    public static <T> T converyToJavaBean(String xml, Class<T> c) {  
        T t = null;  
        try {
            Unmarshaller unmarshaller = context.createUnmarshaller();  
            t = (T) unmarshaller.unmarshal(new StringReader(xml));  
        } catch (JAXBException e) {
            // TODO
        }  
  
        return t;  
    }  
}
