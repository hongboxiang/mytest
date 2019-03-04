package com.game;

import com.google.common.base.Enums;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created on 2017/12/7
 */
public class Equipment {
    private final Class equipClass;

    public Equipment(Class equipClass) {
        this.equipClass = equipClass;
    }

    public String niu(){
        Random random = new Random();
        int randomInt = random.nextInt(getTypeNum());
        return equipClass.getEnumConstants()[randomInt].toString();
    }

    public int getTypeNum(){
        return equipClass.getEnumConstants().length;
    }

    public void start(){
        Set<String> dansHaved = new HashSet();
        int times=0;
        for (; dansHaved.size()<getTypeNum()||times>100; times++) {
            String dan = niu();
            dansHaved.add(dan);
            System.out.println(dan);
        }
        System.out.println(times);
    }

    public static void main(String[] args) {
        new Equipment(YinSang.class).start();
    }
}
