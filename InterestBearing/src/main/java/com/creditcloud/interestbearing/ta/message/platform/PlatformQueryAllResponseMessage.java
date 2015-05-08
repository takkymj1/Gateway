/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.platform;

import com.creditcloud.interestbearing.ta.message.ResponseMessage;
import com.creditcloud.interestbearing.ta.model.PlatformMetadata;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.collections.CollectionUtils;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PlatformQueryAllResponseMessage extends ResponseMessage {

    private List<PlatformMetadata> platforms;

    public void setPlatforms(List<PlatformMetadata> platforms) {
        this.platforms = platforms;
    }

    public void setPlatforms(PlatformMetadata[] platforms) {
        List<PlatformMetadata> list = new ArrayList<>();
        CollectionUtils.addAll(list, platforms);
        this.platforms = list;
    }
}
