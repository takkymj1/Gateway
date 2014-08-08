/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author suetming
 */
@NoArgsConstructor
@XmlRootElement(name = "FormaxConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class FormaxConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20140801L;

    public static final String CONFIG_NAME = "FormaxConfig";
    
    /**
     * 电子公章
     */
    @XmlElement
    @Getter
    private String apiPDFAddSeal = "http://121.199.18.174:8181/APWebPF/PFXSealServlet";
    
    /**
     * 个人私章
     */
    @XmlElement
    @Getter
    private String apiPDFAddPersonalSeal = "http://121.199.18.174:8181/APWebPF/CertQueryServlet";
    
    /**
     * 签章证书申请
     */
    @XmlElement
    @Getter
    private String apiPDFApplyCert = "http://121.199.18.174:8181/APWebPF/APWebPF/CfcaCertServlet";
}
