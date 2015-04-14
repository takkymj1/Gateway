/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api.utils.xml;

import java.io.OutputStream;
import java.io.Writer;

import javax.xml.stream.*;
import javax.xml.transform.Result;

import com.fasterxml.aalto.stax.OutputFactoryImpl;

/**
 * 参考 : https://gist.github.com/jbcpollak/8312151
 *
 * @author guohuazhang
 */
public class CDataXmlOutputFactoryImpl extends XMLOutputFactory {

    OutputFactoryImpl f = new OutputFactoryImpl();

    @Override
    public XMLEventWriter createXMLEventWriter(OutputStream out) throws XMLStreamException {
        return f.createXMLEventWriter(out);
    }

    @Override
    public XMLEventWriter createXMLEventWriter(OutputStream out, String enc) throws XMLStreamException {
        return f.createXMLEventWriter(out, enc);
    }

    @Override
    public XMLEventWriter createXMLEventWriter(Result result) throws XMLStreamException {
        return f.createXMLEventWriter(result);
    }

    @Override
    public XMLEventWriter createXMLEventWriter(Writer w) throws XMLStreamException {
        return f.createXMLEventWriter(w);
    }

    @Override
    public XMLStreamWriter createXMLStreamWriter(OutputStream out) throws XMLStreamException {
        return new CDataXmlStreamWriter(f.createXMLStreamWriter(out));
    }

    @Override
    public XMLStreamWriter createXMLStreamWriter(OutputStream out, String enc) throws XMLStreamException {
        return new CDataXmlStreamWriter(f.createXMLStreamWriter(out, enc));
    }

    @Override
    public XMLStreamWriter createXMLStreamWriter(Result result) throws XMLStreamException {
        return new CDataXmlStreamWriter(f.createXMLStreamWriter(result));
    }

    @Override
    public XMLStreamWriter createXMLStreamWriter(Writer w) throws XMLStreamException {
        return new CDataXmlStreamWriter(f.createXMLStreamWriter(w));
    }

    @Override
    public Object getProperty(String name) {
        return f.getProperty(name);
    }

    @Override
    public boolean isPropertySupported(String name) {
        return f.isPropertySupported(name);
    }

    @Override
    public void setProperty(String name, Object value) {
        f.setProperty(name, value);
    }
}
