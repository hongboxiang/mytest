package com.hbx.thread.producerConsumer;

/**
 * Created by 10180885 on 16-2-27.
 */
public class Producer implements Runnable{
    private StorageUseSynchronized storage;
    private int num = 1;
    private long startTime;

    public Producer(StorageUseSynchronized storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        while(System.currentTimeMillis() - startTime < 100000) {
            produce(num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void produce(int num) {
        this.storage.produce(num);
    }

    public void setNum(int num) {
        this.num = num;
    }
}
