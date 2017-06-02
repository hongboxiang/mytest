package com.hbx.thread.producerConsumer.use_BlockingQueue;

import com.hbx.thread.BlockingQueueWheel;

import java.util.Random;

/**
 * Created by 10180885 on 16-3-5.
 */
public class StorageUseBlockingQueue {
    private int queueSize = 10;
//    private BlockingQueue queue = new ArrayBlockingQueue(queueSize);
    private BlockingQueueWheel queue = new BlockingQueueWheel(queueSize);

    public static void main(String[] args) {
        StorageUseBlockingQueue storageUseBlockingQueue = new StorageUseBlockingQueue();
        new Thread(storageUseBlockingQueue.new Producer()).start();
        new Thread(storageUseBlockingQueue.new Consumer()).start();
    }

    public class Producer implements Runnable{

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            while (true) {
                try {
                    queue.put(1);
                    System.out.println("������в���һ��Ԫ�أ�����ʣ��ռ䣺"+(queueSize-queue.size()));
                    Thread.sleep(new Random().nextInt(10)*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class Consumer implements Runnable{

        @Override
        public void run() {
            consume();
        }

        private void consume() {
            while (true) {
                try {
                    queue.take();
                    System.out.println("�Ӷ���ȡ��һ��Ԫ�أ�����ʣ��"+queue.size()+"��Ԫ��");
                    Thread.sleep(new Random().nextInt(10)*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
