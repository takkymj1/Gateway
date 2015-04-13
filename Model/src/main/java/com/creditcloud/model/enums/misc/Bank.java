/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.misc;

import com.creditcloud.model.enums.BaseEnum;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 支持的银行列表, 汇付天下(PNR)和联动优势(UMP)通过属性区分
 *
 * @author sobranie
 */
public enum Bank implements BaseEnum {

    ICBC("中国工商银行", true, true),
    ABC("中国农业银行", true, true),
    CMB("招商银行", true, true),
    CCB("建设银行", true, true),
    BCCB("北京银行", true, "BCCB", true, "BJBANK"),
    BJRCB("北京农村商业银行", true, true),
    BOC("中国银行", true, true),
    BOCOM("交通银行", true, "BOCOM", true, "COMM"),
    CMBC("民生银行", true, true),
    BOS("上海银行", true, "BOS", true, "SHB"),
    CBHB("渤海银行", true, false),
    CEB("光大银行", true, true),
    CIB("兴业银行", true, true),
    CITIC("中信银行", true, true),
    CZB("浙商银行", true, true),
    GDB("广发银行", true, true),
    HKBEA("东亚银行", true, "HKBEA", true, "BEA"),
    HXB("华夏银行", true, true),
    HZCB("杭州银行", true, false),
    NJCB("南京银行", true, true),
    PINGAN("平安银行", true, "PINGAN", true, "SPAB"),
    PSBC("邮政储蓄银行", true, true),
    SDB("深发银行", true, true),
    SPDB("浦发银行", true, true),
    SRCB("上海农村商业银行", true, "SRCB", true, "SHRCB"),
    WZCB("温州银行", false, true),
    //---------NEW ADD FOR UMP----------------
    BSB("包商银行", false, true),
    CSRCB("常熟农村商业银行", false, true),
    CDRCB("成都农村商业银行", false, true),
    BCD("成都市商业银行", false, true),
    CDB("承德银行", false, true),
    DLB("大连银行", false, true),
    DRCB("东莞农村商业银行", false, true),
    DGB("东莞市商业银行", false, true),
    ORBANK("鄂尔多斯银行", false, true),
    SDEB("佛山顺德农村商业银行", false, true),
    FJNXB("福建省农村信用社", false, true),
    FJNX("福建省农村信用社联合社", false, true),
    FDB("富滇银行", false, true),
    GZCCB("赣州银行", false, true),
    ZJCB("广东南粤银行", false, true),
    BOBBG("广西北部湾银行", false, true),
    GRCB("广州农村商业银行", false, true),
    GZCRU("广州农村信用合作社", false, true),
    GCB("广州银行", false, true),
    GYB("贵阳银行", false, true),
    HEBB("哈尔滨银行", false, true),
    HKBC("汉口银行", false, true),
    HBB("湖北银行", false, true),
    HNNXB("湖南省农村信用社联合社", false, true),
    HZCCB("湖州市商业银行", false, true),
    HSB("徽商银行", false, true),
    JSNX("江苏省农村信用社", false, true),
    JSB("江苏银行", false, true),
    JRCB("江阴农村商业银行", false, true),
    JHCCB("金华银行", false, true),
    BOJZ("锦州银行", false, true),
    JJCCB("九江银行", false, true),
    LZB("兰州银行", false, true),
    DAQINGB("龙江银行", false, true),
    NCB("南昌银行", false, true),
    BOIMC("内蒙古银行", false, true),
    NBB("宁波银行", false, true),
    YCCCB("宁夏银行", false, true),
    QLBANK("齐鲁银行", false, true),
    QDCCB("青岛商行", false, true),
    QHYHXH("青海省农村信用社", false, true),
    QHB("青海银行", false, true),
    SXINJ("山西省农村信用社", false, true),
    SQB("商丘商行", false, true),
    SRB("上饶银行", false, true),
    SXCCB("绍兴银行", false, true),
    SJB("盛京银行", false, true),
    SZSCCB("石嘴山银行", false, true),
    TZCB("台州银行", false, true),
    TRCB("天津农村商业银行", false, true),
    TCCB("天津市商业银行", false, true),
    WHSHB("威海市商业银行", false, true),
    WXRCB("无锡农村商业银行", false, true),
    WJRCB("吴江农商行", false, true),
    YNRCC("云南省农村信用社", false, true),
    CSCB("长沙银行", false, true),
    CZCB("浙江稠州商业银行", false, true),
    MTBANK("浙江民泰商业银行", false, true),
    ZJRCC("浙江省农村信用社", false, true),
    ZJTLCB("浙江泰隆商业银行", false, true),
    CRCB("重庆农村商业银行", false, true),
    CQB("重庆银行", false, true),
    CRB("珠海华润银行", false, true),
    AHRCU("安徽省农村信用社", false, true),
    ASHB("安顺市商业银行", false, true),
    AYB("安阳市商业银行", false, true),
    BOAS("鞍山市商业银行", false, true),
    BOBD("保定市商业银行", false, true),
    BOCZ("沧州银行", false, true),
    CYCB("朝阳市商业银行", false, true),
    DZCCB("达州市商业银行", false, true),
    DTCCB("大同市商业银行", false, true),
    DDB("丹东银行", false, true),
    DZB("德州银行", false, true),
    DYCCB("东营市商业银行", false, true),
    FJHXB("福建海峡银行", false, true),
    FSB("抚顺银行", false, true),
    FXB("阜新银行", false, true),
    GSRCU("甘肃省农村信用社", false, true),
    GSB("甘肃银行", false, true),
    GHB("广东华兴银行", false, true),
    GDRCU("广东省农村信用社", false, true),
    GXRCU("广西农村信用社", false, true),
    GZNXB("贵州省农村信用社", false, true),
    GZNXRU("贵州省农村信用社联合社", false, true),
    GLB("桂林银行", false, true),
    HNB("海南省农村信用社联合社", false, true),
    HDCB("邯郸市商业银行", false, true),
    HEBNX("河北省农村信用社", false, true),
    BHB("河北银行股份有限公司", false, true),
    HNNX("河南省农村信用社", false, true),
    HBSB("鹤壁银行", false, true),
    HLJRCC("黑龙江省农村信用社", false, true),
    EGB("恒丰银行", false, true),
    HSMB("衡水市商业银行", false, true),
    HLDB("葫芦岛市商业银行", false, true),
    HBXH("湖北农村信用社", false, true),
    HRXJB("华融湘江银行", false, true),
    BYW("黄河农村商业银行", false, true),
    JLNLS("吉林农信联合社", false, true),
    JLB("吉林市商业银行", false, true),
    JNB("济宁银行", false, true),
    JXCCB("嘉兴市商业银行", false, true),
    JNRCU("江南农村商业银行", false, true),
    CJCCB("江苏长江商业银行", false, true),
    JXNXS("江西农信联合社", false, true),
    JZCB("焦作市商业银行", false, true),
    JCCB("晋城银行", false, true),
    JSHB("晋商银行", false, true),
    JZB("晋中市商业银行", false, true),
    BOFJDZ("景德镇商业银行", false, true),
    XJKCCB("库尔勒市商业银行", false, true),
    KLB("昆仑银行", false, true),
    JSNXB("昆山农信社", false, true),
    LSBC("莱商银行", false, true),
    LCCB("廊坊银行", false, true),
    LSCCB("乐山市商业银行", false, true),
    LSZSH("凉山州商业银行", false, true),
    LNRCC("辽宁省农村信用社", false, true),
    LSB("临沂商业银行", false, true),
    LZHCCB("柳州银行", false, true),
    LPSB("六盘水商行", false, true),
    LZCCB("泸州市商业银行", false, true),
    BOLY("洛阳银行", false, true),
    LHB("漯河商行", false, true),
    MYSYYH("绵阳市商业银行", false, true),
    CGNB("南充市商业银行", false, true),
    NYCB("南阳村镇银行", false, true),
    NMGNXS("内蒙古农村信用社", false, true),
    NBCB("宁波通商银行", false, true),
    PZHCCB("攀枝花市商业银行", false, true),
    PJB("盘锦市商业银行", false, true),
    PDSCB("平顶山银行", false, true),
    PYYH("濮阳银行", false, true),
    QSB("齐商银行", false, true),
    QHDB("秦皇岛市商业银行", false, true),
    QDJMB("青岛即墨北农商村镇银行", false, true),
    QRCB("青岛农信", false, true),
    QJCCB("曲靖市商业银行", false, true),
    QZCCB("泉州市商业银行", false, true),
    BORZ("日照银行", false, true),
    SMXB("三门峡市商业银行", false, true),
    XMCCB("厦门银行", false, true),
    SDNXS("山东省农村信用社", false, true),
    SXNXS("陕西省农村信用社", false, true),
    BARXB("深圳宝安融兴村镇银行", false, true),
    FTYZB("深圳福田银座村镇银行", false, true),
    EDRB("深圳龙岗鼎业村镇银行", false, true),
    SZCRU("深圳市农村商业银行", false, true),
    SCRCU("四川省农村信用社", false, true),
    SZB("苏州市商业银行", false, true),
    SNCCB("遂宁市商业银行", false, true),
    TCRCB("太仓农村商业银行", false, true),
    TACCB("泰安市商业银行", false, true),
    ZJTLCRU("泰隆城市信用社", false, true),
    TSB("唐山市商业银行", false, true),
    TJBHB("天津滨海农村商业银行", false, true),
    BOTL("铁岭市商业银行", false, true),
    WFCCB("潍坊银行", false, true),
    WHCB("乌海银行", false, true),
    URMQCCB("乌鲁木齐市商业银行", false, true),
    WRCB("无锡市商业银行", false, true),
    WHRCB("武汉农信", false, true),
    XAB("西安银行", false, true),
    BOHH("新疆汇和银行", false, true),
    XJCCB("新疆农村信用社", false, true),
    XXSSH("新乡市商业银行", false, true),
    XYCB("信阳银行", false, true),
    XTB("邢台银行", false, true),
    XCCB("许昌市商业银行", false, true),
    YACCB("雅安市商业银行", false, true),
    YTB("烟台商业银行", false, true),
    YQCCB("阳泉市商业银行", false, true),
    YBCCB("宜宾市商业银行", false, true),
    YZB("鄞州银行", false, true),
    BOYK("营口市商业银行", false, true),
    YXCCB("玉溪市商业银行", false, true),
    ZHZB("枣庄银行", false, true),
    ZRCB("张家港农村商业银行", false, true),
    CCABC("长安银行", false, true),
    CZCCB("长治市商业银行", false, true),
    ZJCURB("浙江长兴联合村镇银行", false, true),
    ZZB("郑州银行", false, true),
    ZSXLB("中山小榄村镇银行", false, true),
    CCQTGB("重庆三峡银行", false, true),
    ZKB("周口市商业银行", false, true),
    ZHRCU("珠海农村信用社", false, true),
    ZMDB("驻马店市商业银行", false, true),
    ZGB("自贡市商业银行", false, true),
    ZYB("遵义市商业银行", false, true),
    //未知银行，当根据Code取不到时选用，这里只能防止数据库完整性问题，如需向第三方提交则会有一些问题
    UNKNOWN("未知银行", false, false);

