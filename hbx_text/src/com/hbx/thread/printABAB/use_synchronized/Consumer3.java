package com.hbx.thread.printABAB.use_synchronized;

/**
 * Created by 10180885 on 16-2-27.
 */
public class Consumer3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (PrintABAB.obj) {
                System.out.println("----------B----------");
                PrintABAB.obj.notify();
                try {
                    PrintABAB.obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
