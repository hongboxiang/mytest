package com.hbx.thread.printABAB.use_synchronized;

/**
 * Created by 10180885 on 16-2-27.
 */
public class PrintABAB {
    public static Object obj = new Object();

    public static void main(String[] args) {
        new Thread(new Producer3()).start();
        new Thread(new Consumer3()).start();
    }
}
