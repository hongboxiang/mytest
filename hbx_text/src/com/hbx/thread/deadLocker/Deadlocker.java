package com.hbx.thread.deadLocker;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 10180885 on 16-3-5.
 */
public class Deadlocker implements Runnable {
    public int flag = 1;
    private static Lock lock = new ReentrantLock();

    public boolean checkLock() {
        return lock.tryLock();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println("flag=" + flag);
                if (flag == 1) {
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println("1");
                }
                if (flag == 0) {
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("0");
                }
            } finally {
                lock.unlock();
            }
        }
        else{
            System.out.println("can not in");
        }
    }

    public static void main(String[] args) {
        Deadlocker td1 = new Deadlocker();
        Deadlocker td2 = new Deadlocker();
        td1.flag = 1;
        td2.flag = 0;
        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        t1.start();
        t2.start();
    }
}
