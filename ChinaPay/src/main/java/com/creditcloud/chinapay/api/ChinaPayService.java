package com.creditcloud.chinapay.api;

import java.util.Map;

import com.creditcloud.chinapay.model.ChinaPayBankAccount;
import com.creditcloud.chinapay.model.request.AccountBalanceQueryParameters;
import com.creditcloud.chinapay.model.request.SingleCutPostParameters;
import com.creditcloud.chinapay.model.request.SingleCutQueryParameters;
import com.creditcloud.chinapay.model.request.SinglePayPostParameters;
import com.creditcloud.chinapay.model.request.SinglePayQueryParameters;
import com.creditcloud.chinapay.model.response.AccountBalanceQueryResult;
import com.creditcloud.chinapay.model.response.SingleCutPostResult;
import com.creditcloud.chinapay.model.response.SingleCutQueryResult;
import com.creditcloud.chinapay.model.response.SinglePayPostResult;
import com.creditcloud.chinapay.model.response.SinglePayQueryResult;
import com.creditcloud.chinapay.bindcard.CardQueryResponse;
import com.creditcloud.chinapay.bindcard.FrontendBindCardResponse;
import com.creditcloud.chinapay.utils.StringUtils;
import javax.ws.rs.FormParam;

/**
 * 银联接口,包含以下接口 :<br>
 * 1. 单笔代付:单笔代付交易,单笔代付查询,备付金余额查询;<br>
 * 2. 单笔代扣:单笔代扣交易和单笔代扣查询;<br>
 * 3. 银行卡认证<br>
 *
 * @author GuohuaZhang
 *
 */
public interface ChinaPayService {

    /**
     * do nothing
     *
     * @return "ChinaPay" always
     */
    String ping();

    /**
     * 对response验密操作
     *
     * @param response
     * @return
     */
    boolean verifyResponse(FrontendBindCardResponse response);

    /**
     * 查询银行卡信息
     *
     * @param cardNo 银行卡号
     *
     * @return
     */
    CardQueryResponse queryCardInfo(String cardNo);

    /**
     * 单笔代付交易接口<br>
     * 验证过程中如果遇到HTTP返回码不是200,会抛出异常HTTPException;<br>
     * 验证过程中如果来自服务器的返回不能通过密钥验证,则会抛出异常MaliciousServerException;<br>
     * 备付金不足抛异常NoEnoughMoneyForSinglePayException;<br>
     * 其他情况下返回服务器反馈的验证信息<br>
     *
     * @param parameters
     * @return
     */
    SinglePayPostResult singlePayTrans(SinglePayPostParameters parameters);

    /**
     * 单笔代付查询接口<br>
     * 验证过程中如果遇到HTTP返回码不是200,会抛出异常HTTPException;<br>
     * 验证过程中如果来自服务器的返回不能通过密钥验证,则会抛出异常MaliciousServerException;<br>
     * 其他情况下返回服务器反馈的验证信息<br>
     *
     * @param parameters
     * @return
     */
    SinglePayQueryResult singlePayQuery(SinglePayQueryParameters parameters);

    /**
     * 银联备付金账号余额查询
     *
     * @param parameters
     * @return
     */
    AccountBalanceQueryResult queryAccountBalance(AccountBalanceQueryParameters parameters);

    /**
     * 代笔代扣交易接口<br>
     * 验证过程中如果遇到HTTP返回码不是200,会抛出异常HTTPException;<br>
     * 验证过程中如果来自服务器的返回不能通过密钥验证,则会抛出异常MaliciousServerException;<br>
     * 其他情况下返回服务器反馈的验证信息<br>
     *
     * @param parameters
     * @return
     */
    SingleCutPostResult singleCutTrans(SingleCutPostParameters parameters);

