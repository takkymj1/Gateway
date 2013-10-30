/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.ElementCount;
import com.creditcloud.model.enums.Source;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserStatService {

    /**
     * 按来源统计用户数
     *
     * @param clientCode
     * @return
     */
    List<ElementCount<Source>> countEachBySource(String clientCode);

    /**
     * 按经办员工统计用户数
     *
     * @param clientCode
     * @param source
     * @return
     */
    List<ElementCount<String>> countEachByEmployee(String clientCode, Source... source);
}
