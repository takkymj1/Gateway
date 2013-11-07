package com.creditcloud.model.enums.misc;

import com.creditcloud.model.enums.BaseEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author suetming (suetming.ma@creditcloud.com)
 *
 * 创建时间：2013-11-7 下午1:24:03
 *
 */
public enum City implements BaseEnum {

    /**
     * 北京
     */
    北京("1100", Province.北京),
    /**
     * 天津
     */
    天津("1200", Province.天津),
    /**
     * 河北
     */
    石家庄("1301", Province.河北),
    保定("1302", Province.河北),
    沧州("1303", Province.河北),
    承德("1304", Province.河北),
    邯郸("1305", Province.河北),
    衡水("1306", Province.河北),
    廊坊("1307", Province.河北),
    秦皇岛("1308", Province.河北),
    唐山("1309", Province.河北),
    邢台("1310", Province.河北),
    张家口("1311", Province.河北),
    /*
     * 山西 0014
     */
    太原("1401", Province.山西),
    长治("1402", Province.山西),
    大同("1403", Province.山西),
    晋城("1404", Province.山西),
    离石("1405", Province.山西),
    临汾("1406", Province.山西),
    朔州("1407", Province.山西),
    忻州("1408", Province.山西),
    阳泉("1409", Province.山西),
    榆次("1410", Province.山西),
    运城("1411", Province.山西),
    晋中("1412", Province.山西),
    吕梁("1413", Province.山西),
    /**
     * 内蒙古 0015
     */
    呼和浩特("1501", Province.内蒙古),
    包头("1502", Province.内蒙古),
    阿拉善("1503", Province.内蒙古),
    巴彦淖尔("1504", Province.内蒙古),
    赤峰("1505", Province.内蒙古),
    呼伦贝尔("1506", Province.内蒙古),
    乌海("1507", Province.内蒙古),
    乌兰察布("1508", Province.内蒙古),
    锡林郭勒("1509", Province.内蒙古),
    兴安("1510", Province.内蒙古),
    鄂尔多斯("1511", Province.内蒙古),
    通辽("1512", Province.内蒙古),
    /**
     * 辽宁 0021
     */
    沈阳("2101", Province.辽宁),
    大连("2102", Province.辽宁),
    鞍山("2103", Province.辽宁),
    本溪("2104", Province.辽宁),
    朝阳("2105", Province.辽宁),
    丹东("2106", Province.辽宁),
    抚顺("2107", Province.辽宁),
    阜新("2108", Province.辽宁),
    葫芦岛("2109", Province.辽宁),
    锦州("2110", Province.辽宁),
    辽阳("2111", Province.辽宁),
    盘锦("2112", Province.辽宁),
    铁岭("2113", Province.辽宁),
    营口("2114", Province.辽宁),
    /*
     * 吉林
     */
    长春("2201", Province.吉林),
    白城("2202", Province.吉林),
    白山("2203", Province.吉林),
    吉林("2204", Province.吉林),
    辽源("2205", Province.吉林),
    四平("2206", Province.吉林),
    松原("2207", Province.吉林),
    通化("2208", Province.吉林),
    延边("2209", Province.吉林),
    /**
     * 黑龙江 0023
     */
    哈尔滨("2301", Province.黑龙江),
    大庆("2302", Province.黑龙江),
    大兴安岭("2303", Province.黑龙江),
    鹤岗("2304", Province.黑龙江),
    黑河("2305", Province.黑龙江),
    鸡西("2306", Province.黑龙江),
    佳木斯("2307", Province.黑龙江),
    牡丹江("2308", Province.黑龙江),
    七台河("2309", Province.黑龙江),
    齐齐哈尔("2310", Province.黑龙江),
    双鸭山("2311", Province.黑龙江),
    绥化("2312", Province.黑龙江),
    伊春("2313", Province.黑龙江),
    /*
     * 0031 上海 
     */
    上海("3100", Province.上海),
    /**
     * 0032 江苏
     */
    南京("3201", Province.江苏),
    常州("3202", Province.江苏),
    淮安("3203", Province.江苏),
    连云港("3204", Province.江苏),
    南通("3205", Province.江苏),
    苏州("3206", Province.江苏),
    宿迁("3207", Province.江苏),
    泰州("3208", Province.江苏),
    无锡("3209", Province.江苏),
    徐州("3210", Province.江苏),
    盐城("3211", Province.江苏),
    扬州("3212", Province.江苏),
    镇江("3213", Province.江苏),
    胥浦("3214", Province.江苏),
    /*
     * 浙江 0033
     */
    杭州("3301", Province.浙江),
    宁波("3302", Province.浙江),
    湖州("3303", Province.浙江),
    嘉兴("3304", Province.浙江),
    金华("3305", Province.浙江),
    绍兴("3306", Province.浙江),
    台州("3307", Province.浙江),
    温州("3308", Province.浙江),
    舟山("3309", Province.浙江),
    衢州("3310", Province.浙江),
    丽水("3311", Province.浙江),
    /**
     * 安徽 0034
     */
    合肥("3401", Province.安徽),
    安庆("3402", Province.安徽),
    蚌埠("3403", Province.安徽),
    巢湖("3404", Province.安徽),
    池州("3405", Province.安徽),
    滁州("3406", Province.安徽),
    阜阳("3407", Province.安徽),
    淮北("3408", Province.安徽),
    淮南("3409", Province.安徽),
    黄山("3410", Province.安徽),
    六安("3411", Province.安徽),
    马鞍山("3412", Province.安徽),
    铜陵("3414", Province.安徽),
    芜湖("3415", Province.安徽),
    宣城("3416", Province.安徽),
    亳州("3417", Province.安徽),
    宿州("3418", Province.安徽),
    /**
     * 0035 福建
     */
    福州("3501", Province.福建),
    厦门("3501", Province.福建),
    龙岩("3501", Province.福建),
    南平("3501", Province.福建),
    宁德("3501", Province.福建),
    莆田("3501", Province.福建),
    泉州("3501", Province.福建),
    三明("3501", Province.福建),
    漳州("3501", Province.福建),
    /**
     * 0036 江西
     */
    南昌("3601", Province.江西),
    抚州("3602", Province.江西),
    赣州("3603", Province.江西),
    吉安("3604", Province.江西),
    景德镇("3605", Province.江西),
    九江("3606", Province.江西),
    萍乡("3607", Province.江西),
    上饶("3608", Province.江西),
    新余("3609", Province.江西),
    宜春("3610", Province.江西),
    鹰潭("3611", Province.江西),
    /**
     * 山东 0037
     */
    济南("3701", Province.山东),
    青岛("3702", Province.山东),
    滨州("3703", Province.山东),
    德州("3704", Province.山东),
    东营("3705", Province.山东),
    菏泽("3706", Province.山东),
    济宁("3707", Province.山东),
    莱芜("3708", Province.山东),
    聊城("3709", Province.山东),
    临沂("3710", Province.山东),
    日照("3711", Province.山东),
    泰安("3712", Province.山东),
    威海("3713", Province.山东),
    潍坊("3714", Province.山东),
    烟台("3715", Province.山东),
    枣庄("3716", Province.山东),
    淄博("3717", Province.山东),
    /**
     * 0041 河南 ￼
     */
    郑州("4101", Province.河南),
    安阳("4102", Province.河南),
    焦作("4103", Province.河南),
    鹤壁("4104", Province.河南),
    开封("4105", Province.河南),
    洛阳("4106", Province.河南),
    南阳("4107", Province.河南),
    平顶山("4108", Province.河南),
    三门峡("4109", Province.河南),
    商丘("4110", Province.河南),
    新乡("4111", Province.河南),
    信阳("4112", Province.河南),
    许昌("4113", Province.河南),
    周口("4114", Province.河南),
    驻马店("4115", Province.河南),
    漯河("4116", Province.河南),
    濮阳("4117", Province.河南),
    济源("4118", Province.河南),
    /**
     * 湖北 0042
     */
    武汉("4201", Province.湖北),
    鄂州("4202", Province.湖北),
    恩施("4203", Province.湖北),
    黄冈("4204", Province.湖北),
    黄石("4205", Province.湖北),
    荆门("4206", Province.湖北),
    荆州("4207", Province.湖北),
    十堰("4208", Province.湖北),
    随州("4209", Province.湖北),
    咸宁("4210", Province.湖北),
    襄樊("4211", Province.湖北),
    孝感("4212", Province.湖北),
    神农架("4213", Province.湖北),
    天门("4214", Province.湖北),
    宜昌("4215", Province.湖北),
    三峡("4216", Province.湖北),
    /**
     * 湖南 0043
     */
    长沙("4301", Province.湖南),
    常德("4302", Province.湖南),
    郴州("4303", Province.湖南),
    衡阳("4304", Province.湖南),
    怀化("4305", Province.湖南),
    娄底("4306", Province.湖南),
    邵阳("4307", Province.湖南),
    湘潭("4308", Province.湖南),
    湘西("4309", Province.湖南),
    益阳("4310", Province.湖南),
    永州("4311", Province.湖南),
    岳阳("4312", Province.湖南),
    张家界("4313", Province.湖南),
    株洲("4314", Province.湖南),
    /**
     * 0044 广东
     */
    广州("4401", Province.广东),
    深圳("4402", Province.广东),
    潮州("4403", Province.广东),
    东莞("4404", Province.广东),
    佛山("4405", Province.广东),
    惠州("4406", Province.广东),
    江门("4407", Province.广东),
    揭阳("4408", Province.广东),
    茂名("4409", Province.广东),
    梅州("4410", Province.广东),
    清远("4411", Province.广东),
    汕头("4412", Province.广东),
    汕尾("4413", Province.广东),
    韶关("4414", Province.广东),
    阳江("4415", Province.广东),
    云浮("4416", Province.广东),
    湛江("4417", Province.广东),
    肇庆("4418", Province.广东),
    中山("4419", Province.广东),
    河源("4420", Province.广东),
    珠海("4420", Province.广东),
    /**
     * 广西 0045
     */
    南宁("4501", Province.广西),
    百色("4502", Province.广西),
    北海("4503", Province.广西),
    桂林("4504", Province.广西),
    河池("4505", Province.广西),
    柳州("4506", Province.广西),
    梧州("4507", Province.广西),
    玉林("4508", Province.广西),
    崇左("4509", Province.广西),
    防城港("4510", Province.广西),
    贵港("4511", Province.广西),
    贺州("4512", Province.广西),
    来宾("4513", Province.广西),
    钦州("4514", Province.广西),
    /**
     * 海南 0046
     */
    海口("4601", Province.海南),
    三亚("4602", Province.海南),
    白沙("4603", Province.海南),
    保亭("4604", Province.海南),
    昌江("4605", Province.海南),
    澄迈("4606", Province.海南),
    儋州("4607", Province.海南),
    定安("4608", Province.海南),
    东方("4609", Province.海南),
    乐东("4610", Province.海南),
    临高("4611", Province.海南),
    陵水("4612", Province.海南),
    琼海("4613", Province.海南),
    琼中("4614", Province.海南),
    屯昌("4615", Province.海南),
    万宁("4616", Province.海南),
    文昌("4617", Province.海南),
    五指山("4618", Province.海南),
    洋浦("4619", Province.海南),
    /**
     * 重庆 0050
     */
    重庆("5000", Province.重庆),
    /**
     * 四川 0051
     */
    成都("5101", Province.四川),
    巴中("5102", Province.四川),
    达州("5103", Province.四川),
    德阳("5104", Province.四川),
    广安("5105", Province.四川),
    广元("5106", Province.四川),
    乐山("5107", Province.四川),
    凉山("5108", Province.四川),
    眉山("5109", Province.四川),
    绵阳("5110", Province.四川),
    南充("5111", Province.四川),
    内江("5112", Province.四川),
    攀枝花("5113", Province.四川),
    遂宁("5114", Province.四川),
    雅安("5115", Province.四川),
    宜宾("5116", Province.四川),
    自贡("5117", Province.四川),
    泸州("5118", Province.四川),
    阿坝("5119", Province.四川),
    甘孜("5120", Province.四川),
    资阳("5121", Province.四川),
    /**
     * 贵州 0052
     */
    贵阳("5201", Province.贵州),
    安顺("5202", Province.贵州),
    毕节("5203", Province.贵州),
    六盘水("5204", Province.贵州),
    铜仁("5205", Province.贵州),
    遵义("5206", Province.贵州),
    黔东南("5207", Province.贵州),
    黔南("5208", Province.贵州),
    黔西南("5209", Province.贵州),
    /**
     * 0053 云南
     */
    昆明("5301", Province.云南),
    西双版纳("5302", Province.云南),
    保山("5303", Province.云南),
    楚雄("5304", Province.云南),
    大理("5305", Province.云南),
    德宏("5306", Province.云南),
    红河("5307", Province.云南),
    丽江("5308", Province.云南),
    临沧("5309", Province.云南),
    怒江("5310", Province.云南),
    曲靖("5311", Province.云南),
    思茅("5312", Province.云南),
    文山("5313", Province.云南),
    玉溪("5314", Province.云南),
    昭通("5315", Province.云南),
    中甸("5316", Province.云南),
    迪庆州("5317", Province.云南),
    /**
     * 西藏 0054
     */
    拉萨("5401", Province.西藏),
    阿里("5402", Province.西藏),
    昌都("5403", Province.西藏),
    林芝("5404", Province.西藏),
    那曲("5405", Province.西藏),
    日喀则("5406", Province.西藏),
    山南("5407", Province.西藏),
    /**
     * 陕西 0061
     */
    西安("6101", Province.陕西),
    安康("6102", Province.陕西),
    宝鸡("6103", Province.陕西),
    汉中("6104", Province.陕西),
    商洛("6105", Province.陕西),
    铜川("6106", Province.陕西),
    渭南("6107", Province.陕西),
    咸阳("6108", Province.陕西),
    延安("6109", Province.陕西),
    榆林("6110", Province.陕西),
    /**
     * 甘肃 0062
     */
    兰州("6201", Province.甘肃),
    白银("6202", Province.甘肃),
    定西("6203", Province.甘肃),
    东风("6204", Province.甘肃),
    合作("6205", Province.甘肃),
    嘉峪关("6206", Province.甘肃),
    金昌("6207", Province.甘肃),
    酒泉("6208", Province.甘肃),
    矿区("6209", Province.甘肃),
    临夏("6210", Province.甘肃),
    陇南("6211", Province.甘肃),
    平凉("6212", Province.甘肃),
    庆阳("6213", Province.甘肃),
    天水("6214", Province.甘肃),
    武威("6215", Province.甘肃),
    张掖("6216", Province.甘肃),
    甘南州("6217", Province.甘肃),
    /**
     * 0063 青海 0063 青海
     */
    西宁("6301", Province.青海),
    海东("6302", Province.青海),
    /**
     * 0064 宁夏 6401 银川
     */
    银川("6401", Province.宁夏),
    中卫("6402", Province.宁夏),
    固原("6403", Province.宁夏),
    石嘴山("6404", Province.宁夏),
    吴忠("6405", Province.宁夏),
    /**
     * 新疆 0065
     */
    乌鲁木齐("6501", Province.新疆),
    阿克苏("6502", Province.新疆),
    阿勒泰("6503", Province.新疆),
    巴州("6504", Province.新疆),
    博州("6505", Province.新疆),
    昌吉("6506", Province.新疆),
    哈密("6507", Province.新疆),
    和田("6508", Province.新疆),
    喀什("6509", Province.新疆),
    克拉玛依("6510", Province.新疆),
    马兰("6511", Province.新疆),
    石河子("6512", Province.新疆),
    塔城("6513", Province.新疆),
    吐鲁番("6514", Province.新疆),
    伊犁("6515", Province.新疆),
    克州("6516", Province.新疆),
    阿拉尔("6517", Province.新疆),
    五家渠("6518", Province.新疆),
    /**
     * 香港 2001
     */
    香港("9901", Province.香港),
    澳门("9902", Province.澳门),
    台湾("9903", Province.台湾);
    private final String key;
    private final Province province;
    private static final HashMap<Province, List<City>> districtMap = new HashMap<Province, List<City>>();

    static {
        for (Province province : Province.values()) {
            districtMap.put(province, new ArrayList<City>());
        }

        for (City city : City.values()) {
            districtMap.get(city.getProvince()).add(city);
        }
    }

    private City(String key, Province province) {
        this.key = key;
        this.province = province;
    }

    @Override
    public String getKey() {
        return key;
    }

    public Province getProvince() {
        return province;
    }

    /**
     * list related proof type by certificate type
     *
     * @param type
     * @return
     */
    public List<City> listByProvince(Province province) {
        return districtMap.get(province);
    }
}
