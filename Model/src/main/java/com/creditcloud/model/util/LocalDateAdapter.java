/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.LocalDate;

/**
 * 将LocalDate转换为JAXB/JSON的格式
 * 
 * @author sobranie
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @Override
    public LocalDate unmarshal(String v) throws Exception {
        return new LocalDate(v);
    }

    @Override
    public String marshal(LocalDate v) throws Exception {
        return v.toString();
    }
}
