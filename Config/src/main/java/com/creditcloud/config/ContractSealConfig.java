/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
@XmlRootElement(name = "ContractSealConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContractSealConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20131029L;
    
    public static final String CONFIG_NAME = "ContractSealConfig";
    
    /**
     * seal config
     */
    @Getter
    @XmlElement(name = "contractSeal")
    private ContractSeal[] contractSeal;
    
    
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
    private String apiPDFApplyCert = "http://121.199.18.174:8181/APWebPF/CfcaCertServlet";
    
    /**
     * 是否回传公章签章日志
     */
    @XmlElement
    @Getter
    private boolean enableContractSealLog = false;
    
    /**
     * 通过图片的方式PDF插入公章
     * 
     * @return
     */
    @XmlElement
    @Getter
    private boolean enableContractSealPictureMode = false;
}
