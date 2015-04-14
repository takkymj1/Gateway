package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.lion.moneyfund.enums.TransName;
import com.creditcloud.investmentfund.api.utils.StringUtils;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 诺安货币基金添加银行卡请求报文<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author GuohuaZhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AddNewCardRequestApplyMessage extends RequestApplyMessageBase {

    @NotNull
    private String verCode;//	验证码内容	char(8)	R	客户输入	
    private String remark;//	备注	char(500)	O	

    public AddNewCardRequestApplyMessage() {
        this.transName = TransName.ADD_NEW_CARD.getCode();
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> parameters = super.toMap();

        parameters.put("verCode", StringUtils.nonNull(verCode));
        parameters.put("remark", StringUtils.nonNull(remark));

        return parameters;
    }
}
