package com.hbx.thread.printABAB.use_Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 10180885 on 16-2-27.
 */
public class PrintABAB2 {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new Producer2(lock)).start();
        new Thread(new Consumer2(lock)).start();
    }
}
