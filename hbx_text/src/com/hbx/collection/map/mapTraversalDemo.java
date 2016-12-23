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
        map.put("1","����");
        map.put("2", "����");
        map.put("3", "�ŷ�");
        traversal1(map);
        traversal2(map);
    }

    /*Map���ṩ��һ����ΪentrySet()�ķ����������������һ��Map.Entryʵ������Ķ��󼯡�
���ţ�Map.Entry���ṩ��һ��getKey()������һ��getValue()��������ˣ�����Ĵ�����Ա���֯�ø������߼�*/

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
