/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.generator.user;

import com.creditcloud.model.User;
import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author rooseek
 */
public class UserGeneratorFactory {

    private static ClientCodeGenerator ccGenerator;

    private static EmailAddressGenerator eaGenerator;

    private static IdNumberGenerator idGenerator;

    private static LoginNameGenerator lnGenerator;

    private static MobileNumberGenerator mbGenerator;

    private static RealNameGenerator rnGenerator;

    private static UrlGenerator urlGenerator;

    static {
        ccGenerator = new ClientCodeGenerator(new Random());
        eaGenerator = new EmailAddressGenerator(new Random());
        idGenerator = new IdNumberGenerator(new Random());
        lnGenerator = new LoginNameGenerator(new Random());
        mbGenerator = new MobileNumberGenerator(new Random());
        rnGenerator = new RealNameGenerator(new Random());
        urlGenerator = new UrlGenerator(new Random());
    }

    public static User[] generateUser(int number) {
        String[] emailAddresses = generateEmailAddress(number);
        String[] idNumbers = generateIdNumber(number);
        String[] loginNames = generateLoginName(number);
        String[] mobileNumbers = generateMobileNumber(number);
        String[] realNames = generateRealName(number);

        User[] users = new User[number];
        for (int i = 0; i < number; i++) {
            User user = new User(null,
                                 realNames[i],
                                 loginNames[i],
                                 idNumbers[i],
                                 mobileNumbers[i],
                                 emailAddresses[i]);
            users[i] = user;
        }

        return users;
    }

    public static String[] generateClientCode(int number) {
        return ccGenerator.generate(number);
    }

    public static String[] generateEmailAddress(int number) {
        return eaGenerator.generate(number);
    }

    public static String[] generateIdNumber(int number) {
        return idGenerator.generate(number);
    }

    public static String[] generateLoginName(int number) {
        return lnGenerator.generate(number);
    }

    public static String[] generateMobileNumber(int number) {
        return mbGenerator.generate(number);
    }

    public static String[] generateRealName(int number) {
        return rnGenerator.generate(number);
    }

    public static String[] generateUrl(int number) {
        return urlGenerator.generate(number);
    }
}
