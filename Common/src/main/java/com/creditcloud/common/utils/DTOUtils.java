/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.common.entities.embedded.Duration;
import com.creditcloud.common.entities.embedded.Location;
import com.creditcloud.common.entities.embedded.Range;
import com.creditcloud.common.entities.embedded.Repayment;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanStatus;
import static com.creditcloud.model.enums.loan.LoanStatus.BREACH;
import static com.creditcloud.model.enums.loan.LoanStatus.CANCELED;
import static com.creditcloud.model.enums.loan.LoanStatus.CLEARED;
import static com.creditcloud.model.enums.loan.LoanStatus.FAILED;
import static com.creditcloud.model.enums.loan.LoanStatus.FINISHED;
import static com.creditcloud.model.enums.loan.LoanStatus.OVERDUE;
import static com.creditcloud.model.enums.loan.LoanStatus.SETTLED;

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
     * handle Location
     *
     * @param location
     * @return
     */
    public static com.creditcloud.model.Location getLocationDTO(Location location) {
        com.creditcloud.model.Location result = null;
        if (location != null) {
            result = new com.creditcloud.model.Location();
            result.setProvince(location.getProvince());
            result.setCity(location.getCity());
            result.setLatitude(location.getLatitude());
            result.setLongtitude(location.getLongtitude());
            result.setStreetAddress(location.getStreetAddress());
            result.setRoomAddress(location.getRoomAddress());
        }
        return result;
    }

    public static Location convertLocationDTO(com.creditcloud.model.Location location) {
        Location result = null;
        if (location != null) {
            result = new Location();
            result.setProvince(location.getProvince());
            result.setCity(location.getCity());
            result.setLatitude(location.getLatitude());
            result.setLongtitude(location.getLongtitude());
            result.setStreetAddress(location.getStreetAddress());
            result.setRoomAddress(location.getRoomAddress());
        }
        return result;
    }

    /**
     * handle Range
     *
     * @param range
     * @return
     */
    public static com.creditcloud.model.misc.Range getRangeDTO(Range range) {
        com.creditcloud.model.misc.Range result = null;
        if (range != null) {
            result = new com.creditcloud.model.misc.Range(range.getLower(), range.getUpper());
        }
        return result;
    }

    public static Range convertRangeDTO(com.creditcloud.model.misc.Range range) {
        Range result = null;
        if (range != null) {
            result = new Range(range.getLower(), range.getUpper());
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
                    return InvestStatus.CANECELED;
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
}