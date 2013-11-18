/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.user.User;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author suetming
 */
public class PdfUtils {

    public static class Fields {
        public String agreementNo = "合同编号：CXJR123456-12312-12312";
        public String CJRName = "李鹏"; // 出借人姓名
        public String CJRloginName = "rooseek"; // 出借人登录名
        public String CJRIdNumber = "650204198802192316"; // 身份证号
        public String JKRName = "温家宝";
        public String JKRloginName = "admin"; // 登录名
        public String JKRIdNumber = "650204198802192315"; // 借款人身份证号
        public String amount = "人民币100000元"; // 金额
        public String amountUpper = "拾万元整"; // 金额大写
        public String loanPurpose = "日常消费"; // 借款用途
        public String loanRate = "21"; // 借款利率
        public String loanDate = "2013年10月11日"; // 放款日
        public String endDate = "2013年10月11日"; // 到期日
        public String cxrDate = "2013年10月11日"; // 起息日
        public String repayMethod = "到期还本"; // 还款方式
        public String repayDate = "每月25日"; // 还款日
        public String repayAmount = "人民币10000元"; // 还款金额
        public String repayAmountMonthly = "人民币10000元"; // 乙方每月应付金额
        public String fxbzjRate = "5";	// 风险保证金计提
        public String yzhglfRate = "3";	// 乙方账户管理费
        public String jzhglfRate = "2";	// 甲方账户管理费
        public String repaymentNo = "24"; // 还款期数
        public String zqr = "债权人"; // 债权人
        public String zwr = "债务人"; // 债务人
        public String fr = "法人"; // 法人
        // 签字日期
        public String signDate = "2013年8月16日";
        // 详情
        public java.util.List<RepaymentMonthly> repaymentMonthlyList = new ArrayList<>();
    }

    public static class RepaymentMonthly {
        public String repayDate;		// 还款日期
        public String interestAmount;	// 付息金额
        public String amount;		// 还款金额
    }

    /**
     * @param no                                     合同编号
     * @param creditor                             债权人
     * @param debtor                               债务人
     * @param loan                                  贷款
     * @param loanRepayment
     * @param AAccountManagerFees       甲方账户管理费
     * @param BAccountManagerFees       乙方账户管理费
     * @param BRiskFees                        乙方风险保证金计提                      
     * @param signDate                          合同签署日期
     * @return
     */
    public static Fields convertToPdfField(
            String no,
            String legal,
            User creditor, 
            User debtor, 
            Loan loan, 
            List<LoanRepayment> loanRepaymentList, 
            int AAccountManagerFees,
            int BAccountManagerFees,
            int BRiskFees,
            Date signDate) {
        Fields fields = new Fields();
        fields.CJRName = creditor.getName();
        fields.CJRloginName = creditor.getLoginName();
        fields.CJRIdNumber = creditor.getIdNumber();
        fields.zqr = creditor.getName();
        
        fields.JKRName = debtor.getName();
        fields.JKRloginName = debtor.getLoginName();
        fields.JKRIdNumber = debtor.getIdNumber();
        fields.zwr = debtor.getName();
        
        fields.amount = "人民币" + loan.getAmount() + "元";
        fields.amountUpper = toChineseCurrency(loan.getAmount());

        fields.loanPurpose = loan.getLoanRequest().getPurpose().name();
        fields.loanRate = loan.getRate() + "%";

        Date timeFinished = loan.getTimeFinished();
        Duration duration = loan.getDuration();
        fields.loanDate = toPdfDateString(timeFinished);
        
        // 到期日
        Calendar c = Calendar.getInstance();
        c.setTime(timeFinished);
        c.add(Calendar.DATE, duration.getDays());
        c.add(Calendar.YEAR, duration.getYears());
        c.add(Calendar.MONTH, duration.getMonths());
        fields.endDate = toPdfDateString(c.getTime());
        
        // 起息日
        fields.cxrDate = toPdfDateString(timeFinished);
        
        // 还款日/结息日
        fields.repayDate = "见附件还款详情";
        
        // 每月还款金额
        fields.repayMethod = loan.getMethod().getKey();
        fields.repayAmount = loan.getMethod() == RepaymentMethod.EqualInstallment ? "人民币" + loanRepaymentList.get(0).getRepayment().getAmountPrincipal() + "元" : "见附件还款详情";
        
        // 还款期数
        fields.repaymentNo = "共" + loanRepaymentList.size() + "期";
        
        // 甲方账户管理费
        fields.jzhglfRate = "" + AAccountManagerFees;
        // 乙方账户管理费
        fields.yzhglfRate = "" + BAccountManagerFees;
        
        // 乙方风险保证金计提
        fields.fxbzjRate = "" + BRiskFees;
        
        // 合同签署日期
        fields.signDate = toPdfDateString(signDate);
        
        // 合同编号
        fields.agreementNo = "合同编号：" + no;
        
        // 丙方（法人）
        fields.fr = legal;
        
       // 详情
       // 还款日期/付息金额/还款金额
       for(LoanRepayment repayment : loanRepaymentList) {
           RepaymentMonthly r = new RepaymentMonthly();
           r.amount = "人民币" + repayment.getRepayment().getAmountPrincipal() + "元";
           r.interestAmount = "人民币" + repayment.getRepayment().getAmountInterest() + "元";
           r.repayDate = toPdfDateString(repayment.getRepayment().getDueDate().toDate());
       }
       
        return fields;
    }

    public static String toPdfDateString(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日");
        String dateString = formatter.format(date);
        return dateString;
    }

    /**
     * convert to Chinese Currency
     *
     * @param o
     * @return
     */
    public static String toChineseCurrency(Object o) {
        if (o instanceof Number) {
            String s = new DecimalFormat("#.00").format(o);
            System.out.println(s);
            s = s.replaceAll("\\.", "");
            char[] digit = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
            String unit = "仟佰拾兆仟佰拾亿仟佰拾万仟佰拾元角分";
            int l = unit.length();
            StringBuffer sb = new StringBuffer(unit);
            for (int i = s.length() - 1; i >= 0; i--) {
                sb = sb.insert(l - s.length() + i, digit[(s.charAt(i) - 0x30)]);
            }
            s = sb.substring(l - s.length(), l + s.length());
            s = s.replaceAll("零[拾佰仟]", "零").replaceAll("零{2,}", "零")
                    .replaceAll("零([兆万元])", "$1").replaceAll("零[角分]", "");
            return s;
        } else {
            throw new NumberFormatException();
        }
    }
}
