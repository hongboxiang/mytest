package com.LeetCode;

/**
 * 用迭代的方法，判断是不是一个回文字符串，如”abdba”
 * <p/>
 * Created by 10180885 on 15-12-23.
 */
public class AbcbA {
    public static void main(String[] args) {
        String s = "weiiew";
        System.out.println(disploy(s));
    }

    public static boolean disploy(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return disploy(s.substring(1, s.length() - 1));
            }
            else{
                return false;
            }
        }
    }
}
