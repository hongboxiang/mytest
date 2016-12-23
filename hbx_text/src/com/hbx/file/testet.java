package com.hbx.file;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 10180885 on 16-2-4.
 */
public class testet {
    public static int a = 0;

    public static void main(String[] args) {
        int b = 0;
        change(b);
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
        List<String> list = new ArrayList<String>();
        list = getList(list);
        list.add("hbx");

    }

    public static void change(int a){
        a = 5;
    }

    public static List getList(final List list) {
        return (List) Proxy.newProxyInstance(Proxy.class.getClassLoader(), new Class[]{List.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("add".equals(method.getName())) {
                            throw new UnsupportedOperationException();
                        } else {
                            return method.invoke(list, args);
                        }
                    }
                }
        );
    }
}
