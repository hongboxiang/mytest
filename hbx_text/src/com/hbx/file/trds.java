package com.hbx.file;

/**
 * Created by 10180885 on 2017/5/15.
 */
public class trds {
    public static void main(String[] args) {
        String[] sectionrange = {"..333"};
        int seprateIndex = sectionrange[0].indexOf("..");
        if (seprateIndex == 0) {
        }
        System.out.println(seprateIndex);
        String minValue = sectionrange[0].substring(1, -2);
    }
}
