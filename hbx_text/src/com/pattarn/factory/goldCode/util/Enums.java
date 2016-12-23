package com.pattarn.factory.goldCode.util;

import java.util.Random;

/**
 * Created by 10180885 on 16-1-25.
 */
public class Enums {
    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
