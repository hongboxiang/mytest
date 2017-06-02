package com.hbx.file;

/**
 * Created by 10180885 on 15-8-18.
 */
public class C2 {
    String sss;
    public static void main(String[] args){
        
        System.out.println("sss" + new C2().sss);
        C2.m1("a");
        C2.m1("a", "b","c");
        C2.m2(1.22);
        C2.m2(12.33, 6.58);
    }

    //²»¶¨²Î
    public static void m1(String... pram){
        for (int i = 0; i < pram.length; i++) {
            System.out.println(pram[i]);
        }
        System.out.println(pram);
    }
    public static void m2(double... pram){
        System.out.println(pram);
    }
}
