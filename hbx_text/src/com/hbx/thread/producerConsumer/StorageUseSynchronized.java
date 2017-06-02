package com.hbx.thread.producerConsumer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 10180885 on 16-2-27.
 */
public class StorageUseSynchronized {
    private int capacity;
    List list = new LinkedList<Object>();

    public StorageUseSynchronized(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int num) {
        synchronized (list){
            while(list.size() + num > this.capacity){
                System.out.println("[����]" + capacity + "[����]" + list.size() + "[Ҫ��������]" + num + " ����������");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    list.notifyAll();
                }
            }
            for (int i = 0; i < num; i++) {
                list.add(new Object());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("[����]" + capacity + "[����]" + list.size());
            this.list.notifyAll();
        }
    }

    public int count() {
        return list.size();
    }

    public void consume(int num) {
        synchronized (list){
            while(list.size() - num < 0){
                System.out.println("[����]" + capacity + "[����]" + list.size() + "[Ҫ��������]" + num + " �������ѣ�");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    list.notifyAll();
                }
            }
            for (int i = 0; i < num; i++) {
                list.remove(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("[����]" + capacity + "[����]" + list.size());
            this.list.notifyAll();
        }
    }
}