    /**
     * 单笔代扣查询接口<br>
     * 验证过程中如果遇到HTTP返回码不是200,会抛出异常HTTPException;<br>
     * 验证过程中如果来自服务器的返回不能通过密钥验证,则会抛出异常MaliciousServerException;<br>
     * 其他情况下返回服务器反馈的验证信息<br>
     *
     * @param parameters
     * @return
     */
    SingleCutQueryResult singleCutQuery(SingleCutQueryParameters parameters);

    /**
     * 后端模式客户银行卡验证接口,验证参数ChinaPayBankAccount account提供的信息是否对应一个真实存在的银行卡;<br>
     * 验证过程中如果遇到HTTP返回码不是200,会抛出异常HTTPException;<br>
     * 验证过程中如果来自服务器的返回不能通过密钥验证,则会抛出异常MaliciousServerException;<br>
     * 其他情况下返回服务器反馈的验证信息<br>
     *
     * @param account
     * @return 返回一个Map<String,String>格式存储的验证结果信息,<br>
     * 类似于 :{serviceType=1028, certType=01,
     * signature=F2956936EFD95F8C272A37C4A6F73D5A, dcType=0, save=false,
     * respcode=0000, cardNo=6226620607792207, certNo=231002198903302089,
     * appSysId=90000, respmsg=null, usrName=刘琳驰, channelId=19,
     * signMethod=MD5}<br>
     * 当
     * respcode为"0000"表示这是一个真实存在的银行卡号,其他值分别表示一些错误(ChinaPay用户系统_账户认证接口文档V1.0.7.docx):<br>
     * <br>
     * 0001 脱机认证已提交，请于3个工作日后查询结果 <br>
     * 1111 未认证 <br>
     * 2222 认证已提交，正在处理中<br>
     * 9999 认证失败,请稍后重试 <br>
     * 9900 认证失败,请联系发卡行 <br>
     * 9901 无效的发卡行 <br>
     * 9902 无效交易 <br>
     * 9903 无效金额 <br>
     * 9904 无效卡号 <br>
     * 9905 客户取消交易 <br>
     * 9906 无效交易响应 <br>
     * 9907 此卡已过期 <br>
     * 9908 密码错误 <br>
     * 9909 余额不足 <br>
     * 9910 未开通此功能 <br>
     * 9911 交易异常,请联系发卡行 <br>
     * 9912 超出金额限制 <br>
     * 9913 此卡受限制,请联系发卡行 <br>
     * 9914 超出取款次数限制 <br>
     * 9915 超出最大输入密码次数,请联系发卡行<br>
     * 9916 交易超时,请重试 <br>
     * 9917 交易重复,请稍后查询结果 <br>
     * 9918 密码格式错误 <br>
     * 9919 银行卡与姓名不符 <br>
     * 9920 银行卡与证件不符 <br>
     */
    Map<String, String> backendValidateBankAccount(ChinaPayBankAccount account);

    /**
     * 根据提供的客户银行账号信息和验证成功后期望返回的地址构造一个银行卡号的银联前端验证地址,这个地址贴在浏览器地址栏中,应该出现一个需要输入用户银行卡密码的页面
     *
     * @param account
     * @param returnURL
     * @return
     */
    String buildFrontendBankAccountValidatingURL(ChinaPayBankAccount account, String returnURL);

    /**
     * 移动端向银联控件提交客户银行卡认证时候需要生成一个签名，这个方法用来完成这个功能
     *
     * @param cardNo
     * @param cerType
     * @param cerNo
     * @param cerName
     * @param cardMobile
     * @return
     */
    String sign(String cardNo, String cerType, String cerNo, String cerName, String cardMobile);

    /**
     * 移动端从银联控件获取客户银行卡认证结果时候需要验证签名，这个方法用来完成这个功能
     *
     * @param respCode
     * @param cardNo
     * @param cerNo
     * @param cardMobile
     * @param cpSign
     * @return
     */
    boolean verify(String respCode, String cardNo, String cerNo, String cardMobile, String cpSign);

}
