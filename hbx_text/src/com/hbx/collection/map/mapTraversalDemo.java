package com.hbx.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 10180885 on 16-2-2.
 */
public class mapTraversalDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","吕布");
        map.put("2", "关羽");
        map.put("3", "张飞");
        traversal1(map);
        traversal2(map);
    }

    /*Map类提供了一个称为entrySet()的方法，这个方法返回一个Map.Entry实例化后的对象集。
接着，Map.Entry类提供了一个getKey()方法和一个getValue()方法，因此，上面的代码可以被组织得更符合逻辑*/

    public static void traversal1(Map<String, String> map){
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            System.out.println("key= " + entry.getKey());
            System.out.println("value= " + entry.getValue());
        }
    }

    public static void traversal2(Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey());
            System.out.println("value= " + entry.getValue());
        }
    }
}
