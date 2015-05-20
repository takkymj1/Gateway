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
public class ProductAssetGapMetadata implements Serializable{

    // 资产类型
    private String type;
    //id为资产id, 例子中为基金代码
    private String id;
    // 当前差额, -为缺口 需要外部购买, + 为节余 ,可能需要赎回
    private String gap;
    // 检查时间
    private String check_date;
}
