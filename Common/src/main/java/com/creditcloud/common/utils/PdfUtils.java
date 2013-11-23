/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.client.Client;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.user.User;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

        public String agreementNo = "xxxxxxxx-xxx-xxxx";
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
        public String fxbzjRate = "6";	// 风险保证金计提
        public String yzhglfRate = "5";	// 乙方账户管理费
        public String zxRate = "2";                    // 乙方咨询服务费
        public String jzhglfRate = "3";	// 甲方账户管理费
        public String repaymentNo = "24"; // 还款期数
        public String zqr = CJRName; // 债权人
        public String zwr = JKRName; // 债务人
        public String fr = "法人"; // 法人
        public String titleName = "阿朋贷"; // short name
        public String name = "阿朋贷";      // // short name
        public String url = "www.apengdai.com";
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
     * @param no 合同编号
     * @param creditor 债权人
     * @param debtor 债务人
     * @param loan 贷款
     * @param loanRepayment
     * @param AAccountManagerFees 甲方账户管理费
     * @param BAccountManagerFees 乙方账户管理费
     * @param BRiskFees 乙方风险保证金计提
     * @param signDate 合同签署日期
     * @return
     */
    public static Fields convertToPdfField(
            String no,
            Client legal,
            User creditor,
            User debtor,
            Loan loan,
            List<LoanRepayment> loanRepaymentList,
            String AAccountManagerFees,
            String BAccountManagerFees,
            String BRiskFees,
            String ConsultancyFees,
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

        // 乙方咨询服务费
        fields.zxRate = "" + ConsultancyFees;

        // 合同签署日期
        fields.signDate = toPdfDateString(signDate);

        // 合同编号
        fields.agreementNo = no;

        // 丙方（法人）
        if (legal != null) {
            fields.fr = legal.getShortName();
            fields.name = legal.getShortName();
            fields.titleName = legal.getShortName();
            fields.url = legal.getUrl();
        }

        // 详情
        // 还款日期/付息金额/还款金额
        for (LoanRepayment repayment : loanRepaymentList) {
            RepaymentMonthly r = new RepaymentMonthly();
            r.amount = "人民币" + repayment.getRepayment().getAmountPrincipal() + "元";
            r.interestAmount = "人民币" + repayment.getRepayment().getAmountInterest() + "元";
            r.repayDate = toPdfDateString(repayment.getRepayment().getDueDate().toDate());
            fields.repaymentMonthlyList.add(r);
        }

        return fields;
    }

    /**
     * 日期
     *
     * @param date
     * @return
     */
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

    /**
     *
     * @param no 合同编号
     * @param fields PDF域
     * @throws IOException
     * @throws DocumentException
     */
    public static byte[] templateToPdf(Fields fields, String inputFileName) throws IOException,
            DocumentException {
        String fileName = inputFileName;
        PdfReader reader = new PdfReader(fileName);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PdfStamper ps = new PdfStamper(reader, bos);
        BaseFont bf = BaseFont.createFont("STSong-Light",
                "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
        AcroFields s = ps.getAcroFields();

        s.setFieldProperty("agreementNo", "textfont", bf, null);
        s.setField("agreementNo", fields.agreementNo);

        s.setFieldProperty("JKRName", "textfont", bf, null);
        s.setField("JKRName", fields.JKRName);

        s.setFieldProperty("JKRloginName", "textfont", bf, null);
        s.setField("JKRloginName", fields.JKRloginName);

//        s.setFieldProperty("JKRIdNumber", "textfont", bf, null);
//        s.setField("JKRIdNumber", fields.JKRIdNumber);

//        s.setFieldProperty("CJRIdNumber", "textfont", bf, null);
//        s.setField("CJRIdNumber", fields.CJRIdNumber);
        setCIdNumber(s, fields.CJRIdNumber);
        setJIdNumber(s, fields.JKRIdNumber);

        s.setFieldProperty("CJRloginName", "textfont", bf, null);
        s.setField("CJRloginName", fields.CJRloginName);

        s.setFieldProperty("CJRName", "textfont", bf, null);
        s.setField("CJRName", fields.CJRName);

        s.setFieldProperty("amount", "textfont", bf, null);
        s.setField("amount", fields.amount);

        s.setFieldProperty("amountUpper", "textfont", bf, null);
        s.setField("amountUpper", fields.amountUpper);

        s.setFieldProperty("loanPurpose", "textfont", bf, null);
        s.setField("loanPurpose", fields.loanPurpose);

        s.setFieldProperty("loanRate", "textfont", bf, null);
        s.setField("loanRate", fields.loanRate);

        s.setFieldProperty("cxrDate", "textfont", bf, null);
        s.setField("cxrDate", fields.cxrDate);

        s.setFieldProperty("loanDate", "textfont", bf, null);
        s.setField("loanDate", fields.loanDate);

        s.setFieldProperty("endDate", "textfont", bf, null);
        s.setField("endDate", fields.endDate);

        s.setFieldProperty("repayDate", "textfont", bf, null);
        s.setField("repayDate", fields.repayDate);

        s.setFieldProperty("repayMethod", "textfont", bf, null);
        s.setField("repayMethod", fields.repayMethod);

        s.setFieldProperty("repayAmount", "textfont", bf, null);
        s.setField("repayAmount", fields.repayAmount);

        s.setFieldProperty("repayAmountMonthly", "textfont", bf, null);
        s.setField("repayAmountMonthly", fields.repayAmountMonthly);

        s.setFieldProperty("repaymentNo", "textfont", bf, null);
        s.setField("repaymentNo", fields.repaymentNo);

        s.setFieldProperty("fxbzjRate", "textfont", bf, null);
        s.setField("fxbzjRate", fields.fxbzjRate);

        s.setFieldProperty("jzhglfRate", "textfont", bf, null);
        s.setField("jzhglfRate", fields.jzhglfRate);

        s.setFieldProperty("yzhglfRate", "textfont", bf, null);
        s.setField("yzhglfRate", fields.yzhglfRate);

        s.setFieldProperty("zxRate", "textfont", bf, null);
        s.setField("zxRate", fields.zxRate);

        s.setFieldProperty("zqr", "textfont", bf, null);
        s.setField("zqr", fields.zqr);

        s.setFieldProperty("zwr", "textfont", bf, null);
        s.setField("zwr", fields.zwr);

        s.setFieldProperty("fr", "textfont", bf, null);
        s.setField("fr", fields.fr);

        s.setFieldProperty("Name", "textfont", bf, null);
        s.setField("Name", fields.name);

        s.setFieldProperty("titleName", "textfont", bf, null);
        s.setField("titleName", fields.titleName);

        s.setFieldProperty("url", "textfont", bf, null);
        s.setField("url", fields.url);

        s.setFieldProperty("signDate", "textfont", bf, null);
        s.setField("signDate", fields.signDate);


        ps.setFormFlattening(true);
        ps.close();
//        FileOutputStream fos = new FileOutputStream(fields.agreementNo);
//        fos.write(bos.toByteArray());
//
//        fos.close();
//        bos.close();
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        bos.close();

        // Create output PDF
        bos = new ByteArrayOutputStream();
        Document document = new Document(PageSize.A4);
        PdfWriter writer = PdfWriter.getInstance(document,
                bos);
        document.open();
        PdfContentByte cb = writer.getDirectContent();

        // Load existing PDF
        reader = new PdfReader(bis);

        // Copy first page of existing PDF into output PDF

        int n = reader.getNumberOfPages();
        for (int i = 0; i < n; i++) {
            PdfImportedPage page = writer.getImportedPage(reader,
                    i + 1);
            document.newPage();
            cb.addTemplate(page, 0, 0);
        }

        // Add your new data / text here
        document.newPage();

        BaseFont baseFont = null;
        try {
            baseFont = BaseFont.createFont("STSong-Light",
                    "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
        } catch (DocumentException e2) {
            e2.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }

        Font font = new Font(baseFont);
        float fontSize = font.getSize();
        font.setSize(20);
        Paragraph preface = new Paragraph("附件一", font);
        preface.setAlignment(Element.ALIGN_CENTER);
        document.add(preface);

        font.setSize(fontSize);
        preface = new Paragraph("还款详情表：", font);
        document.add(preface);

        document.add(addTable(fields));
        document.close();


        // add watermark
        bis = new ByteArrayInputStream(bos.toByteArray());
        bos = new ByteArrayOutputStream();
        reader = new PdfReader(bis);
        PdfStamper stamper = new PdfStamper(reader,
                bos);

        for (int i = 0, sum = reader.getNumberOfPages(); i < sum; i++) {
            waterMark(reader, stamper, i + 1);
        }

        stamper.close();

        byte[] ouput = bos.toByteArray();
        bos.close();
        return ouput;
    }

    private static void setCIdNumber(AcroFields acro, String CJRIdNumber) throws IOException, DocumentException {
        char[] c = CJRIdNumber.toCharArray();
        for (int i = 0; i < 18; i++) {
            acro.setField("C" + i, String.valueOf(c[i]));
        }

    }

    private static void setJIdNumber(AcroFields acro, String jKRIdNumber) throws IOException, DocumentException {
        char[] c = jKRIdNumber.toCharArray();
        for (int i = 0; i < 18; i++) {
            acro.setField("J" + i, String.valueOf(c[i]));
        }
    }

    /**
     * add 还款详情表
     *
     * @param fields
     * @return
     */
    public static Paragraph addTable(Fields fields) {
        // test data
//        RepaymentMonthly repaymentMonthly = new RepaymentMonthly();
//        repaymentMonthly.amount = "人民币10000元";
//        repaymentMonthly.interestAmount = "人民币10元";
//        repaymentMonthly.repayDate = "2013年1月20日";
//
//        fields.repaymentMonthlyList.add(repaymentMonthly);
//
//        // test data
//        repaymentMonthly = new RepaymentMonthly();
//        repaymentMonthly.amount = "人民币10000元";
//        repaymentMonthly.interestAmount = "人民币10元";
//        repaymentMonthly.repayDate = "2013年2月20日";
//
//        fields.repaymentMonthlyList.add(repaymentMonthly);
//
//        // test data
//        repaymentMonthly = new RepaymentMonthly();
//        repaymentMonthly.amount = "人民币10000元";
//        repaymentMonthly.interestAmount = "人民币10元";
//        repaymentMonthly.repayDate = "2013年3月20日";
//
//        fields.repaymentMonthlyList.add(repaymentMonthly);


        // 创建表格对象
        Paragraph ph = new Paragraph();

        PdfPTable t = new PdfPTable(3);

        t.setSpacingBefore(25);

        t.setSpacingAfter(25);

        FontSelector selector = new FontSelector();
        selector.addFont(FontFactory.getFont(FontFactory.TIMES_ROMAN,
                12));
        selector.addFont(FontFactory.getFont("STSongStd-Light",
                "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED));

        PdfPCell c1 = new PdfPCell(selector.process("还款日期"));

        t.addCell(c1);

        PdfPCell c2 = new PdfPCell(selector.process("付息金额"));

        t.addCell(c2);

        PdfPCell c3 = new PdfPCell(selector.process("还款金额"));

        t.addCell(c3);

        for (int i = 0; i < fields.repaymentMonthlyList.size(); i++) {
            RepaymentMonthly repayment = fields.repaymentMonthlyList
                    .get(i);
            t.addCell(selector.process(repayment.repayDate));

            t.addCell(selector.process(repayment.interestAmount));

            t.addCell(selector.process(repayment.amount));
        }
        ph.add(t);
        return ph;
    }

    /**
     * 在pdf文件中添加水印
     *
     * @param inputFile 原始文件
     * @param outputFile 水印输出文件
     * @param waterMarkName 水印名字
     */
    private static void waterMark(PdfReader reader, PdfStamper stamper, int page) {
        try {

            Image image = Image.getInstance("markwarter.png");
            float imageWidth = image.getWidth();
            float imageHeight = image.getHeight();
            PdfContentByte under = stamper.getUnderContent(page);
            Rectangle rectangle = reader.getPageSize(page);
            float h = rectangle.getHeight();
            float w = rectangle.getHeight();

            float dh = (float) ((h - imageHeight * 0.5) / 2);
            image.scalePercent(50);
            image.setAbsolutePosition(0, dh);
            under.addImage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 在pdf文件中添加水印
     *
     * @param inputFile 原始文件
     * @param outputFile 水印输出文件
     * @param waterMarkName 水印名字
     */
    private static void waterMark(String inputFile, String outputFile) {
        try {
            PdfReader reader = new PdfReader(inputFile);
            PdfStamper stamper = new PdfStamper(reader,
                    new FileOutputStream(outputFile));

            int total = reader.getNumberOfPages() + 1;
            Image image = Image.getInstance("markwarter.png");
            float imageWidth = image.getWidth();
            float imageHeight = image.getHeight();
            PdfContentByte under;
            for (int i = 1; i < total; i++) {
                under = stamper.getUnderContent(i);
                // 添加图片
                Rectangle rectangle = reader.getPageSize(i);
                float h = rectangle.getHeight();
                float w = rectangle.getHeight();

                float percentange = w / imageWidth;
                float dh = (float) ((h - imageHeight * 0.5) / 2);
                image.scalePercent(50);
                image.setAbsolutePosition(0, dh);
                under.addImage(image);
            }
            stamper.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * test
     *
     * @param args
     */
    public static void main(String[] args) {
        try {

//           Fields fields = convertToPdfField(no, no, null, null, null, null, AAccountManagerFees, BAccountManagerFees, BRiskFees, null)
            Fields fields = new Fields();
            fields.agreementNo = "xxxxxxxx-xxx-xxxx";
            byte[] out = templateToPdf(new Fields(), "agreement3.pdf");

            FileOutputStream fos = new FileOutputStream(fields.agreementNo + ".pdf");
            fos.write(out);

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
