package com.hbx.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by 10180885 on 16-2-2.
 */
public class setTraversalDemo {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<String>();
        String a = "a";
        String b = "a";
        stringSet.add(a);
        stringSet.add(b);
        Iterator<String> iterator = stringSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
