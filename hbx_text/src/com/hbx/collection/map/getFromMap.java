package com.hbx.collection.map;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 10180885 on 2016/11/4.
 */
public class getFromMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "hbx");
        String shouldNull = map.get("2");
        System.out.println(shouldNull);
    }
}
