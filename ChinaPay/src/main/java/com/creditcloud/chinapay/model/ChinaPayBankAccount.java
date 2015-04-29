package com.creditcloud.chinapay.model;

import com.creditcloud.model.BaseObject;
import org.apache.commons.lang3.StringUtils;

/**
 * 客户银行卡信息
 *
 * @author GuohuaZhang
 *
 */
public class ChinaPayBankAccount extends BaseObject {

    private static final long serialVersionUID = 20150311L;

    protected String userName = "";

    protected String bankName = "";

    protected String certType = "";

    protected String certNo = "";

    protected String cardNo = "";

    protected String dcType = "0";

    protected String cardPhone = "";

    /**
     * 银行卡用户的真实姓名
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 银行卡用户的真实姓名
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = StringUtils.trim(userName);
    }

    /**
     * 所属银行名称
     *
     * @return
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置所属银行名称
     *
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = StringUtils.trim(bankName);
    }

    public String getCertType() {
        return certType;
    }

    /**
     * 01：身份证；<br>
     * 02：军官证；<br>
     * 03：护照；<br>
     * 04: 回乡证；<br>
     * 05: 台胞证；<br>
     * 06: 警官证；<br>
     * 07: 士兵证；<br>
     * 99: 其他证件；<br>
     *
     * @param certType
     */
    public void setCertType(String certType) {
        this.certType = StringUtils.trim(certType);
    }

    /**
     * 卡号
     *
     * @return
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置卡号
     *
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = StringUtils.trim(cardNo);
    }

    public String getDcType() {
        return dcType;
    }

    /**
     * 0：借记卡<br>
     * 1：贷记卡<br>
     *
     * @param dcType
     */
    public void setDcType(String dcType) {
        this.dcType = StringUtils.trim(dcType);
    }

    /**
     * 身份证明号码
     *
     * @return
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * 设置身份证明号码
     *
     * @param certNo
     */
    public void setCertNo(String certNo) {
        this.certNo = StringUtils.trim(certNo);
    }

    /**
     * 后台认证需指定认证通道，招行指定12,EBPP通道，其他银行指定19，upop2.1通道<br>
     * 需要特别指定认证通道时则必须传<br>
     * PPP渠道:1<br>
     * UPOP渠道:3<br>
     * Cups渠道:4<br>
     * UPMP渠道:8<br>
     * EBPP渠道:12<br>
     * 工行组合渠道:17<br>
     * 建行组合渠道:18<br>
     * Upop2.1渠道：19<br>
     *
     * @return
     */
    public String getChannelId() {
        if ("招商银行".equalsIgnoreCase(bankName)) {
            return "12";
        } else {
            return "19";
        }
    }

    /**
     * 卡关联手机号 , 银行预留手机
     *
     * @return
     */
    public String getCardPhone() {
        return cardPhone;
    }

    /**
     * 卡关联手机号 , 银行预留手机
     *
     * @param cardPhone
     */
    public void setCardPhone(String cardPhone) {
        this.cardPhone = StringUtils.trim(cardPhone);
    }
}
