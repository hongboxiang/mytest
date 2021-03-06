package com.hbx.thread.printABAB.use_Lock;

import java.util.concurrent.locks.Lock;

/**
 * Created by 10180885 on 16-2-27.
 */
public class Consumer2 implements Runnable {
    private Lock lock;

    public Consumer2(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                lock.lock();
                System.out.println("-----------B------------");
            } finally {
                lock.unlock();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
