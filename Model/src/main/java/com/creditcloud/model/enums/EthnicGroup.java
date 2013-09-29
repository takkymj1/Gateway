/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 五十六个民族,五十六朵花
 *
 * @author rooseek
 */
public enum EthnicGroup implements BaseEnum {

    Han("汉族"),
    Zhuang("壮族"),
    Manchu("满族"),
    Hui("回族"),
    Miao("苗族"),
    Uighur("维吾尔族"),
    Yi("彝族"),
    Tujia("土家族"),
    Mongol("蒙古族"),
    Tibetan("藏族"),
    Buyi("布依族"),
    Dong("侗族"),
    Yao("瑶族"),
    Korean("朝鲜族"),
    Bai("白族"),
    Hani("哈尼族"),
    Li("黎族"),
    Kazakh("哈萨克族"),
    Dai("傣族"),
    She("畲族"),
    Lisu("僳僳族"),
    Gelao("仡佬族"),
    Lahu("拉祜族"),
    Dongxiang("东乡族"),
    Wa("佤族"),
    Shui("水族"),
    Naxi("纳西族"),
    Qiang("羌族"),
    Du("土族"),
    Xibe("锡伯族"),
    Mulam("仫佬族"),
    Kirghiz("柯尔克孜族"),
    Daur("达斡尔族"),
    Jingpo("景颇族"),
    Salar("撒拉族"),
    Blang("布朗族"),
    Maonan("毛南族"),
    Tajik("塔吉克族"),
    Pumi("普米族"),
    Achang("阿昌族"),
    Nu("怒族"),
    Evenki("鄂温克族"),
    Gin("京族"),
    Jino("基诺族"),
    Deang("德昂族"),
    Uzbek("乌孜别克族"),
    Russian("俄罗斯族"),
    Yugur("裕固族"),
    Bonan("保安族"),
    Menba("门巴族"),
    Oroqin("鄂伦春族"),
    Drung("独龙族"),
    Tatar("塔塔尔族"),
    Hezhen("赫哲族"),
    Lhoba("珞巴族"),
    Gaoshan("高山族");

    private final String key;

    private EthnicGroup(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}