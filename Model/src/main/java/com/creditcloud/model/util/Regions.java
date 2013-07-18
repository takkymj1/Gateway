/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import com.creditcloud.model.BaseObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Regions {

    private static final ArrayList _regions = new ArrayList();

    private static final HashMap<String, String> _regionMap = new HashMap(30000);

    private static final HashMap<String, ArrayList<Regions.Entry>> _regionList = new HashMap(30000);

    private static final String filename = "target/classes/com/creditcloud/model/util/region.txt";

    static {

        File file1 = new File(".");
        System.out.println(file1.toString());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getName());
        
        
        
        File file = new File(filename);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String tempString = sc.nextLine();
                if(! "".equals(tempString.trim()))
                    _regions.add(tempString.split("\t"));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Regions.class.getName()).log(Level.SEVERE, null, ex);
        }

        Iterator ite = _regions.iterator();
        while (ite.hasNext()) {
            String[] region = (String[]) ite.next();
            String o = _regionMap.put(region[0], region[1]);
            //level 0
            if (Integer.valueOf(region[0]).intValue() % 10000 == 0) {
                int k = 0;
                int id = Integer.valueOf(region[0]).intValue() / 10000;
                ArrayList<Regions.Entry> regionList = _regionList.get(String.valueOf(k));
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
                ArrayList<Regions.Entry> regionList = _regionList.get(String.valueOf(k));
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
                ArrayList<Regions.Entry> regionList = _regionList.get(String.valueOf(k));
                if (regionList == null) {
                    _regionList.put(String.valueOf(k), new ArrayList(Arrays.asList(new Regions.Entry(String.valueOf(id), region[1]))));
                } else {
                    regionList.add(new Regions.Entry(String.valueOf(k), region[1]));
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
            return this._code;
        }

        public String getRegion() {
            return this._region;
        }
    }

    public static HashMap<String, String> getRegionMap() {
        return _regionMap;
    }

    public static ArrayList<Regions.Entry> getRegionList(String id) {
        return _regionList.get(id);
    }
}
