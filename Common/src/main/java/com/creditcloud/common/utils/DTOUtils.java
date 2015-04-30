/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.common.entities.embedded.BankAccount;
import com.creditcloud.common.entities.embedded.Duration;
import com.creditcloud.common.entities.embedded.InvestRule;
import com.creditcloud.common.entities.embedded.Location;
import com.creditcloud.common.entities.embedded.RealmEntity;
import com.creditcloud.common.entities.embedded.Repayment;
import com.creditcloud.common.entities.embedded.RepaymentRule;
import com.creditcloud.common.entities.embedded.Reward;
import com.creditcloud.common.entities.embedded.info.Contact;
import com.creditcloud.common.entities.embedded.info.ContactInfo;
import com.creditcloud.common.entities.embedded.info.EducationInfo;
import com.creditcloud.common.entities.embedded.info.PersonalInfo;
import com.creditcloud.common.entities.embedded.info.PlaceInfo;
import com.creditcloud.common.entities.embedded.info.SocialInfo;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanStatus;
import static com.creditcloud.model.enums.loan.LoanStatus.BREACH;
import static com.creditcloud.model.enums.loan.LoanStatus.CANCELED;
import static com.creditcloud.model.enums.loan.LoanStatus.CLEARED;
import static com.creditcloud.model.enums.loan.LoanStatus.FAILED;
import static com.creditcloud.model.enums.loan.LoanStatus.FINISHED;
import static com.creditcloud.model.enums.loan.LoanStatus.OVERDUE;
import static com.creditcloud.model.enums.loan.LoanStatus.SETTLED;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rooseek
 */
public class DTOUtils {

    /**
     * handle Duration
     *
     * @param duration
     * @return
     */
    public static com.creditcloud.model.loan.Duration getDurationDTO(Duration duration) {
        com.creditcloud.model.loan.Duration result = null;
        if (duration != null) {
            result = new com.creditcloud.model.loan.Duration(duration.getYears(),
                                                             duration.getMonths(),
                                                             duration.getDays());
        }
        return result;
    }

    public static Duration convertDurationDTO(com.creditcloud.model.loan.Duration duration) {
        Duration result = null;
        if (duration != null) {
            result = new Duration(duration.getYears(),
                                  duration.getMonths(),
                                  duration.getDays());
        }
        return result;
    }

    /**
     * handle Repayment
     *
     * @param repayment
     * @return
     */
    public static com.creditcloud.model.loan.Repayment getRepaymentDTO(Repayment repayment) {
        com.creditcloud.model.loan.Repayment result = null;
        if (repayment != null) {
            result = new com.creditcloud.model.loan.Repayment(repayment.getAmountPrincipal(),
                                                              repayment.getAmountInterest(),
                                                              repayment.getAmountOutstanding(),
                                                              repayment.getDueDate());
        }
        return result;
    }

    public static Repayment convertRepaymentDTO(com.creditcloud.model.loan.Repayment repayment) {
        Repayment result = null;
        if (repayment != null) {
            result = new Repayment(repayment.getAmountPrincipal(),
                                   repayment.getAmountInterest(),
                                   repayment.getAmountOutstanding(),
                                   repayment.getDueDate());
        }
        return result;
    }

    /**
     * handle RepaymentRule
     *
     * @param repaymentRule
     * @return
     */
    public static com.creditcloud.model.loan.RepaymentRule getRepaymentRuleDTO(RepaymentRule repaymentRule) {
        com.creditcloud.model.loan.RepaymentRule result = null;
        if (repaymentRule != null) {
            result = new com.creditcloud.model.loan.RepaymentRule(repaymentRule.getDaysOfYear(),
                                                                  repaymentRule.getRepaymentPeriod(),
                                                                  repaymentRule.getDayOfRepayment());
        }
        return result;
    }

    public static RepaymentRule convertRepaymentRuleDTO(com.creditcloud.model.loan.RepaymentRule repaymentRule) {
        RepaymentRule result = null;
        if (repaymentRule != null) {
            result = new RepaymentRule(repaymentRule.getDaysOfYear(),
                                       repaymentRule.getRepaymentPeriod(),
                                       repaymentRule.getDayOfRepayment());
        }
        return result;
    }

    /**
     * handle Location
     *
     * @param location
     * @return
     */
    public static com.creditcloud.model.Location getLocationDTO(Location location) {
        com.creditcloud.model.Location result = null;
        if (location != null) {
            result = new com.creditcloud.model.Location(location.getProvince(),
                                                        location.getCity(),
                                                        location.getStreetAddress(),
                                                        location.getRoomAddress(),
                                                        location.getLongitude(),
                                                        location.getLatitude());
        }
        return result;
    }

    public static Location convertLocationDTO(com.creditcloud.model.Location location) {
        Location result = null;
        if (location != null) {
            result = new Location(location.getProvince(),
                                  location.getCity(),
                                  location.getStreetAddress(),
                                  location.getRoomAddress(),
                                  location.getLongitude(),
                                  location.getLatitude());

        }
        return result;
    }

