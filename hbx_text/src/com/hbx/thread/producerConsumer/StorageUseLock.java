package com.hbx.thread.producerConsumer;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 10180885 on 16-3-2.
 */
public class StorageUseLock { // 仓库最大存储量
    // 仓库最大存储量
    private final int MAX_SIZE = 100;
    private final int capacity;

    // 仓库存储的载体
    private LinkedList<Object> list = new LinkedList<Object>();

    // 锁
    private final Lock lock = new ReentrantLock();

    // 仓库满的条件变量
    private final Condition full = lock.newCondition();

    // 仓库空的条件变量
    private final Condition empty = lock.newCondition();

    public StorageUseLock(int capacity) {
        {
            this.capacity = capacity;
        }
    }

    // 生产num个产品
    public void produce(int num) {
        // 获得锁
        lock.lock();

        // 如果仓库剩余容量不足
        while (list.size() + num > capacity) {
            System.out.print("【要生产的产品数量】:" + num);
            System.out.println(" 【库存量】:" + list.size() + " 暂时不能执行生产任务!");

            try {
                // 由于条件不满足，生产阻塞
                full.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 生产条件满足情况下，生产num个产品
        for (int i = 1; i <= num; ++i) {
            list.add(new Object());
        }

        System.out.print("【已经生产产品数】:" + num);
        System.out.println(" 【现仓储量为】:" + list.size());

        // 唤醒其他所有线程
        full.signalAll();
        empty.signalAll();

        // 释放锁
        lock.unlock();
    }

    // 消费num个产品
    public void consume(int num) {
        // 获得锁
        lock.lock();

        // 如果仓库存储量不足
        while (list.size() < num) {
            System.out.print("【要消费的产品数量】:" + num);
            System.out.println(" 【库存量】:" + list.size() + " 暂时不能执行生产任务!");

            try {
                // 由于条件不满足，消费阻塞
                empty.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 消费条件满足情况下，消费num个产品
        for (int i = 1; i <= num; ++i) {
            list.remove();
        }

        System.out.print("【已经消费产品数】:" + num);
        System.out.println(" 【现仓储)量为】:" + list.size());

        // 唤醒其他所有线程
        full.signalAll();
        empty.signalAll();

        // 释放锁
        lock.unlock();
    }

    // set/get方法
    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public LinkedList<Object> getList() {
        return list;
    }

    public void setList(LinkedList<Object> list) {
        this.list = list;
    }
}
