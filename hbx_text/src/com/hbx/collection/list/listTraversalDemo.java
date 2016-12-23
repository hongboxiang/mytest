package com.hbx.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 10180885 on 16-02-02.
 */
public class listTraversalDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("¶´Ò¯ºþ");
        list.add("¹â½£");
        traversal1(list);
        traversal2(list);
        System.out.println(list);
    }

    public static void traversal1(List<String> list){
        for(String s : list){
            System.out.println(s + "\t");
        }
    }

    public static void traversal2(List<String> list){
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next() + "\t");
        }
    }

}
