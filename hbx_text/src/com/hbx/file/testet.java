package com.hbx.file;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * Created by 10180885 on 16-2-4.
 */
public class testet {
    public static int a = 0;

    public static void main(String[] args) {
        String.valueOf(null);
        System.out.println("ss");
    }

    void method(String a) {
        if (a.equals(null)) {
            System.out.println();
        }
    }
}
