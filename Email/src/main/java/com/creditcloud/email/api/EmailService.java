/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.email.api;

import com.creditcloud.email.types.ConfirmResult;
import com.creditcloud.email.types.Email;
import com.creditcloud.model.client.Client;
import com.creditcloud.model.user.User;
import java.util.concurrent.Future;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface EmailService {

    /**
     * 通用的邮件发送接口
     *
     * @param client
     * @param subject      邮件标题
     * @param content      邮件内容
     * @param emailAddress 邮件地址
     * @return
     */
    Future<Boolean> send(Client client, String subject, String content, String... emailAddress);

    /**
     * send email to user on the behalf of this client
     *
     * There is no guarantee that the user will receive this mail successfully
     * now.
     *
     * @param client
     * @param mail
     */
    Future<Boolean> send(Client client, Email mail);

    /**
     * send email to user informing successful registration after activation
     *
     * @param client
     * @param emailAddress
     * @return
     */
    Future<Boolean> sendRegistration(Client client, String emailAddress);

    Future<Boolean> sendRegistration(Client client, String emailAddress, String personal);

    /**
     * send activation email to user during registration
     *
     * @param client
     * @param emailAddress
     * @return
     */
    Future<Boolean> sendActivation(Client client, String emailAddress);

    Future<Boolean> sendActivation(Client client, String emailAddress, String personal);

    /**
     * send authentication email to user for binding email
     *
     * @param client
     * @param emailAddress
     * @param user         需要绑卡的用户，其email不一定是emailAddress
     * @return
     */
    Future<Boolean> sendAuthentication(Client client, String emailAddress, User user);

    /**
     * Confirm the emailAddress is valid, and activate the email
     *
     * The caller will guarantee this email has not been confirmed yet.
     *
     * @param client
     * @param emailAddress
     * @param confirmCode
     * @return
     */
    ConfirmResult confirmEmail(Client client, String emailAddress, String confirmCode);

    /**
     * 不但要检验confirmCode和emailAddress，还要检验userId
     *
     * @param client
     * @param emailAddress
     * @param confirmCode
     * @param userId
     * @return
     */
    ConfirmResult confirmEmail(Client client, String emailAddress, String confirmCode, String userId);

    /**
     * check whether email is already activated on behalf of this client
     *
     * @param client
     * @param emailAddress
     * @return
     */
    boolean isActivated(Client client, String emailAddress);
}
