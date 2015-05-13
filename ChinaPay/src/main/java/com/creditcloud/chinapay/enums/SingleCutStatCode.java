/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.enums;

import com.creditcloud.chinapay.utils.StringUtils;
import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * 00	1001	S	交易成功	处理完成或接收成功<br>
 * 45	2000	U	初始	系统正在对数据处理<br>
 * 空值	2000	U	初始	系统正在对数据处理<br>
 * 45	2045	U	未知	交易待查询<br>
 * 09	2009	U	超时未知	提交银行处理<br>
 * E2	20E2	F	交易失败	数字签名或证书错<br>
 * 01	2001	F	账户/卡错误	查开户方原因<br>
 * 03	2003	F	交易失败	无效商户<br>
 * 05	2005	F	交易失败	未开通业务<br>
 * 06	2006	F	系统处理失败	系统处理失败<br>
 * 13	2013	F	交易失败	货币错误<br>
 * 14	2014	F	账户/卡错误	无效卡号<br>
 * 22	2022	F	交易失败	交易失败<br>
 * 30	2030	F	交易失败	报文内容检查错或者处理错<br>
 * 31	2031	F	交易失败	无路由或路由参数有误<br>
 * 41	2041	F	账户/卡错误	已挂失折<br>
 * 51	2051	F	金额错误	余额不足<br>
 * 61	2061	F	金额错误	超出提款限额<br>
 * 94	2094	F	交易失败	重复业务<br>
 * EC	20EC	F	交易失败	商户状态不合法<br>
 * F3	20F3	F	交易失败	累计退货金额大于原交易金额<br>
 * FF	20FF	F	交易失败	非白名单卡号<br>
 * P9	20P9	F	交易失败	账户已冻结<br>
 * PD	20PD	F	交易失败	账户未加办代收付标志<br>
 * PS	20PS	F	交易失败	户名不符<br>
 * PU	20PU	F	交易失败	订单号错误<br>
 * PZ	20PZ	F	交易失败	原交易信息不存在<br>
 * Q3	20Q3	F	交易失败	日期错误<br>
 * QB	20QB	F	交易失败	商户审核不通过<br>
 * QS	20QS	F	交易失败	系统忙，请稍后再提交<br>
 * ST	20ST	F	交易失败	已撤销<br>
 * T4	20T4	F	交易失败	未签约账户<br>
 * TY	20TY	F	请求失败	IP不通过<br>
 * EL	20EL	F	交易失败	交易失败<br>
 * 01	0001	F	查询失败	系统处理失败<br>
 *
 *
 * @author guohuahzang
 */
public enum SingleCutStatCode implements BaseEnum {

    SUCCESS("1001", "交易成功"),
    PENDING_INITIALIZED("2000", "初始"),
    PENDING_UNKNOWN("2045", "未知"),
    PENDING_TIMEOUT("2009", "超时未知");

    private String key;

    private String reason;

    private SingleCutStatCode(final String key, final String reason) {
        this.key = key;
        this.reason = reason;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getReason() {
        return reason;
    }

    public boolean isSameAs(String stat_code) {
        String stat = StringUtils.nonNull(stat_code);
        return getKey().equalsIgnoreCase(stat.trim());
    }
}
