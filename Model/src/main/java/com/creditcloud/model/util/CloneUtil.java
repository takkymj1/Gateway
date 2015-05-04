/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *通过stream方式clone实现了序列化接口类的对象
 * 
 * @author zhanggm
 */
public class CloneUtil {
    
    /**
     * clone object (deeply clone)
     * @param loanExt
     * @return 
     */
    public static Object cloneObj(Object loanExt){
        Object resultExt = null; 
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
        ObjectOutputStream oos = null; 
        ObjectInputStream ois = null; 
        ByteArrayInputStream bin = null;
        try {
            oos = new ObjectOutputStream(bos); 
            oos.writeObject(loanExt); 
            oos.flush(); 
            bin = new ByteArrayInputStream(bos.toByteArray()); 
            ois = new ObjectInputStream(bin); 
            resultExt = (Object) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            Logger.getLogger(CloneUtil.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if(oos != null){
                    oos.close();
                }
                if(ois != null){
                   ois.close();
                }
                if(bin != null){
                    bin.close();
                }
                bos.close();
            } catch (IOException e) {
                Logger.getLogger(CloneUtil.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return resultExt;
    }
}
