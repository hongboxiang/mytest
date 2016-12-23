package com.hbx.projectpara;

import java.io.IOException;

/**
 * Created by 10180885 on 16-1-4.
 */
public class test00 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("01"));
        String[] cmd = new String[]{"cmd.exe", "/C", "wmic process get name" };
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