    private static Map<String, Bank> pnrMap;
    private static Map<String, Bank> umpMap;

    private final String key;
    private final boolean pnrSupport;
    private final boolean umpSupport;
    private final String pnrCode;
    private final String umpCode;
    
    private static final List<Bank> rapidBank = Collections.unmodifiableList(Arrays.asList(Bank.valueOf("ICBC"),Bank.valueOf("ABC"),Bank.valueOf("CCB"),Bank.valueOf("BOC"),
                                                                                           Bank.valueOf("CEB"), Bank.valueOf("CIB"),Bank.valueOf("SDB")));

    static {
        Map<String, Bank> thePnrMap = new HashMap<>(Bank.values().length);
        Map<String, Bank> theUmpMap = new HashMap<>(Bank.values().length);
        for (Bank bank : Bank.values()) {
            if (bank.isPnrSupport()) {
                thePnrMap.put(bank.getPnrCode(), bank);
            }
            if (bank.isUmpSupport()) {
                theUmpMap.put(bank.getUmpCode(), bank);
            }
        }
        pnrMap = Collections.unmodifiableMap(thePnrMap);
        umpMap = Collections.unmodifiableMap(theUmpMap);
    }

    /**
     * 构造Bank对象, 分别为UMP和PNR指定代码和支持程度
     *
     * @param key 可视化描述
     * @param supportPNR PNR支持此银行
     * @param pnrCode PNR代码
     * @param supportUMP UMP支持此银行
     * @param umpCode UMP代码
     */
    Bank(String key, boolean pnrSupport, String pnrCode, boolean umpSupport, String umpCode) {
        this.key = key;
        this.pnrSupport = pnrSupport;
        this.umpSupport = umpSupport;
        this.pnrCode = pnrCode;
        this.umpCode = umpCode;
    }

