/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.platform;

import com.creditcloud.interestbearing.ta.message.ResponseMessage;
import com.creditcloud.interestbearing.ta.model.PlatformMetadata;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PlatformQueryOneResponseMessage extends ResponseMessage {

    private PlatformMetadata platform;
}
