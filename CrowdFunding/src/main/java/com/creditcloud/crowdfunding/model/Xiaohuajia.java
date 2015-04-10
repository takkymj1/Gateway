/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.crowdfunding.model;

import com.creditcloud.crowdfunding.enums.XiaohuajiaSignupStatus;
import com.creditcloud.model.BaseObject;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 中网小画家报名信息
 * @author zaishu.ye@fengjr.com
 */
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
public class Xiaohuajia extends BaseObject {
    private String id;//编号
    private String parentId;//user_id，凤凰金融用户ID
    private String parentName;//家长姓名，凤凰金融用户真实姓名
    private String parentMobile;//家长手机号，凤凰金融用户手机号
    private String authorName;//作者姓名
    private boolean authorMale;//作者男性？true=男，false=女
    private String authorBirthday;//作者出生日期，年年年年-月月-日日
    private String authorIntroduction;//作者介绍
    private String authorPhoto;//作者生活照
    private String school;//作者学校
    private String tutorName;//指导老师姓名
    private String tutorMobile;//指导老师手机
    private Date signupTime;//报名时间
    private String paintName;//作品名称
    private String paintIntroduction;//作品介绍
    private String paintPicture;//作品图片地址
    private Date uploadTime;//作品上传时间
    private XiaohuajiaSignupStatus status;//报名状态：
    private String reviewer;//审核者ID
    private String reviewComments;//审核备注
    private Date reviewTime;//审核时间
    private String zcId;//创建为众筹后的众筹ID
    private FundingProject project;//众筹项目
}
