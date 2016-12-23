package com.hbx.thread.producerConsumer;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 10180885 on 16-3-2.
 */
public class StorageUseLock { // �ֿ����洢��
    // �ֿ����洢��
    private final int MAX_SIZE = 100;
    private final int capacity;

    // �ֿ�洢������
    private LinkedList<Object> list = new LinkedList<Object>();

    // ��
    private final Lock lock = new ReentrantLock();

    // �ֿ�������������
    private final Condition full = lock.newCondition();

    // �ֿ�յ���������
    private final Condition empty = lock.newCondition();

    public StorageUseLock(int capacity) {
        {
            this.capacity = capacity;
        }
    }

    // ����num����Ʒ
    public void produce(int num) {
        // �����
        lock.lock();

        // ����ֿ�ʣ����������
        while (list.size() + num > capacity) {
            System.out.print("��Ҫ�����Ĳ�Ʒ������:" + num);
            System.out.println(" ���������:" + list.size() + " ��ʱ����ִ����������!");

            try {
                // �������������㣬��������
                full.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // ����������������£�����num����Ʒ
        for (int i = 1; i <= num; ++i) {
            list.add(new Object());
        }

        System.out.print("���Ѿ�������Ʒ����:" + num);
        System.out.println(" ���ֲִ���Ϊ��:" + list.size());

        // �������������߳�
        full.signalAll();
        empty.signalAll();

        // �ͷ���
        lock.unlock();
    }

    // ����num����Ʒ
    public void consume(int num) {
        // �����
        lock.lock();

        // ����ֿ�洢������
        while (list.size() < num) {
            System.out.print("��Ҫ���ѵĲ�Ʒ������:" + num);
            System.out.println(" ���������:" + list.size() + " ��ʱ����ִ����������!");

            try {
                // �������������㣬��������
                empty.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // ����������������£�����num����Ʒ
        for (int i = 1; i <= num; ++i) {
            list.remove();
        }

        System.out.print("���Ѿ����Ѳ�Ʒ����:" + num);
        System.out.println(" ���ֲִ�)��Ϊ��:" + list.size());

        // �������������߳�
        full.signalAll();
        empty.signalAll();

        // �ͷ���
        lock.unlock();
    }

    // set/get����
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