    /**
     * handle BankAccount
     *
     * @param bankAccount
     * @return
     */
    public static com.creditcloud.model.user.fund.BankAccount getBankAccountDTO(BankAccount bankAccount) {
        com.creditcloud.model.user.fund.BankAccount result = null;
        if (bankAccount != null) {
            result = new com.creditcloud.model.user.fund.BankAccount(bankAccount.getName(),
                                                                     bankAccount.getBank(),
                                                                     bankAccount.getLocation(),
                                                                     bankAccount.getBranch(),
                                                                     bankAccount.getAccount(),
                                                                     bankAccount.getProvince(),
                                                                     bankAccount.getCity(),
                                                                     bankAccount.getBankMobile());
            result.setProvince(bankAccount.getProvince());
            result.setCity(bankAccount.getCity());
        }
        return result;
    }

    public static BankAccount convertBankAccountDTO(com.creditcloud.model.user.fund.BankAccount bankAccount) {
        BankAccount result = null;
        if (bankAccount != null) {
            result = new BankAccount(bankAccount.getName(),
                                     bankAccount.getBank(),
                                     bankAccount.getLocation(),
                                     bankAccount.getBranch(),
                                     bankAccount.getAccount(),
                                     bankAccount.getProvince(),
                                     bankAccount.getCity(),
                                     bankAccount.getBankMobile());
            result.setProvince(bankAccount.getProvince());
            result.setCity(bankAccount.getCity());
        }
        return result;
    }

    /**
     * handle conversion from LoanStatus to InvestStatus
     *
     * @param status
     * @return
     */
    public static InvestStatus convertStatus(LoanStatus status) {
        InvestStatus invest = null;
        if (status != null) {
            switch (status) {
                case FAILED:
                    return InvestStatus.FAILED;
                case FINISHED:
                    return InvestStatus.FINISHED;
                case CANCELED:
                    return InvestStatus.CANCELED;
                case SETTLED:
                    return InvestStatus.SETTLED;
                case CLEARED:
                    return InvestStatus.CLEARED;
                case OVERDUE:
                    return InvestStatus.OVERDUE;
                case BREACH:
                    return InvestStatus.BREACH;
            }
        }

        return invest;
    }

    /**
     * handle conversion from LoanStatus to InvestStatus
     *
     * @param status
     * @return
     */
    public static List<InvestStatus> convertStatus(List<LoanStatus> status) {
        List<InvestStatus> investStatus = new ArrayList<>();
        for (LoanStatus s : status) {
            investStatus.add(convertStatus(s));
        }

        return investStatus;
    }

    /**
     * handle contact
     *
     * @param contact
     * @return
     */
    private static com.creditcloud.model.Contact getContact(Contact contact) {
        com.creditcloud.model.Contact result = null;
        if (contact != null) {
            result = new com.creditcloud.model.Contact(contact.getName(), contact.getRelation(), contact.getMobile());
        }

        return result;
    }

    private static Contact convertContact(com.creditcloud.model.Contact contact) {
        Contact result = null;
        if (contact != null) {
            result = new Contact(contact.getName(), contact.getRelation(), contact.getMobile());
        }

        return result;
    }

    /**
     * handle contact info
     *
     * @param contact
     * @return
     */
    public static com.creditcloud.model.ContactInfo getContactInfo(ContactInfo contact) {
        com.creditcloud.model.ContactInfo result = null;
        if (contact != null) {
            result = new com.creditcloud.model.ContactInfo(getContact(contact.getEmergency()),
                                                           getContact(contact.getColleague()),
                                                           getContact(contact.getOther()));
        }

        return result;
    }

    public static ContactInfo convertContactInfo(com.creditcloud.model.ContactInfo contact) {
        ContactInfo result = null;
        if (contact != null) {
            result = new ContactInfo(convertContact(contact.getEmergency()),
                                     convertContact(contact.getColleague()),
                                     convertContact(contact.getOther()));
        }

        return result;
    }

    /**
     * handle EducationInfo
     *
     * @param education
     * @return
     */
    public static com.creditcloud.model.EducationInfo getEducationInfo(EducationInfo education) {
        com.creditcloud.model.EducationInfo result = null;
        if (education != null) {
            result = new com.creditcloud.model.EducationInfo(education.getEducationLevel(),
                                                             education.getEnrollmentYear(),
                                                             education.getSchool());
        }

        return result;
    }

    public static EducationInfo convertEducationInfo(com.creditcloud.model.EducationInfo education) {
        EducationInfo result = null;
        if (education != null) {
            result = new EducationInfo(education.getEducationLevel(),
                                       education.getEnrollmentYear(),
                                       education.getSchool());
        }

        return result;
    }

    /**
     * handle PlaceInfo
     *
     * @param place
     * @return
     */
    public static com.creditcloud.model.PlaceInfo getPlaceInfo(PlaceInfo place) {
        com.creditcloud.model.PlaceInfo result = null;
        if (place != null) {
            result = new com.creditcloud.model.PlaceInfo(place.getNativeProvince(),
                                                         place.getNativeCity(),
                                                         place.getHukouProvince(),
                                                         place.getHukouCity(),
                                                         place.getCurrentAddress(),
                                                         place.getCurrentPhone());
            result.setCurrentZip(place.getCurrentZip());
        }

        return result;
    }

