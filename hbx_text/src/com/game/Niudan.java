package com.game;

import java.text.DecimalFormat;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * 类似“优惠券收集”问题,n种扭蛋，收集齐全套扭蛋的期望是多少
 * Created on 2017/12/7
 */
public class Niudan {
    private Equipment equipment;

    public Niudan(Class Typeclass) {
        equipment = new Equipment(Typeclass);
    }

    public double expect() {
        int input = equipment.getTypeNum();
        DecimalFormat df = new DecimalFormat("#.0");
        double result = DoubleStream.iterate(input, item -> item - 1).limit(input).map(n -> input / n).sum();
        return Double.valueOf(df.format(result));
    }
}
