/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import com.creditcloud.model.BaseObject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Regions {

    private static final ArrayList _regions = new ArrayList();

    private static final Map<String, String> _regionMap = new HashMap<>(30000);

    private static final Map<String, List<Regions.Entry>> _regionList = new HashMap<>(30000);

    private static final String filename = "region.txt";

    static {
        InputStream is = Regions.class.getClassLoader().getResourceAsStream(filename);
        
        try (Scanner sc = new Scanner(is)) {
            while (sc.hasNext()) {
                String tempString = sc.nextLine();
                if(! "".equals(tempString.trim()))
                    _regions.add(tempString.split("\t"));
            }
        } 

        Iterator ite = _regions.iterator();
        while (ite.hasNext()) {
            String[] region = (String[]) ite.next();
            String o = _regionMap.put(region[0], region[1]);
            //level 0
            if (Integer.valueOf(region[0]).intValue() % 10000 == 0) {
                int k = 0;
                int id = Integer.valueOf(region[0]).intValue() / 10000;
                List<Regions.Entry> regionList = _regionList.get(String.valueOf(k));
                if (regionList == null) {
                    _regionList.put(String.valueOf(k), new ArrayList(Arrays.asList(new Regions.Entry(String.valueOf(id), region[1]))));
                } else {
                    regionList.add(new Regions.Entry(String.valueOf(id), region[1]));
                }
            }
            //level 1
            if (Integer.valueOf(region[0]).intValue() % 10000 != 0 && Integer.valueOf(region[0]).intValue() % 100 == 0) {
                int k = Integer.valueOf(region[0]).intValue() / 10000;
                int id = Integer.valueOf(region[0]).intValue() / 100;
                List<Regions.Entry> regionList = _regionList.get(String.valueOf(k));
                if (regionList == null) {
                    _regionList.put(String.valueOf(k), new ArrayList(Arrays.asList(new Regions.Entry(String.valueOf(id), region[1]))));
                } else {
                    regionList.add(new Regions.Entry(String.valueOf(id), region[1]));
                }
            }

            //level 2
            if (Integer.valueOf(region[0]).intValue() % 100 != 0) {
                int k = Integer.valueOf(region[0]).intValue() / 100;
                int id = Integer.valueOf(region[0]).intValue();
                List<Regions.Entry> regionList = _regionList.get(String.valueOf(k));
                if (regionList == null) {
                    _regionList.put(String.valueOf(k), new ArrayList(Arrays.asList(new Regions.Entry(String.valueOf(id), region[1]))));
                } else {
                    regionList.add(new Regions.Entry(String.valueOf(id), region[1]));
                }
            }
        }
    }

    public static class Entry extends BaseObject {

        private String _code;

        private String _region;

        public Entry(String code, String region) {
            _code = code;
            _region = region;
        }

        public String getCode() {
            return _code;        }

        public String getRegion() {
            return _region;
        }
    }

    public static Map<String, String> getRegionMap() {
        return _regionMap;
    }

    public static List<Regions.Entry> getRegionList(String id) {
        return _regionList.get(id);
    }
}
