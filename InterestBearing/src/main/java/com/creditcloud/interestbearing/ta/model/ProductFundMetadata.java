/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.model;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author guohuazhang
 */
@Data
public class ProductFundMetadata implements Serializable{

    private String fund_id;
    private String fund_name;
    private String broker;
    private int round_digits;
    private String fund_type;
}
