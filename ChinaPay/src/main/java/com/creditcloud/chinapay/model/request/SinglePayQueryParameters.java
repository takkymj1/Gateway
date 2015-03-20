package com.creditcloud.chinapay.model.request;

/**
 * 银联单笔代付交易查询报文 <br>
 * 定义参考 : ChinaPay收付捷平台_单笔代付接口文档V1.3.doc <br>
 *
 * @author GuohuaZhang
 */
public class SinglePayQueryParameters extends SinglePayParameters {

    private static final long serialVersionUID = 20150311L;

    @Override
    public String getTextToSign() {
        return new StringBuffer(merId).append(merDate).append(merSeqId).append(version).toString();
    }
}