    /**
     * 以name()作为PNR和UMP的代码, 适用于两家代码相同的情况
     *
     * @param key 可视化描述
     * @param pnrSupport PNR支持此银行
     * @param umpSupport UMP支持此银行
     */
    Bank(String key, boolean pnrSupport, boolean umpSupport) {
        this.key = key;
        this.pnrSupport = pnrSupport;
        this.umpSupport = umpSupport;
        this.pnrCode = name();
        this.umpCode = name();
    }

    @Override
    public String getKey() {
        return key;
    }

    /**
     * PNR是否支持该银行
     *
     * @return
     */
    public boolean isPnrSupport() {
        return pnrSupport;
    }

    /**
     * Ump是否支持该银行
     *
     * @return
     */
    public boolean isUmpSupport() {
        return umpSupport;
    }

    /**
     * 获得与PNR通信的代码
     *
     * @return
     */
    public String getPnrCode() {
        return pnrCode;
    }

    /**
     * 获得与UMP通信的代码
     *
     * @return
     */
    public String getUmpCode() {
        return umpCode;
    }

    /**
     * 从PNR代码构造Bank对象
     *
     * @param pnrCode
     * @return 找不到code则返回UNKNOWN
     */
    public static Bank getEnumFromPnrCode(String pnrCode) {
        return pnrMap.containsKey(pnrCode) ? pnrMap.get(pnrCode) : UNKNOWN;
    }

    /**
     * 从UMP代码构造Bank对象
     *
     * @param umpCode
     * @return 找不到code则返回UNKNOWN
     */
    public static Bank getEnumFromUmpCode(String umpCode) {
        return umpMap.containsKey(umpCode) ? umpMap.get(umpCode) : UNKNOWN;
    }

    /**
     * 所有UMP支持的银行列表
     *
     * @return
     */
    public static Collection<Bank> getUmpBanks() {
        return umpMap.values();
    }

    /**
     * 所有PNR支持的银行列表
     *
     * @return
     */
    public static Collection<Bank> getPnrBanks() {
        return pnrMap.values();
    }
    
    /**
     * 获取支持开通快捷协议的银行（暂支持七家）
     *
     * @return
     */
    public static List<Bank> getRapidBank() {
        return rapidBank;
    }
}
