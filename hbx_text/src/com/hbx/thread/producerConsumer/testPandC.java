package com.hbx.thread.producerConsumer;

/**
 * Created by 10180885 on 16-2-27.
 */
public class testPandC {
    public static void main(String[] args) {
        useSychronized();
    }

    public static void useSychronized(){
        StorageUseSynchronized storage = new StorageUseSynchronized(100);
        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);
        producer.setNum(20);
        consumer.setNum(10);
        new Thread(producer).start();
        new Thread(consumer).start();
    }

}
