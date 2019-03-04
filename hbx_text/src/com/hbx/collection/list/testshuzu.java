package com.hbx.collection.list;

import java.security.SecureRandom;

/**
 * Created on 2017/10/31
 */
public class testshuzu {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.nextInt());
    }

    public static String calBestPrice(String newValue) {
        newValue = newValue.replaceAll("0+$", "");
        newValue = newValue.replaceAll("\\.$", "");
        return newValue;
    }
}
