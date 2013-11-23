/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.common.utils.PdfUtils.Fields;
import static com.creditcloud.common.utils.PdfUtils.templateToPdf;
import com.creditcloud.config.FeeConfig;
import com.creditcloud.contract.Contract;
import com.creditcloud.contract.ContractParty;
import com.creditcloud.contract.ContractType;
import com.creditcloud.contract.api.ContractService;
import com.creditcloud.model.client.Client;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.user.User;
import com.google.common.collect.HashBiMap;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suetming
 */
public class ContractServiceBean implements ContractService{

    @Override
    public Contract generateLoanContract(Client client, Invest invest, Loan loan, List<LoanRepayment> repayments, FeeConfig feeConfig) {
        Contract contract = new Contract();
        contract.setId(null);
        contract.setName(invest.getId());
        contract.setClient(client);
        contract.setEntity(null);
        contract.setTimeCreated(new Date());
        contract.setType(ContractType.LOAN);
        
        Map<ContractParty, User> userRelated = new HashMap<>();
        userRelated.put(ContractParty.FIRST, invest.getUser());
        userRelated.put(ContractParty.SECOND, loan.getLoanRequest().getUser());
        contract.setUserRelated(userRelated);
        
        String contractNo = invest.getId();
        
        // 甲方账户管理费
        BigDecimal llf = feeConfig.getLoanInterestFee();
        llf.setScale(3);
        String loanInterestFee = String.valueOf(llf.floatValue() * 100);
        // 乙方账户管理费
        BigDecimal iif = feeConfig.getInvestInterestFee();
        iif.setScale(3);
        String investInterestFee = String.valueOf(iif.floatValue() * 100);
        
        // 乙方风险计提
        BigDecimal lgf = feeConfig.getLoanGuaranteeFee();
        lgf.setScale(3);
        String loanGuaranteeFee = String.valueOf(lgf.floatValue() * 100);
        
        // 乙方服务咨询费
        BigDecimal fc = feeConfig.getLoanServiceFee();
        fc.setScale(3);
        String loanServiceFee = String.valueOf(fc.floatValue() * 100);
        
        Fields fields = PdfUtils.convertToPdfField(contractNo, client, invest.getUser(), loan.getLoanRequest().getUser(), loan, repayments, loanInterestFee, investInterestFee, loanGuaranteeFee, loanServiceFee, new Date());
        
        try {
            byte[] out = templateToPdf(fields, "agreement3.pdf");
            contract.setContent(out);
        } catch (IOException ex) {
            Logger.getLogger(ContractServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ContractServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return contract;
    }
    
}
