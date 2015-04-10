/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.crowdfunding.model;

import com.creditcloud.crowdfunding.enums.XiaohuajiaSignupStatus;
import com.creditcloud.model.BaseObject;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 检查中网小画家报名状态结果
 * @author zaishu.ye@fengjr.com
 */
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
public class XiaohuajiaSignupResult extends BaseObject {
    private boolean upload = false;//若为true,有未上传作品的报名信息，需要跳转到上传页
    private Xiaohuajia forUpload;//需要上传作品的报名信息
    private List<Xiaohuajia> signupList = new ArrayList<Xiaohuajia>();//所有的报名信息
    
    public XiaohuajiaSignupResult(List<Xiaohuajia> signupList){
        this.signupList = signupList;
        
        //遍历查询列表,找出待上传作品的报名
        for(Xiaohuajia x : signupList){
            //若有"等待上传作品"的报名, 设置forUpload"上传作品"
            if(XiaohuajiaSignupStatus.UPLOAD == x.getStatus() || x.getUploadTime() == null){
                upload = true;
                forUpload = x;
                break;
            }
        }
    }
    
}
