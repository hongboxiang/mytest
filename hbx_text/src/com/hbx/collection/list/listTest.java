package com.hbx.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 10180885 on 2017/2/8.
 */
public class listTest {

    public static void main(String[] args) {
        List<HashMap<Object, Object>> oringal = new ArrayList<>();
        List a = new ArrayList<>();
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("hbx", 1);
        oringal.add(hashMap);
        if(!oringal.isEmpty()) {
            a = oringal;
        }
        System.out.println(a);
    }
}
