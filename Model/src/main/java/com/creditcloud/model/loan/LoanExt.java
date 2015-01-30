/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.ContractConfirmStatus;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author peili
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class LoanExt extends BaseObject {

    private static final long serialVersionUID = 20150128001L;

    private Loan loan;
    
    //标的标题
    private String title;
    
    //标的金额
    private int amount;
    
    //借款人
    private String debtor;
    
    //借款期限
    private String repaymentNo;
    
    //签章类型
    private String sealType;
    
    //签章特征码
    private String sealCode;
    
    //签章使用时间,使用结算时间，避免重新生成合同后每次看到不一致
    private String useDate;
    
    //文档类型
    private String documentType;
    
    //文档名称
    private String documentName;
    
    //文档编号,此处为合同编号
    private String documentNo;
    
    //合同ID
    private String contractId;
    
    //合同是否已经确认
    private ContractConfirmStatus confirmStatus;
    
    public LoanExt(Loan loan,
                  String title,
                  int amount,
                  String debtor,
                  String repaymentNo,
                  String sealType,
                  String sealCode,
                  String useDate,
                  String documentType,
                  String documentName,
                  String documentNo,
                  String contractId,
                  ContractConfirmStatus confirmStatus) {
        this.loan = loan;
        this.title = title;
        this.amount = amount;
        this.debtor = debtor;
        this.repaymentNo = repaymentNo;
        this.sealType = sealType;
        this.sealCode = sealCode;
        this.useDate = useDate;
        this.documentType = documentType;
        this.documentName = documentName;
        this.documentNo = documentNo;
        this.contractId = contractId;
        this.confirmStatus = confirmStatus;
    }
}
