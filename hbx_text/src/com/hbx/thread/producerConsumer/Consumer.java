package com.hbx.thread.producerConsumer;

/**
 * Created by 10180885 on 16-2-27.
 */
public class Consumer implements Runnable{
    private StorageUseSynchronized storage;

    private int num;
    private long startTime;

    public Consumer(StorageUseSynchronized storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        while(System.currentTimeMillis() - startTime < 100000) {
            consume(num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consume(int num) {
        this.storage.consume(num);
    }

    public void setNum(int num) {
        this.num = num;
    }
}
