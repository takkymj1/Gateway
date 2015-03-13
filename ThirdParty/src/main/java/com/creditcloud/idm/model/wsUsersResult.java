package com.creditcloud.idm.model;


import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class wsUsersResult extends BaseObject {
    
    private String uid;

    private String mobile;

    private String userType;

    private String userpassword;

    private String idcardtype;
    
    private String idCode;
    
    private String sn;
    
    private  String cn;

}