package com.hbx.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 给一段字符串“a=1, b=2, c=3”,存入Map中
 * Created by 10180885 on 15-12-23.
 */
public class StringToMap {
    public static void main(String[] args) {
        String mapString = "a=1, b=2, c=3";
        Map<String, String> map = transStringToMap(mapString);
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            System.out.println(entry.getKey() + " 是 " + entry.getValue());
        }
    }

    public static Map transStringToMap(String mapString){
        Map map = new HashMap();
        int i = 0;
        String sEqual = "=";
        String comma = ",";
        String[] sSub = mapString.split(comma);
        while(i < sSub.length){
            String[] ss = sSub[i].split(sEqual);
            map.put(ss[0].trim(), ss[1].trim());
            i++;
        }
        return map;
    }
}