    public static PlaceInfo convertPlaceInfo(com.creditcloud.model.PlaceInfo place) {
        PlaceInfo result = null;
        if (place != null) {
            result = new PlaceInfo(place.getNativeProvince(),
                                   place.getNativeCity(),
                                   place.getHukouProvince(),
                                   place.getHukouCity(),
                                   place.getCurrentAddress(),
                                   place.getCurrentPhone());
        }

        return result;
    }

    /**
     * handle personal info
     *
     * @param personal
     * @return
     */
    public static com.creditcloud.model.PersonalInfo getPersonalInfo(PersonalInfo personal) {
        com.creditcloud.model.PersonalInfo result = null;
        if (personal != null) {
            result = new com.creditcloud.model.PersonalInfo(personal.isMale(),
                                                            personal.getEthnic(),
                                                            personal.getDateOfBirth(),
                                                            personal.getMaritalStatus(),
                                                            personal.hasChildren(),
                                                            getEducationInfo(personal.getEducation()),
                                                            getPlaceInfo(personal.getPlace()),
                                                            personal.getAvatar());
            result.setHouseStatus(personal.getHouseStatus());
            result.setHukouType(personal.getHukouType());
            result.setCardValidDate(personal.getCardValidDate());
            result.setCardExpDate(personal.getCardExpDate());
        }

        return result;
    }

    public static PersonalInfo convertPersonalInfo(com.creditcloud.model.PersonalInfo personal) {
        PersonalInfo result = null;
        if (personal != null) {
            result = new PersonalInfo(personal.isMale(),
                                      personal.getEthnic(),
                                      personal.getDateOfBirth(),
                                      personal.getMaritalStatus(),
                                      personal.hasChildren(),
                                      convertEducationInfo(personal.getEducation()),
                                      convertPlaceInfo(personal.getPlace()),
                                      personal.getAvatar());
            result.setHouseStatus(personal.getHouseStatus());
            result.setHukouType(personal.getHukouType());
        }

        return result;
    }

    /**
     * handle social info
     *
     * @param info
     * @return
     */
    public static com.creditcloud.model.SocialInfo getSocialInfo(SocialInfo info) {
        com.creditcloud.model.SocialInfo result = null;
        if (info != null) {
            result = new com.creditcloud.model.SocialInfo(info.getWeibo(), info.getWechat());
        }
        return result;
    }

    public static SocialInfo convertSocialInfo(com.creditcloud.model.SocialInfo info) {
        SocialInfo result = null;
        if (info != null) {
            result = new SocialInfo(info.getWeibo(), info.getWechat());
        }
        return result;
    }

    /**
     * handle RealEntity
     *
     * @param entity
     * @return
     */
    public static com.creditcloud.model.misc.RealmEntity getRealmEntity(RealmEntity entity) {
        com.creditcloud.model.misc.RealmEntity result = null;
        if (entity != null) {
            result = new com.creditcloud.model.misc.RealmEntity(entity.getRealm(), entity.getEntityId());
        }
        return result;
    }

    public static RealmEntity convertRealmEntity(com.creditcloud.model.misc.RealmEntity entity) {
        RealmEntity result = null;
        if (entity != null) {
            result = new RealmEntity(entity.getRealm(), entity.getEntityId());
        }
        return result;
    }

    /**
     * handle InvestRule
     *
     * @param investRule
     * @return
     */
    public static com.creditcloud.model.loan.InvestRule getInvestRule(InvestRule investRule) {
        com.creditcloud.model.loan.InvestRule result = null;
        if (investRule != null) {
            result = new com.creditcloud.model.loan.InvestRule(investRule.getMinAmount(),
                                                               investRule.getMaxAmount(),
                                                               investRule.getStepAmount(),
                                                               investRule.getMaxTotalAmount(),
                                                               investRule.getMaxTimes());
        }
        return result;
    }

    public static InvestRule convertInvestRule(com.creditcloud.model.loan.InvestRule investRule) {
        InvestRule result = null;
        if (investRule != null) {
            result = new InvestRule(investRule.getMinAmount(),
                                    investRule.getMaxAmount(),
                                    investRule.getStepAmount(),
                                    investRule.getMaxTotalAmount(),
                                    investRule.getMaxTimes());
        }
        return result;
    }

    /**
     * handle Reward
     *
     * @param reward
     * @return
     */
    public static com.creditcloud.model.misc.Reward getReward(Reward reward) {
        com.creditcloud.model.misc.Reward result = null;
        if (reward != null) {
            result = new com.creditcloud.model.misc.Reward(reward.getType(), reward.getFixed(), reward.getRate());
        }
        return result;
    }

    public static Reward convertReward(com.creditcloud.model.misc.Reward reward) {
        Reward result = null;
        if (reward != null) {
            result = new Reward(reward.getType(), reward.getFixed(), reward.getRate());
        }
        return result;
    }

}
