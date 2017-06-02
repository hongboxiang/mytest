package com.hbx.collection.list;

import org.jdom.Element;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 10180885 on 2017/2/8.
 */
public class listTest {

//    public static void main(String[] args) {
//        Integer a = 1000, b = 1000;
//        System.out.println(a == b);//1
//        Integer c = 100, d = 100;
//        System.out.println(c == d);//2
//
//    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Class cache = Integer.class.getDeclaredClasses()[0]; //1
        Field myCache = cache.getDeclaredField("cache"); //2
        myCache.setAccessible(true);//3

        Integer[] newCache = (Integer[]) myCache.get(cache); //4
        newCache[132] = newCache[133]; //5

        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //
    }
}
